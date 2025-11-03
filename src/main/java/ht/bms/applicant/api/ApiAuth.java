package ht.bms.applicant.api;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class ApiAuth {

    private final WebClient client;
    public ApiAuth(WebClient.Builder builder) {

        this.client = builder
                .baseUrl("http://localhost:6290/api/v1/auth").build();
    }

    public Mono<AccountBean> isAUth(String token) {
        return this.client.post().uri(uriBuilder -> uriBuilder.path("/isAuth")
                        .build())
                .header(HttpHeaders.AUTHORIZATION,  token)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(AccountBean.class);
    }
}
