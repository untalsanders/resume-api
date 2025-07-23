package com.untalsanders.resume.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Resume API documentation")
                        .version("0.0.1-SNAPSHOT")
                        .description("This is a REST API to manage and retrieve resume information about a person.")
                );
    }
}
