package ht.bms.applicant.service.facade;

import ht.bms.applicant.exception.ApplicationException;
import ht.bms.applicant.domain.repo.RetrytableRepo;
import ht.bms.applicant.service.mapper.ApplicantMapper;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

@Transactional
@Service
public class BookingService implements BookingFacade{

    private RetrytableRepo repo;
    private ApplicantMapper mapper;


    @Override
    public int checkActiveNumberTransaction(BigDecimal userId) throws ApplicationException {
        return repo.checkNumberTxProcessByUserId(userId);
    }

    @Override
    public boolean checkActiveTransaction(BigDecimal userId) throws ApplicationException {
        BmsSetting setting=getDefaultSetting() ;
        int num=checkActiveNumberTransaction(userId);
        if(setting!=null && setting.getNbreTransPerApplicant()!=null) {
            if(num>=setting.getNbreTransPerApplicant().intValue()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isHaveCitizenParentTransaction(BigDecimal userId) throws ApplicationException {
        return false;
    }

    public Integer isCitizen(String date) {
        return null;
    }

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
    }
}
