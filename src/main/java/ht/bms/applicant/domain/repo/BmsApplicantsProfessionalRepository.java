package ht.bms.applicant.domain.repo;

import ht.bms.applicant.domain.BmsApplicantsProfessional;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

public interface BmsApplicantsProfessionalRepository   extends CrudRepository<BmsApplicantsProfessional, BigDecimal>{

}
