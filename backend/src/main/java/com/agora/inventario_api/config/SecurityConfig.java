package com.agora.inventario_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Configuración de Spring Security
 * 
 * IMPORTANTE: Esta configuración está permitiendo acceso a TODOS los endpoints
 * sin autenticación (solo para desarrollo/pruebas).
 * 
 * En producción, deberías proteger los endpoints sensibles.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            // Desactivar CSRF (Cross-Site Request Forgery) para APIs REST
            // CSRF se usa principalmente para aplicaciones web con formularios HTML
            .csrf(csrf -> csrf.disable())
            
            // Configurar autorización de peticiones
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll()  // ⚠️ PERMITIR TODO (solo para desarrollo)
            );
        
        return http.build();
    }
}
