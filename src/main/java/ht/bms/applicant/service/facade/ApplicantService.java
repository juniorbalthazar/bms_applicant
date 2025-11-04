package ht.bms.applicant.service.facade;

import ht.bms.applicant.api.AccountBean;
import ht.bms.applicant.api.ApiAuth;
import ht.bms.applicant.domain.BmsApplicant;
import ht.bms.applicant.domain.BmsSetting;
import ht.bms.applicant.exception.ApplicationException;
import ht.bms.applicant.domain.repo.RetrytableRepo;
import ht.bms.applicant.service.Constants;
import ht.bms.applicant.service.handles.ApplicantHandler;
import ht.bms.applicant.service.mapper.ApplicantMapper;
import ht.bms.applicant.utils.DateHelper;
import jakarta.transaction.Transactional;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.Optional;

@Transactional
@Service
public class ApplicantService {
    private final Logger log = org.slf4j.LoggerFactory.getLogger(ApplicantService.class);

    private final RetrytableRepo repo;
    private final ApplicantMapper mapper;
    private final ApiAuth auth;

    public ApplicantService(RetrytableRepo repo, ApplicantMapper mapper, ApiAuth auth) {
        this.repo = repo;
        this.mapper = mapper;
        this.auth = auth;
    }

    public AccountBean checkAccount(String token) throws ApplicationException {
        return auth.isAUth(token).blockOptional().orElseThrow(()->new ApplicationException("Invalid Account"));
    }

    public int checkActiveNumberTransaction(BigDecimal userId) throws ApplicationException {
        return repo.checkNumberTxProcessByUserId(userId);
    }

    public boolean checkActiveTransaction(String token) throws ApplicationException {
        var account=checkAccount(token);
        BmsSetting setting=repo.getSetting(account.getInstitutionId()).orElseThrow() ;
        int num=checkActiveNumberTransaction(account.getUserId());
        if(setting.getNbreTransPerApplicant()!=null) {
            return num >= setting.getNbreTransPerApplicant().intValue();
        }
        return false;
    }

    public boolean isHaveCitizenParentTransaction(BigDecimal userId) throws ApplicationException {
            Optional<BmsApplicant> exit = repo.isHaveCitizenParentTransaction(userId);
            if (exit.isPresent()) {
                return exit.filter(a -> StringUtils.isNoneBlank(a.getIsCitizen()) && a.getIsCitizen().equals("0")).isPresent();
            }
        return false;
    }

    public Integer isCitizen(String date) {
        if (StringUtils.isNoneBlank(date)) {
            return DateHelper.isMineur(DateHelper.StringToDate(date), DateHelper.toDate())
                    ? Constants.TYPE_MINEUR
                    : Constants.TYPE_CITIZEN;
        }
        return 0;

    }

