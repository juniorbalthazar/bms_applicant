package ht.bms.applicant.domain.repo;

import ht.bms.applicant.domain.*;
import jakarta.transaction.Transactional;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Optional;

@Transactional
@Service
public class RetrytableRepo {

    private final BmsApplicantDemandeMotifRepository applicantDemandeMotifRepository;
    private final BmsApplicantRepository applicantRepository;

    private final BmsApplicantsCertificatRepository applicantsCertificatRepository;
    private final BmsApplicantsFingerprintRepository applicantsFingerprintRepository;
    private final BmsApplicantsIdentityRepository applicantsIdentityRepository;

    private final BmsApplicantsPaymentRepository bmsApplicantsPaymentRepository;
    private final BmsApplicantsPesonnalRepository bmsApplicantsPesonnalRepository;
    private final BmsApplicantsProfessionalRepository bmsApplicantsProfessionalRepository;
    private final BmsApplicantsReferenceRepository bmsApplicantsReferenceRepository;
    private final BmsTxRepository bmsTxRepository;
    private final BmsTxProcessRepository bmsTxProcessRepository;
    private final SettingRepository settingRepo;
    private final BmsAccountsRepository bmsAccountsRepository;
    private final BmsRolesRepository bmsRolesRepository;
    private final BmsUsersRepository bmsUsersRepository;
    private final BmsCogeGenRepository bmsCogeGenRepository;
    private final BmsOfficeRepository  bmsOfficeRepository;
    private final BmsInstitutionRepository bmsInstitutionRepository;
    private final BmsOfficeServiceRepository bmsOfficeServiceRepository;
    private final BmsCalendarRepository calendarRepo;



    public RetrytableRepo(BmsApplicantDemandeMotifRepository applicantDemandeMotifRepository, BmsApplicantRepository applicantRepository, BmsApplicantsCertificatRepository applicantsCertificatRepository,
                          BmsApplicantsFingerprintRepository applicantsFingerprintRepository, BmsApplicantsIdentityRepository applicantsIdentityRepository, BmsApplicantsPaymentRepository bmsApplicantsPaymentRepository,
                          BmsApplicantsPesonnalRepository bmsApplicantsPesonnalRepository, BmsApplicantsProfessionalRepository bmsApplicantsProfessionalRepository, BmsApplicantsReferenceRepository bmsApplicantsReferenceRepository,
                          BmsTxRepository bmsTxRepository, BmsTxProcessRepository bmsTxProcessRepository, SettingRepository settingRepo, BmsInstitutionRepository bmsInstitutionRepository, BmsOfficeRepository  bmsOfficeRepository,
                          BmsOfficeServiceRepository bmsOfficeServiceRepository, BmsAccountsRepository bmsAccountsRepository, BmsRolesRepository bmsRolesRepository, BmsUsersRepository bmsUsersRepository, BmsCogeGenRepository bmsCogeGenRepository, BmsOfficeRepository bmsOfficeRepository1, BmsInstitutionRepository bmsInstitutionRepository1, BmsOfficeServiceRepository bmsOfficeServiceRepository1, BmsCalendarRepository calendarRepo){

        this.applicantDemandeMotifRepository = applicantDemandeMotifRepository;
        this.applicantRepository = applicantRepository;
        this.applicantsCertificatRepository = applicantsCertificatRepository;
        this.applicantsFingerprintRepository = applicantsFingerprintRepository;
        this.applicantsIdentityRepository = applicantsIdentityRepository;
        this.bmsApplicantsPesonnalRepository = bmsApplicantsPesonnalRepository;
        this.bmsApplicantsReferenceRepository = bmsApplicantsReferenceRepository;
        this.bmsApplicantsProfessionalRepository = bmsApplicantsProfessionalRepository;
        this.bmsApplicantsPaymentRepository = bmsApplicantsPaymentRepository;
        this.bmsTxRepository = bmsTxRepository;
        this.bmsTxProcessRepository = bmsTxProcessRepository;
        this.settingRepo = settingRepo;
        this.bmsAccountsRepository = bmsAccountsRepository;
        this.bmsRolesRepository = bmsRolesRepository;
        this.bmsUsersRepository = bmsUsersRepository;
        this.bmsCogeGenRepository = bmsCogeGenRepository;
        this.bmsOfficeRepository = bmsOfficeRepository1;
        this.bmsInstitutionRepository = bmsInstitutionRepository1;
        this.bmsOfficeServiceRepository = bmsOfficeServiceRepository1;
        this.calendarRepo = calendarRepo;
    }



