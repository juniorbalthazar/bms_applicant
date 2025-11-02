package ht.bms.applicant.service.handles;

import ht.bms.applicant.service.facade.BookingService;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Service
public class CalendarHandler {

    private BookingService calendarService;

    public CalendarHandler(BookingService calendarService) {
        this.calendarService = calendarService;
    }

    public Mono<ServerResponse> getDate(ServerRequest request) {
        var date = request.queryParam("date").orElse(null);
        return calendarService.getDate(date)
                .flatMap(ServerResponse.ok()::bodyValue)
                .switchIfEmpty(ServerResponse.notFound().build());
    }

}
