package ht.bms.applicant.domain.repo;

import ht.bms.applicant.domain.BmsApplicantsReference;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

public interface BmsApplicantsReferenceRepository   extends CrudRepository<BmsApplicantsReference, BigDecimal>{
	@Query("select a from BmsApplicantsReference a where a.applicantId = ?1")
	public List<BmsApplicantsReference> findRefencesByApplicantId(BigDecimal applicantId);
}
