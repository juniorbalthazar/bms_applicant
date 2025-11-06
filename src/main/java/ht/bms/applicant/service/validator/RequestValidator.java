package ht.bms.applicant.service.validator;

import ht.bms.applicant.exception.ApplicantExceptions;
import ht.bms.applicant.model.PersonalBean;
import reactor.core.publisher.Mono;

import java.util.Objects;
import java.util.function.UnaryOperator;

public class RequestValidator {

    public static UnaryOperator<Mono<PersonalBean>> validatePersonal() {
        return dto -> dto.filter(e -> Objects.nonNull(e.getFirstName()) && !e.getFirstName().isEmpty())
                .switchIfEmpty(ApplicantExceptions.missingField("FirstName is missing "))
                .filter(e -> Objects.nonNull(e.getLastName()) && !e.getLastName().isEmpty())
                .switchIfEmpty(ApplicantExceptions.missingField("LastName is missing "));
    }
}
