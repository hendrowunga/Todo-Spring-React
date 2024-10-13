package com.hendro.controllers;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Mengizinkan semua permintaan ke endpoint yang diawali dengan /api/
                .allowedOrigins("http://localhost:3000") // Ganti dengan URL front-end Anda
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Metode yang diizinkan
                .allowedHeaders("*") // Mengizinkan semua header
                .allowCredentials(true); // Mengizinkan kredensial (seperti cookies)
    }
}
