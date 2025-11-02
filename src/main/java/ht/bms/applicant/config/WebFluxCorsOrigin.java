package ht.bms.applicant.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
//@EnableWebFlux
public class WebFluxCorsOrigin  implements WebFluxConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/api/v1/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowedHeaders("Authorization");
    }
}

