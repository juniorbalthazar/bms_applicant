package ht.bms.applicant.domain.repo;

import ht.bms.applicant.domain.BmsApplicantDemandeMotif;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

public interface BmsApplicantDemandeMotifRepository   extends CrudRepository<BmsApplicantDemandeMotif, BigDecimal>{

}
