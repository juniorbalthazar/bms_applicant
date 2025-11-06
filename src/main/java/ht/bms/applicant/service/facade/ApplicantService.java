package ht.bms.applicant.service.facade;

import ht.bms.applicant.api.AccountBean;
import ht.bms.applicant.api.ApiAuth;
import ht.bms.applicant.domain.*;
import ht.bms.applicant.exception.ApplicantExceptions;
import ht.bms.applicant.exception.ApplicationException;
import ht.bms.applicant.domain.repo.RetrytableRepo;
import ht.bms.applicant.model.*;
import ht.bms.applicant.service.Constants;
import ht.bms.applicant.service.handles.ApplicantHandler;
import ht.bms.applicant.service.mapper.ApplicantMapper;
import ht.bms.applicant.utils.DateHelper;
import ht.bms.applicant.utils.GenTools;
import jakarta.transaction.Transactional;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.Objects;
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

    public boolean isUserHaveMaxTransaction(BigDecimal userId) throws ApplicationException {

        BmsSetting setting=getDefaultSetting();
        int num=checkActiveNumberTransaction(userId);
        if(setting.getNbreTransPerApplicant()!=null) {
            return num >= setting.getNbreTransPerApplicant().intValue();
        }
        return false;
    }

    public boolean isHaveCitizenParentTransaction(BigDecimal userId) throws ApplicationException {
           // Optional<BmsApplicant> exit = repo.isHaveCitizenParentTransaction(userId);
        return repo.isHaveCitizenParentTransaction(userId).isPresent();
                        //exit.filter(a -> StringUtils.isNoneBlank(a.getIsCitizen()) && a.getIsCitizen().equals("0")).isPresent();
    }

    public boolean isCitizen(String date) {
            return DateHelper.isMineur(DateHelper.StringToDate(date), DateHelper.toDate())
                    ? Constants.TYPE_MINEUR
                    : Constants.TYPE_CITIZEN;
    }




    public Mono<ApplicantResponse> addApplicantForm(Mono<PersonalBean> request, String access) throws ApplicationException {
        ApplicantResponse response = new ApplicantResponse();
        response.setSuccess(false);
        var auth=checkAccount(access);
        return request.flatMap(personal->{


                    if (Optional.ofNullable(auth).isEmpty())
                        throw new ApplicationException(" Error::BookingServicesImpl::newApplicantForm {{ UserId session  }} not exits") ;

                    BigDecimal userId=auth.getUserId();
                    Optional<BmsAccount> account=repo.findBmsAccountByUserId(userId);
                    BigDecimal currentTxId=repo.checkCurrentTransactionId(userId);
                    if(Objects.equals(this.isCitizen(personal.getDateOfBirth()), Constants.TYPE_MINEUR)) {
                        if(isHaveCitizenParentTransaction(userId)==false) throw new  ApplicationException("Une demande pour un adulte est en cours , completer la d'abord") ;
                    }
                    if (Optional.ofNullable(repo.checkFormIsSubmitAndSign(currentTxId)).isPresent())
                       throw new  ApplicationException(" Error::BookingServicesImpl::newApplicantForm {{ Form is Already Submit and Sign  }}  ");

                        boolean isUserHaveMaxTransaction=isUserHaveMaxTransaction(userId);

                        BmsApplicant applicant=null;
                        BigDecimal codeId=null;
                        BmsCodegen codeGen=new BmsCodegen();
                        BmsApplicantsPersonal entitySaved=null;
                        BmsApplicantsPersonal entity=mapper.toPersonal(personal);

                        if(isUserHaveMaxTransaction==true)
                            throw new  ApplicationException(" Error::BookingServicesImpl::newApplicantForm  User has max number active transaction") ;

                        if(personal.getApplicantId()==null) {

                                do {codeId= GenTools.generedCodeId();}while(repo.existsByCode(codeId.toString()).isPresent());
                                codeGen.setCode(codeId.toString());
                                codeGen.setCreateddate(DateHelper.toDate());
                                codeGen=repo.save(codeGen);
                                entity.setApplicantId(codeId);

                                entity.setCreatedDate(DateHelper.toDate());
                                entitySaved=repo.savePersonal(entity);
                                if(entitySaved!=null) {

                                    applicant=new BmsApplicant();
                                    BmsUser bmsUser=new BmsUser();
                                    bmsUser.setUserId(userId);
                                    applicant.setUserId(userId);
                                    if(entity.getNationalite()==null) {
                                        if(account.get().getBmsUser()!=null && account.get().getBmsUser().getNationalite()!=null) {
                                            applicant.setNationalite(account.get().getBmsUser().getNationalite());
                                        }


                                    }else {
                                        applicant.setNationalite(entity.getNationalite());
                                    }

                                    applicant.setApplicantId(codeId);
                                    applicant.setCreatedDate(DateHelper.toDate());
                                    applicant.setPersonal(entitySaved);


                                    if(personal.getIsCitizen()==Constants.TYPE_CITIZEN) {
                                        applicant.setCitizen(Constants.TYPE_CITIZEN);
                                    }
                                    else if(personal.getIsCitizen()==Constants.TYPE_MINEUR) {
                                        applicant.setCitizen(Constants.TYPE_MINEUR);
                                    }

                                    BmsApplicant applicantSaved=repo.saveApplicant(applicant);

                                    if(applicantSaved!=null) {

                                        BmsTx tx=new BmsTx();
                                        BmsTxStatus status=new BmsTxStatus();
                                        BmsTxType type=new BmsTxType();

                                        BmsInstitution institution=getDefaultInstitution();
                                        BmsOffice office=this.getDefaultOffice();
                                        Optional<BmsOfficeService> officeService=repo
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
                                            tx.setCretedBy(account.get().getAccountId());
                                            tx.setIsCurrent(new BigDecimal(Constants.CURRENT_TRANSACTION));

                                            BmsTx txSaved=repo.saveTx(tx);
                                            if(txSaved!=null) {
                                                BmsTxProcess process=new BmsTxProcess();//txSaved=repo.getTxRepository().save(tx);
                                                process.setId(codeId);
                                                process.setTxid(codeId);
                                                process.setBmsUser(bmsUser);
                                                process.setStartDate(DateHelper.toDate());
                                                process.setStartDateStr(DateHelper.DateToString(process.getStartDate()));
                                                process.setStatus(new BigDecimal(Constants.TX_PROCESS_STATUS_OPEN));
                                                BmsTxProcess processSaved=repo.saveTxProcess(process);

                                                tx.setBmsTxProcess(process);
                                                txSaved=repo.saveTx(tx);
                                                if(processSaved!=null && txSaved!=null) {
                                                    response.setSuccess(true);
                                                    response.setPersonalId(codeId);
                                                    return Mono.just(response);
                                                }

                                            }

                                        }else{ throw new  ApplicationException(" Error::BookingServicesImpl::newApplicantForm {{ Default Office || Default Service }} not exits") ;}


                                    }


                                }



                        }else {

                            if(currentTxId!=null) {

                                if(personal.getApplicantId().equals(currentTxId)) {
                                    Optional<BmsApplicantsPersonal> appPerso=repo.findPersonalById(currentTxId);

                                    if(appPerso.isPresent()) {
                                        entity.setCreatedDate(appPerso.get().getCreatedDate());
                                        entity.setCreateBy(userId);
                                        entity.setUpdateDate(DateHelper.toDate());
                                        entitySaved=repo.savePersonal(entity);
                                        response.setSuccess(true);
                                        response.setPersonalId(appPerso.get().getApplicantId());
                                        return Mono.just(response);
                                    }
                                }else{ throw new  ApplicationException(" Error::BookingServicesImpl::newApplicantForm  currentTxId transaction is different from ApplicantId") ;}



                            }else{ throw new  ApplicationException(" Error::BookingServicesImpl::newApplicantForm  User has max number active transaction") ;}


                        }

                    return Mono.just(response);
             });



    }
