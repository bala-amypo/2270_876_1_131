package com.example.demo.security;

import com.example.demo.repository.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public AppUserRepository appUserRepository() {
        return new AppUserRepositoryImpl();
    }
}
