package com.zooxmusic.datamuse.api.config;

import com.zooxmusic.datamuse.api.client.DatamuseClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.util.UriComponentsBuilder;

@Configuration
public class AppConfig {

    @Value("${datamuse.url}")
    private String datamuseUrl;

    @Bean
    public UriComponentsBuilder uriComponentsBuilder() {
        return UriComponentsBuilder.fromUriString(datamuseUrl);
    }

    @Bean
    public DatamuseClient datamuseClient() {
        return new DatamuseClient();
    }
}
