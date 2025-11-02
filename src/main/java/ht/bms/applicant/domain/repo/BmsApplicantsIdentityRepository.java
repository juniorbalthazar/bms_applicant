package ht.bms.applicant.domain.repo;

import ht.bms.applicant.domain.BmsApplicantsIdentity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

public interface BmsApplicantsIdentityRepository  extends CrudRepository<BmsApplicantsIdentity, BigDecimal>{
	@Query("select a from BmsApplicantsIdentity a where a.applicantId = ?1")
	public List<BmsApplicantsIdentity> findIdentityByApplicantId(BigDecimal applicantId);

}
