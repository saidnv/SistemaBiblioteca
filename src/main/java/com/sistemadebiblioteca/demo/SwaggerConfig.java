package com.sistemadebiblioteca.demo;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuración de Swagger / OpenAPI para la documentación del sistema de biblioteca.
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI bibliotecaOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Sistema de Biblioteca API")
                        .version("1.0")
                        .description("Documentación de la API para el sistema de biblioteca desarrollado con arquitectura hexagonal")
                        .termsOfService("http://swagger.io/terms/")
                        .license(new io.swagger.v3.oas.models.info.License().name("Apache 2.0").url("http://springdoc.org"))
                );
    }
}
