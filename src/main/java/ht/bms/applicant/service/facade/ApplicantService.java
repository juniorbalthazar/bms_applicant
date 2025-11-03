package ht.bms.applicant.service.facade;

import ht.bms.applicant.api.AccountBean;
import ht.bms.applicant.api.ApiAuth;
import ht.bms.applicant.domain.BmsSetting;
import ht.bms.applicant.exception.ApplicationException;
import ht.bms.applicant.domain.repo.RetrytableRepo;
import ht.bms.applicant.service.handles.ApplicantHandler;
import ht.bms.applicant.service.mapper.ApplicantMapper;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

@Transactional
@Service
public class ApplicantService {
    private final Logger log = org.slf4j.LoggerFactory.getLogger(ApplicantService.class);

    private RetrytableRepo repo;
    private ApplicantMapper mapper;
    private ApiAuth auth;

    public ApplicantService(RetrytableRepo repo, ApplicantMapper mapper, ApiAuth auth) {
        this.repo = repo;
        this.mapper = mapper;
        this.auth = auth;
    }

    public Mono<AccountBean> checkAccount(String token) throws ApplicationException {
        return auth.isAUth(token);
    }

    public int checkActiveNumberTransaction(BigDecimal userId) throws ApplicationException {
        return repo.checkNumberTxProcessByUserId(userId);
    }


    public boolean checkActiveTransaction(BigDecimal userId) throws ApplicationException {
        BmsSetting setting=repo.getSetting(new BigDecimal(100)).orElseThrow() ;
        int num=checkActiveNumberTransaction(userId);
        if(setting.getNbreTransPerApplicant()!=null) {
            return num >= setting.getNbreTransPerApplicant().intValue();
        }
        return false;
    }

    public boolean isHaveCitizenParentTransaction(BigDecimal userId) throws ApplicationException {
        return false;
    }

    public Integer isCitizen(String date) {
        return null;
    }
/*
    public Mono<ApplicantMessage> newApplicantForm(BmsPesonnalBean personal, BigDecimal userId) throws ApplicationException {
        return null;
    }

    public Mono<ApplicantMessage> addProfesonalForm(BmsProfessionalBean personal, BigDecimal userId) throws ApplicationException {
        return null;
    }

    public Mono<ApplicantMessage> addReferences(ReferenceRequest references, BigDecimal userId) throws ApplicationException {
        return null;
    }

    public Mono<ApplicantMessage> addPiecesOfIdentity(MultipartFile recto, MultipartFile verso, BigDecimal userId, BigDecimal currentTxId) throws ApplicationException {
        return null;
    }

    public Mono<ApplicantMessage> signAndSubmitForm(BmsSubmitBean sign) throws ApplicationException {
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

    public Mono<ApplicantMessage> rescheduleApplicant(BigDecimal userId, BigDecimal currentTxId, String date) throws ApplicationException {
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

    public Mono<ApplicantMessage> addFingerPrint(BigDecimal txId, BigDecimal status, BigDecimal type) throws ApplicationException {
        return null;
    }*/
}
