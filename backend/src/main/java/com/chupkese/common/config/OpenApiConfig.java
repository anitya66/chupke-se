package com.chupkese.common.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI chupkeSeOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("CHUPKE SE API")
                        .description(
                                "API documentation for CHUPKE SE - " +
                                "a private relationship-centric social platform."
                        )
                        .version("1.0.0"));
    }
}