    public Mono<ApplicantResponse> newApplicantForm(BmsPesonnalBean personal, BigDecimal userId) throws ApplicationException {
        ApplicantResponse message=new ApplicantResponse();
        message.setSuccess(false);

        System.out.println("personal : "+personal);
        System.out.println("userId : "+userId);
        System.out.println("personal.getIsCitizen() : "+personal.getIsCitizen());


        if(personal!=null && userId!=null && personal.getIsCitizen()!=null) {//

            Optional<BmsAccount> account=repo.getAccountsRepository().findBmsAccountByUserId(userId);

            if(account.isPresent()) {
                BigDecimal currentTxId=repo.getTxRepository().checkCurrentTransactionId(userId);
                BigDecimal isSign=repo.getTxRepository().checkFormIsSubmitAndSign(currentTxId);

                if(personal.getIsCitizen().equals(new BigDecimal(Constants.TYPE_CITIZEN))) {
                    if(personal.getApplicantId()==null) {
                        boolean haveTransaction=isHaveCitizenParentTransaction(userId);
                        if(haveTransaction) throw new  BackendServiceException("Une demande pour un adulte est en cours , completer la d'abord") ;
                    }
                }

                else if(personal.getIsCitizen().equals(new BigDecimal(0))  || personal.getIsCitizen().intValue()>2) {
                    throw new  BackendServiceException(" Error::BookingServicesImpl::newApplicantForm {{ IsCitizen value must be 1=Adult or 2=Mineur }}  ") ;
                }


                if(isSign==null) {

                    boolean checkActiveTransaction=checkActiveTransaction(userId);


                    BmsApplicant applicant=null;
                    BigDecimal codeId=null;//GenTools.generedCodeId();
                    BmsCodegen codeGen=new BmsCodegen();
                    BmsApplicantsPesonnal entitySaved=null;
                    BmsApplicantsPesonnal entity=mapper.mapToEntity(personal);





                    if(personal.getApplicantId()==null) {

                        if(checkActiveTransaction==false) {

                            do {codeId=GenTools.generedCodeId();}while(repo.getCodegenRepository().existsByCode(codeId.toString()));
                            codeGen.setCode(codeId.toString());
                            codeGen.setCreateddate(DateHelper.toDate());
                            codeGen=repo.getCodegenRepository().save(codeGen);
                            entity.setApplicantId(codeId);

                            entity.setCreatedDate(DateHelper.toDate());
                            entitySaved=repo.getApplicantsPesonnalRepository().save(entity);




                            if(entitySaved!=null) {

                                applicant=new BmsApplicant();
                                BmsUser bmsUser=new BmsUser();
                                bmsUser.setUserId(userId);
                                applicant.setBmsUser(bmsUser);
                                if(entity.getNationalite()==null) {
                                    if(account.get().getBmsUser()!=null && account.get().getBmsUser().getNationalite()!=null) {
                                        applicant.setNationalite(account.get().getBmsUser().getNationalite());
                                    }


                                }else {
                                    applicant.setNationalite(entity.getNationalite());
                                }

                                applicant.setApplicantId(codeId);
                                applicant.setCreatedDate(DateHelper.toDate());
                                applicant.setPersonnal(entitySaved);


                                if(personal.getIsCitizen().equals(new BigDecimal(Constants.TYPE_CITIZEN))) {
                                    applicant.setCitizen("0");
                                }
                                else if(personal.getIsCitizen().equals(new BigDecimal(Constants.TYPE_MINEUR))) {
                                    applicant.setCitizen("1");
                                }

                                BmsApplicant applicantSaved=repo.getApplicantRepository().save(applicant);



                                if(applicantSaved!=null) {

                                    BmsTx tx=new BmsTx();
                                    BmsTxStatus status=new BmsTxStatus();
                                    BmsTxType type=new BmsTxType();

                                    BmsInstitution institution=getDefaultInstitution();
                                    BmsOffice office=getDefaultOffice();
                                    Optional<BmsOfficeService> officeService=repo
                                            .getOfficeServiceRepository()
                                            .findBmsOfficeServiceByOfficeId(office.getOfficeId());



                                    if(office!=null &&
                                            office.getOfficeId()!=null &&
                                            officeService.isPresent() ) {


                                        tx.setTxId(codeId);
                                        tx.setTxCode(codeId.toString());

                                        tx.setBmsCalendar(null);
                                        tx.setBmsOffice(officeService.get().getBmsOffice());
                                        tx.setBmsService(officeService.get().getBmsService());
                                        tx.setBmsInstitution(institution);
                                        status.setStatusId(new BigDecimal(Constants.TX_STATUS_SAISIE));

                                        tx.setBmsTxStatus(status);

                                        type.setId(new BigDecimal(Constants.TX_TYPE_PERSONAL));
                                        tx.setBmsTxType(type);

                                        tx.setBmsUser(bmsUser);
                                        tx.setBmsApplicant(applicantSaved);
                                        tx.setCertificatDate(null);
                                        tx.setCheckIn(null);
                                        tx.setCheckOut(null);
                                        tx.setCreatedDate(DateHelper.toDate());
                                        tx.setCretedBy(account.get());
                                        tx.setIsCurrent(new BigDecimal(Constants.CURRENT_TRANSACTION));

                                        BmsTx txSaved=repo.getTxRepository().save(tx);
                                        if(txSaved!=null) {
                                            BmsTxProcess process=new BmsTxProcess();//txSaved=repo.getTxRepository().save(tx);
                                            process.setId(codeId);
                                            process.setTxid(codeId);
                                            process.setBmsUser(bmsUser);
                                            process.setStartDate(DateHelper.toDate());
                                            process.setStartDateStr(DateHelper.toDate(DateHelper.toDate()));
                                            process.setStatus(new BigDecimal(Constants.TX_PROCESS_STATUS_OPEN));
                                            BmsTxProcess processSaved=repo.getTxProcessRepository().save(process);

                                            tx.setBmsTxProcess(process);
                                            txSaved=repo.getTxRepository().save(tx);
                                            if(processSaved!=null && txSaved!=null) {
                                                message.setSuccess(true);
                                                message.setPersonalId(codeId);
                                                return message;
                                            }

                                        }

                                    }else{ throw new  BackendServiceException(" Error::BookingServicesImpl::newApplicantForm {{ Default Office || Default Service }} not exits") ;}


                                }


                            }
                            //entitySaved=dao.saveApplicant(applicant)



                        }else{ throw new  BackendServiceException(" Error::BookingServicesImpl::newApplicantForm  User has max number active transaction") ;}


                    }else {

                        if(checkActiveTransaction==false && currentTxId!=null) {


                            if(personal.getApplicantId().equals(currentTxId)) {
                                Optional<BmsApplicantsPesonnal> appPerso=repo.getApplicantsPesonnalRepository().findById(currentTxId);

                                if(appPerso.isPresent()) {
                                    entity.setCreatedDate(appPerso.get().getCreatedDate());
                                    entity.setCreateBy(userId);
                                    entity.setUpdateDate(DateHelper.toDate());
                                    entitySaved=repo.getApplicantsPesonnalRepository().save(entity);
                                    message.setSuccess(true);
                                    message.setPersonalId(appPerso.get().getApplicantId());
                                    return message;
                                }
                            }else{ throw new  BackendServiceException(" Error::BookingServicesImpl::newApplicantForm  currentTxId transaction is different from ApplicantId") ;}



                        }else{ throw new  BackendServiceException(" Error::BookingServicesImpl::newApplicantForm  User has max number active transaction") ;}


                    }




                }else{ 	throw new  BackendServiceException(" Error::BookingServicesImpl::newApplicantForm {{ Form is Already Submit and Sign  }}  ") ;}}



        }else{ throw new  BackendServiceException(" Error::BookingServicesImpl::newApplicantForm {{ UserId session  }} not exits") ;}



        return message;
    }

