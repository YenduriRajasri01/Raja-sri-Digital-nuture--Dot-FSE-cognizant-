package com.example.resiliencegateway.config;

import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.cloud.client.circuitbreaker.ReactiveCircuitBreakerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResilienceConfiguration {

    @Bean
    public Customizer<ReactiveCircuitBreakerFactory<?, ?>> defaultCustomizer() {
        return factory -> {
            // Default Circuit Breaker Configuration
        };
    }
}