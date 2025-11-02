package ht.bms.applicant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@EnableRetry
@SpringBootApplication
public class ApplicantApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApplicantApplication.class, args);

	}


}
