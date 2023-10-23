package com.tobiasjohansson.eaggregatorms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        // Configure message converters for JSON
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

        // Add error handler if needed

        return restTemplate;
    }
}
