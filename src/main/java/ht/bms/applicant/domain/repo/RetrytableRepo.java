package ht.bms.applicant.domain.repo;

import ht.bms.applicant.domain.*;
import jakarta.transaction.Transactional;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class RetrytableRepo {

    private BmsApplicantDemandeMotifRepository applicantDemandeMotifRepository;
    private BmsApplicantRepository applicantRepository;

    private BmsApplicantsCertificatRepository applicantsCertificatRepository;
    private BmsApplicantsFingerprintRepository applicantsFingerprintRepository;
    private BmsApplicantsIdentityRepository applicantsIdentityRepository;

    private BmsApplicantsPaymentRepository bmsApplicantsPaymentRepository;
    private BmsApplicantsPesonnalRepository bmsApplicantsPesonnalRepository;
    private BmsApplicantsProfessionalRepository bmsApplicantsProfessionalRepository;
    private  BmsApplicantsReferenceRepository bmsApplicantsReferenceRepository;
    private BmsTxRepository bmsTxRepository;
    private BmsTxProcessRepository bmsTxProcessRepository;
    private SettingRepository settingRepo;
    private BmsInstitutionRepository bmsInstitutionRepository;
    private BmsOfficeRepository  bmsOfficeRepository;
    private BmsOfficeServiceRepository bmsOfficeServiceRepository;

    public RetrytableRepo(BmsApplicantDemandeMotifRepository applicantDemandeMotifRepository, BmsApplicantRepository applicantRepository, BmsApplicantsCertificatRepository applicantsCertificatRepository,
                          BmsApplicantsFingerprintRepository applicantsFingerprintRepository, BmsApplicantsIdentityRepository applicantsIdentityRepository,BmsApplicantsPaymentRepository bmsApplicantsPaymentRepository,
                          BmsApplicantsPesonnalRepository bmsApplicantsPesonnalRepository, BmsApplicantsProfessionalRepository bmsApplicantsProfessionalRepository,BmsApplicantsReferenceRepository bmsApplicantsReferenceRepository,
                          BmsTxRepository bmsTxRepository,BmsTxProcessRepository bmsTxProcessRepository,SettingRepository settingRepo,BmsInstitutionRepository bmsInstitutionRepository,BmsOfficeRepository  bmsOfficeRepository,
                          BmsOfficeServiceRepository bmsOfficeServiceRepository){

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
        this.bmsInstitutionRepository = bmsInstitutionRepository;
        this.bmsOfficeRepository = bmsOfficeRepository;
        this.bmsOfficeServiceRepository = bmsOfficeServiceRepository;


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
     * save isHaveCitizenParentTransaction
     * @return
     */

    @Retryable(retryFor = SQLException.class, maxAttemptsExpression = "#{${retry-database.max-attempts}}", backoff = @Backoff(delayExpression = "#{${retry-database.backoff}}"))
    public Optional<BmsApplicant> isHaveCitizenParentTransaction(BigDecimal userId){
        return applicantRepository.isHaveCitizenParentTransaction( userId);
    }

    isHaveCitizenParentTransaction

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


}
