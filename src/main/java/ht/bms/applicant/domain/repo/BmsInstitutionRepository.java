package ht.bms.applicant.domain.repo;

import ht.gouv.dcpj.bms.domain.BmsInstitution;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.Optional;

public interface BmsInstitutionRepository  extends CrudRepository<BmsInstitution,BigDecimal>{
	
	@Query("select ins from BmsInstitution ins where ins.isDefault = ?1")
	public Optional<BmsInstitution> getBmsInstitutionDefault(BigDecimal isDefault);
	
}
