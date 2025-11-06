package ht.bms.applicant.router;

import ht.bms.applicant.service.handles.ApplicantHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.*;

import static org.springframework.web.reactive.function.server.RequestPredicates.queryParam;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;


@Configuration
public class ApplicantRouter {

    private final ApplicantHandler calendarHandler;

    public ApplicantRouter(ApplicantHandler calendarHandler) {
        this.calendarHandler = calendarHandler;
    }

    @Bean
    public RouterFunction<ServerResponse> calendarRoutes(){
        return RouterFunctions.route()
                .path("/api/v1/applicant", builder -> builder
                        .add(baseRoute(RequestPredicates.POST("/newApplicant"),calendarHandler::newApplicant))
                )
                //.onError(exceptionHandler::handleException)
                .build();
    }


    private RouterFunction<ServerResponse> baseRoute(RequestPredicate predicate, HandlerFunction<ServerResponse> handlerFunction) {
        return route(predicate, handlerFunction);
    }
}

