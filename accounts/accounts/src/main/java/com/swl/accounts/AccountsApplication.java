package com.swl.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.models.annotations.OpenAPI30;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice API Documentation",
				description = "SWL Accounts microservice API Documentation",
				version = "v1",
				contact = @Contact(
						name = "San Wai Lwin",
						email = "sanwailwin@gmail.com",
						url = "https://google.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://google.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "SWL Accounts microservice REST API Documentation",
				url = "http://localhost:8080/swagger-ui/index.htm"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
