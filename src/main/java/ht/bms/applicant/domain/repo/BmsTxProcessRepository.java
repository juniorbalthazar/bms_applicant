package ht.bms.applicant.domain.repo;

import ht.gouv.dcpj.bms.domain.BmsTxProcess;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface BmsTxProcessRepository extends PagingAndSortingRepository<BmsTxProcess,BigDecimal>, JpaSpecificationExecutor<BmsTxProcess> {


	@Query("select p from BmsTxProcess p where p.bmsUser.userId = ?1")// 1=Open  2=close   AND p.status=1
	public List<BmsTxProcess> checkActiveTxProcessByUserId(BigDecimal userId);

	@Query("select p from BmsTxProcess p where p.txid = ?1 AND p.status=1")
	public Optional<BmsTxProcess> findTxProcessByTxId(BigDecimal txId);
	
	@Query("select count(p) from BmsTxProcess p where p.bmsUser.userId = ?1 AND p.status=1")
    public int checkNumberTxProcessByUserId(BigDecimal userId);
	
	
	@Modifying(clearAutomatically = true)
	@Query(value="update bms_tx_process  set "
			+ "finger_1 = ?2,finger_2 = ?3,finger_3 = ?4,finger_4 = ?5,finger_5 = ?6, "
			+ "finger_6 = ?7,finger_7 = ?8,finger_8 = ?9,finger_9 = ?10,finger_10 = ?11 "
			+ "where id = ?1", nativeQuery = true)
	public void updateFingerPrint(BigDecimal txId,String finger1,String finger2,String finger3,String finger4,String finger5
			,String finger6,String finger7,String finger8,String finger9,String finger10);
	
	

/*	@Query(value = "SELECT * FROM bms_applicant a "
			+ "inner join bms_tx tx on tx.tx_id=a.applicant_id "
			+ "inner join BmsTxProcess p on p.tx_id=a.applicant_id "
			+ "where tx.user_tranction =:userId and a.is_citizen=true and tx.is_current=0", nativeQuery = true)
	public Optional<BmsApplicant> isHaveCitizenParentTransaction(BigDecimal userId);*/
	
}