    public Mono<ApplicantResponse> addProfesonalForm(BmsProfessionalBean personal, BigDecimal userId) throws ApplicationException {

 return null;
    }

    public Mono<ApplicantResponse> addReferences(ReferenceRequest references, BigDecimal userId) throws ApplicationException {
        return null;
    }

    public Mono<ApplicantResponse> addPiecesOfIdentity(MultipartFile recto, MultipartFile verso, BigDecimal userId, BigDecimal currentTxId) throws ApplicationException {
        return null;
    }

    public Mono<ApplicantResponse> signAndSubmitForm(BmsSubmitBean sign) throws ApplicationException {
        return null;
    }

    public Mono<PaymentResponse> addPayment(BmsPaymentRequest payment, BigDecimal userId) throws ApplicationException {
        return null;
    }

    public Mono<ApplicantTableResponse> applicantTable(int pageNumber, int pageSize, BigDecimal userId) throws ApplicationException {
        return null;
    }

    public Mono<BmsApplicantResponse> applicantDetails(BigDecimal userId, BigDecimal currentTxId) throws ApplicationException {
        return null;
    }

    public Mono<BmsApplicantResponse> applicantCurrentDetails(BigDecimal userId) throws ApplicationException {
        return null;
    }

    public Mono<ApplicantResponse> rescheduleApplicant(BigDecimal userId, BigDecimal currentTxId, String date) throws ApplicationException {
        return null;
    }

    public Mono<ApiResponse> checkNif(String nif) throws ApplicationException {
        return null;
    }

    public Mono<ApiResponse> checkNin(String nin) throws ApplicationException {
        return null;
    }

    public Mono<ApiResponse> checkPhone(String phone) throws ApplicationException {
        return null;
    }

    public Mono<ApiResponse> checkpassPort(String passportNumber) throws ApplicationException {
        return null;
    }

    public Mono<BmsIdentityBean> viewPicture(BigDecimal id) throws ApplicationException {
        return null;
    }

    public Mono<ApplicantResponse> addFingerPrint(BigDecimal txId, BigDecimal status, BigDecimal type) throws ApplicationException {
        return null;
    }
}
