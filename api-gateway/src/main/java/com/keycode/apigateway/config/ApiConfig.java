package com.keycode.apigateway.config;

import com.keycode.apigateway.filter.SessionFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {
    @Bean
    public SessionFilter sessionFilter(){
        return new SessionFilter();
    }
}
