package com.cardtracker.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cardtracker.bean.BListResponse;


@Configuration
public class RestHit extends RestTemplate {
	@Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