    /**
     * save Applicant
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public BmsApplicant saveApplicant(BmsApplicant applicant){
        return applicantRepository.save(applicant);
    }

    /**
     * check isHaveCitizenParentTransaction
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public Optional<BmsApplicant> isHaveCitizenParentTransaction(BigDecimal userId){
        return applicantRepository.isHaveCitizenParentTransaction( userId);
    }


    /**
     * save ApplicantsPersonal
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public BmsApplicantsPersonal savePersonal(BmsApplicantsPersonal personal){
        return bmsApplicantsPesonnalRepository.save(personal);
    }

    /**
     * save ApplicantsProfessional
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public BmsApplicantsProfessional saveProfessional(BmsApplicantsProfessional professional){
        return bmsApplicantsProfessionalRepository.save(professional);
    }

    /**
     * save ApplicantsReference
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public BmsApplicantsReference saveReference(BmsApplicantsReference reference){
        return bmsApplicantsReferenceRepository.save(reference);
    }


    /**
     * save ApplicantsPayment
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public BmsApplicantsPayment savePayment(BmsApplicantsPayment payment){
        return bmsApplicantsPaymentRepository.save(payment);
    }

    /**
     * save ApplicantsIdentity
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public BmsApplicantsIdentity saveIdentity(BmsApplicantsIdentity identity){
        return applicantsIdentityRepository.save(identity);
    }

    /**
     * save ApplicantsFingerprint
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public BmsApplicantsFingerprint saveFingerPrint(BmsApplicantsFingerprint fingerprint){
        return applicantsFingerprintRepository.save(fingerprint);
    }

    /**
     * save ApplicantsCertificat
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public BmsApplicantsCertificat saveCertificat(BmsApplicantsCertificat certificat){
        return applicantsCertificatRepository.save(certificat);
    }


    /**
     * save DemandeMotif
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public BmsApplicantDemandeMotif saveDemandeMotif(BmsApplicantDemandeMotif motif){
        return applicantDemandeMotifRepository.save(motif);
    }


    /**
     * save Tx
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public BmsTx saveTx(BmsTx bmsTx){
        return bmsTxRepository.save(bmsTx);
    }

    /**
     * check NumberTxProcessByUserId
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public int checkNumberTxProcessByUserId(BigDecimal userId){
        return bmsTxProcessRepository.checkNumberTxProcessByUserId(userId);
    }


    /**
     * find  Setting by Institution Id
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public Optional<BmsSetting> getSetting(BigDecimal institutionId) {
        return settingRepo.findByIsntituion(institutionId);
    }


    /**
     * find  Account by User Id
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public Optional<BmsAccount> findBmsAccountByUserId(BigDecimal userId) {
        return bmsAccountsRepository.findBmsAccountByUserId(userId);
    }


    /**
     * checkCurrentTransactionId
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public BigDecimal checkCurrentTransactionId(BigDecimal userId) {
        return bmsTxRepository.checkCurrentTransactionId(userId);
    }



    /**
     * checkFormIsSubmitAndSign
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public BigDecimal checkFormIsSubmitAndSign(BigDecimal currentTxId) {
        return bmsTxRepository.checkFormIsSubmitAndSign(currentTxId);
    }

    /**
     * existsByCode
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public Optional<BmsCodegen> existsByCode(String code) {
        return bmsCogeGenRepository.findById(code);
    }

    /**
     * save CodeGen
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public BmsCodegen save(BmsCodegen codeGen) {
        return bmsCogeGenRepository.save(codeGen);
    }

    /**
     * get OfficeCentral
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public Optional<BmsOffice> getBmsOfficeCentral(BigDecimal bigDecimal, BigDecimal institutionId) {
        return bmsOfficeRepository.getBmsOfficeCentral(bigDecimal, institutionId);
    }

    /**
     * get OfficeCentral
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public Optional<BmsInstitution> getInstitutionById(BigDecimal institutionId) {
        return bmsInstitutionRepository.findById(institutionId);
    }

    /**
     * get OfficeService By OfficeId
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public Optional<BmsOfficeService> findBmsOfficeServiceByOfficeId(BigDecimal officeId) {
        return bmsOfficeServiceRepository.findBmsOfficeServiceByOfficeId(officeId);
    }

    /**
     * save
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public BmsTxProcess saveTxProcess(BmsTxProcess process) {
        return bmsTxProcessRepository.save(process);
    }

    /**
     * find OfficeService By OfficeId
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))

    public Optional<BmsApplicantsPersonal> findPersonalById(BigDecimal personalId) {
        return bmsApplicantsPesonnalRepository.findById(personalId);
    }
}
