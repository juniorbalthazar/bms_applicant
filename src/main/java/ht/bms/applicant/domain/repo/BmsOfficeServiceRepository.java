package ht.bms.applicant.domain.repo;
import ht.bms.applicant.domain.BmsOfficeService;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.Optional;

public interface BmsOfficeServiceRepository  extends CrudRepository<BmsOfficeService, BigDecimal> , JpaSpecificationExecutor<BmsOfficeService> {
	
	@Query("select a from BmsOfficeService a where a.bmsOffice.officeId = ?1")
	public Optional<BmsOfficeService> findBmsOfficeServiceByOfficeId(BigDecimal officeId);
	
	
	@Query("select a from BmsOfficeService a where a.bmsService.osId = ?1")
	public Optional<BmsOfficeService> findBmsOfficeServiceByServiceId(BigDecimal serviceId);
	
	@Query("select a from BmsOfficeService a where a.bmsOffice.officeId = ?1 and a.bmsService.osId = ?2")
	public Optional<BmsOfficeService> findBmsOfficeServiceByOfficeIdAndServiceId(BigDecimal officeId,BigDecimal serviceId);

}
