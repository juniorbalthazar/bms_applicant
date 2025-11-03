package ht.bms.applicant.service.handles;

import ht.bms.applicant.service.facade.ApplicantService;
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

    public Mono<ServerResponse> checkAccount(ServerRequest request) {
        return applicantService.checkAccount(request.exchange().getRequest().getHeaders().getFirst("Authorization"))
                .flatMap(ServerResponse.ok()::bodyValue)
                .switchIfEmpty(ServerResponse.notFound().build());
    }

}
