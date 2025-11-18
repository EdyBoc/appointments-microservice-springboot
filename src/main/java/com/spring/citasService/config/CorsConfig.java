
package com.spring.citasService.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")  // Permitir todas las rutas
                        .allowedOrigins("http://localhost:4200")  // Permitir peticiones de Angular
                        .allowedMethods("*")  // Permitir todos los métodos HTTP
                        .allowedHeaders("*")  // Permitir todos los encabezados
                        .allowCredentials(true);  // Permitir autenticación
            }
        };
    }
}
