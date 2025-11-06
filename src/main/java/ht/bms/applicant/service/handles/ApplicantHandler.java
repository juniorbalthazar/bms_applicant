package ht.bms.applicant.service.handles;

import ht.bms.applicant.model.ApplicantResponse;
import ht.bms.applicant.model.PersonalBean;
import ht.bms.applicant.service.facade.ApplicantService;
import ht.bms.applicant.service.validator.RequestValidator;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Service
public class ApplicantHandler {
    private final Logger log = org.slf4j.LoggerFactory.getLogger(ApplicantHandler.class);
    private ApplicantService applicantService;

    public ApplicantHandler(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    public Mono<ServerResponse> newApplicant(ServerRequest request) {
        var token = request.exchange().getRequest().getHeaders().getFirst("Authorization");
        return request.bodyToMono(PersonalBean.class)
                .transform(RequestValidator.validatePersonal())
                .as(app->applicantService.addApplicantForm(app,token))
                .flatMap(ServerResponse.ok()::bodyValue);
    }

}
