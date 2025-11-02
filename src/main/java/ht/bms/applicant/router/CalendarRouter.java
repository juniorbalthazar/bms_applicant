package ht.bms.applicant.router;

import ht.bms.applicant.service.handles.CalendarHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.*;

import static org.springframework.web.reactive.function.server.RequestPredicates.queryParam;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;


@Configuration
public class CalendarRouter {

    private final CalendarHandler calendarHandler;

    public CalendarRouter(CalendarHandler calendarHandler) {
        this.calendarHandler = calendarHandler;
    }

    @Bean
    public RouterFunction<ServerResponse> calendarRoutes(){
        return RouterFunctions.route()
                .path("/api/v1/calendar", builder -> builder
                        .add(baseRoute(RequestPredicates.GET("/getDate")
                                .and(queryParam("date", t -> true)),calendarHandler::getDate))
                )//.onError(exceptionHandler::handleException)
                .build();
    }


    private RouterFunction<ServerResponse> baseRoute(RequestPredicate predicate, HandlerFunction<ServerResponse> handlerFunction) {
        return route(predicate, handlerFunction);
    }
}

