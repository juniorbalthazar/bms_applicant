package ht.bms.applicant.domain.repo;

import ht.bms.applicant.domain.BmsApplicant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface BmsApplicantRepository  extends CrudRepository<BmsApplicant,BigDecimal>{
	
	//@Query("select max(a.applicantId) from BmsApplicant a where a.bmsUser.userId = ?1")// AND max(a.lastSignDate)
	//public BigDecimal findLastApplicantId(BigDecimal userId);


	@Query(value = "SELECT * FROM bms_applicant a "
			+ " inner join bms_tx tx on tx.tx_id=a.applicant_id "
			+ " inner join bms_tx_process p on p.txid=a.applicant_id "
			+ "where tx.user_tranction =:userId and a.is_citizen=0 and p.status=1", nativeQuery = true)
	public Optional<BmsApplicant> isHaveCitizenParentTransaction(BigDecimal userId);


	@Query(value = "SELECT em FROM BmsApplicant em where em.userId=:userID")
	public List<BmsApplicant> findBmsApplicantByBmsUser(@Param("userID") BigDecimal userID);

}
