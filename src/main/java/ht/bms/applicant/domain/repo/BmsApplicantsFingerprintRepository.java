package ht.bms.applicant.domain.repo;

import ht.bms.applicant.domain.BmsApplicantsFingerprint;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

public interface BmsApplicantsFingerprintRepository  extends CrudRepository<BmsApplicantsFingerprint, BigDecimal>{
	@Query("select a from BmsApplicantsFingerprint a where a.applicantId = ?1")
	public List<BmsApplicantsFingerprint> findBmsApplicantsFingerprintByApplicantId(BigDecimal applicantId);
}
