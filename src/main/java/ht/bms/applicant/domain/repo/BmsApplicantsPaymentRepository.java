package ht.bms.applicant.domain.repo;

import ht.bms.applicant.domain.BmsApplicantsPayment;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

public interface BmsApplicantsPaymentRepository extends CrudRepository<BmsApplicantsPayment, BigDecimal>{

}