/*
    public Mono<ApplicantResponse> addProfesonalForm(ProfessionalBean personal, BigDecimal userId) throws ApplicationException {
        return null;
    }

    public Mono<ApplicantResponse> addReferences(ReferenceRequest references, BigDecimal userId) throws ApplicationException {
        return null;
    }

    public Mono<ApplicantResponse> addPiecesOfIdentity(MultipartFile recto, MultipartFile verso, BigDecimal userId, BigDecimal currentTxId) throws ApplicationException {
        return null;
    }

    public Mono<ApplicantResponse> signAndSubmitForm(SubmitBean sign) throws ApplicationException {
        return null;
    }

    public Mono<PaymentResponse> addPayment(PaymentRequest payment, BigDecimal userId) throws ApplicationException {
        return null;
    }

    public Mono<ApplicantTableResponse> applicantTable(int pageNumber, int pageSize, BigDecimal userId) throws ApplicationException {
        return null;
    }

    public Mono<ApplicantResponse> applicantDetails(BigDecimal userId, BigDecimal currentTxId) throws ApplicationException {
        return null;
    }

    public Mono<ApplicantResponse> applicantCurrentDetails(BigDecimal userId) throws ApplicationException {
        return null;
    }

    public Mono<ApplicantResponse> rescheduleApplicant(BigDecimal userId, BigDecimal currentTxId, String date) throws ApplicationException {
        return null;
    }

    public Mono<ApiResponseBean> checkNif(String nif) throws ApplicationException {
        return null;
    }

    public Mono<ApiResponseBean> checkNin(String nin) throws ApplicationException {
        return null;
    }

    public Mono<ApiResponseBean> checkPhone(String phone) throws ApplicationException {
        return null;
    }

    public Mono<ApiResponseBean> checkpassPort(String passportNumber) throws ApplicationException {
        return null;
    }

    public Mono<IdentityBean> viewPicture(BigDecimal id) throws ApplicationException {
        return null;
    }

    public Mono<ApplicantResponse> addFingerPrint(BigDecimal txId, BigDecimal status, BigDecimal type) throws ApplicationException {
        return null;
    }*/
    private BmsInstitution getDefaultInstitution() throws ApplicationException {
        Optional<BmsInstitution> institution=repo.getInstitutionById(new BigDecimal(Constants.DEFAULT_INSTITUTION_ID));
        if(institution.isPresent()) {
            return institution.get();
        }else {
            throw new  ApplicationException(" Error::BookingServicesImpl::getDefaultInstitution  Default Institution not exits") ;
        }
    }

    private BmsSetting getDefaultSetting() throws ApplicationException {
        Optional<BmsSetting> setting=repo.getSetting(new BigDecimal(Constants.DEFAULT_INSTITUTION_ID));
        if(setting.isPresent()) {
            return setting.get();
        }else {
            throw new  ApplicationException(" Error::BookingServicesImpl::getDefaultSetting  Default Setting not exits") ;
        }
    }
    public BmsOffice getDefaultOffice() {
        return repo.getBmsOfficeCentral(new BigDecimal(Constants.CENTRAL_OFFICE),getDefaultInstitution().getInstitutionId()).get();
    }



}
