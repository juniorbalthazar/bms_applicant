package ht.bms.applicant.service.facade;

import ht.bms.applicant.exception.ApplicantExceptions;
import ht.bms.applicant.exception.ApplicationException;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

public interface BookingFacade {


    //#####################################################################################################################
    //###                                                   APPLICANT SERVICE                                          ##
    //#####################################################################################################################
    public int checkActiveNumberTransaction(BigDecimal userId)throws ApplicationException;

    public boolean checkActiveTransaction(BigDecimal userId )throws ApplicationException;

    public boolean isHaveCitizenParentTransaction(BigDecimal userId)throws ApplicationException;

    public Integer isCitizen(String date);

    public Mono<ApplicantMessage> newApplicantForm(BmsPesonnalBean personal,BigDecimal userId)throws ApplicationException;

    public Mono<ApplicantMessage> addProfesonalForm(BmsProfessionalBean personal,BigDecimal userId)throws ApplicationException;

    public Mono<ApplicantMessage> addReferences(ReferenceRequest references,BigDecimal userId)throws ApplicationException;

    public Mono<ApplicantMessage> addPiecesOfIdentity(MultipartFile recto, MultipartFile verso, BigDecimal userId, BigDecimal currentTxId)throws ApplicationException;

    public Mono<ApplicantMessage> signAndSubmitForm(BmsSubmitBean sign)throws ApplicationException;

    public Mono<PaymentResponse> addPayment(BmsPaymentRequest payment,BigDecimal userId)throws ApplicationException;

    public Mono<ApplicantTableResponse>  applicantTable(int pageNumber,int pageSize,BigDecimal userId)throws ApplicationException;

    public Mono<BmsApplicantResponse>  applicantDetails(BigDecimal userId,BigDecimal currentTxId)throws ApplicationException;

    public Mono<BmsApplicantResponse>  applicantCurrentDetails(BigDecimal userId)throws ApplicationException;

    public Mono<ApplicantMessage> rescheduleApplicant(BigDecimal userId,BigDecimal currentTxId,String date) throws ApplicationException;

    Mono<ApiResponse> checkNif(String nif )throws ApplicationException;
    Mono<ApiResponse> checkNin(String nin )throws ApplicationException;
    Mono<ApiResponse> checkPhone(String phone )throws ApplicationException;
    Mono<ApiResponse> checkpassPort(String passportNumber)throws ApplicationException;
    Mono<BmsIdentityBean> viewPicture(BigDecimal id)throws ApplicationException;


    Mono<ApplicantMessage> addFingerPrint(BigDecimal txId,BigDecimal status,BigDecimal type)throws ApplicationException;

}
