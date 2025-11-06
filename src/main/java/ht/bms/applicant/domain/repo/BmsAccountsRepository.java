package ht.bms.applicant.domain.repo;


import ht.bms.applicant.domain.BmsAccount;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


public interface BmsAccountsRepository  extends CrudRepository<BmsAccount, BigDecimal> , JpaSpecificationExecutor<BmsAccount> {
	
	@Query("select a from BmsAccount a where a.email = ?1  and a.enabled=0")
	// and a.enabled=0 ACTIVE , all backOffice user (login by email)
	public Optional<BmsAccount> findBmsAccountEmail(String email);
	
	@Query("select a from BmsAccount a where (a.email = ?1 or a.tel= ?1) and a.enabled=0")
	// and a.enabled=0 ACTIVE   (a.email = ?1 or a.tel= ?1)  (all applicants users login by tel)
	public Optional<BmsAccount> findBmsAccount(String telEmail);
	//public List<BmsAccount> findBmsAccount(String tel);
	
	@Query("select a from BmsAccount a where  a.tel= ?1")
	public Optional<BmsAccount> findBmsAccountByTel(String tel);


	@Query("select a from BmsAccount a where a.bmsUser.nif=:nif  and a.email =:email and a.bmsUser.nin=:nin and a.enabled=0")// and a.enabled=0 ACTIVE
	public Optional<BmsAccount> findBmsNotExistedAcount(@Param("email") String email,@Param("nif") String nif,@Param("nin") String nin);

	@Query("select a from BmsAccount a where a.email = ?1  and a.enabled=1")// and a.enabled=1 INACTIVE
	public Optional<BmsAccount> findBmsAccountEmail_Inactive(String email);
  //  Boolean existsByUsername(String username);

	
    Boolean existsByEmail(String email);
    
	@Query("select a from BmsAccount a where a.bmsUser.userId = ?1")
	public Optional<BmsAccount> findBmsAccountByUserId(BigDecimal userId);
	
	@Query("select a from BmsAccount a where a.bmsRole.roleId = ?1")
	public List<BmsAccount> findBmsAccountByUserRole(BigDecimal roleId);
	
	@Query("select a from BmsAccount a where a.bmsUser.nin = ?1")
	public Optional<BmsAccount> findBmsAccountByUserNin(String nin);
	
	@Query("select a from BmsAccount a where a.bmsUser.nif = ?1")
	public Optional<BmsAccount> findBmsAccountByUserNif(String nif);
	
	
	@Query("select a from BmsAccount a where a.tel = ?1")
	public Optional<BmsAccount> findBmsAccountByUserPhone(String phone);


	@Query("select a from BmsAccount a where a.email = ?1")
	public Optional<BmsAccount> findBmsAccountByEmil(String email);

	@Query("select a from BmsAccount a where a.bmsUser.passport = ?1")
	public Optional<BmsAccount> findBmsAccountByPassport(String passport);

	@Query("select a from BmsAccount a where (a.bmsUser.nif=:nifCin OR a.bmsUser.nin=:nifCin) and (a.tel =:tel OR a.email=:tel) and a.enabled=0")// and a.enabled=0 ACTIVE
	public Optional<BmsAccount> findAccount(@Param("tel") String tel,@Param("nifCin") String nifCin);


	@Query("select a from BmsAccount a where a.bmsUser.nif = ?2 and a.accountId <> ?1")
	Optional<BmsAccount> findAccountByNifAcceptCurrentUser(BigDecimal accountId, String nif);

	@Query("select a from BmsAccount a where a.bmsUser.nin = ?2 and a.accountId <> ?1")
	Optional<BmsAccount> findAccountByNinAcceptCurrentUser(BigDecimal accountId, String nin);


	@Query("select a from BmsAccount a where a.email = ?2 and a.accountId <> ?1")
	Optional<BmsAccount> findAccountByEmailAcceptCurrentUser(BigDecimal accountId, String email);
	
	@Query("select a from BmsAccount a where a.bmsUser.passport = ?2 and a.accountId <> ?1")
	Optional<BmsAccount> findAccountByPasswordAcceptCurrentUser(BigDecimal accountId, String passport);

	@Query("select a from BmsAccount a where a.bmsUser.institutionId = ?1 and a.bmsRole.roleId=2")
	List<BmsAccount> findBacOfficeUser(BigDecimal institutionId);


	//List<Employee> findByEmployeeNameIn(List<String> names);                // 1. Spring JPA In cause using method name
	 //   @Query("SELECT e FROM Employee e WHERE e.employeeName IN (:names)")     // 2. Spring JPA In cause using @Query
	 //   List<Employee> findByEmployeeNames(@Param("names")List<String> names);

}
