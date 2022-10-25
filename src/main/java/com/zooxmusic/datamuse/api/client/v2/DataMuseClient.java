package com.zooxmusic.datamuse.api.client.v2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collection;

@Slf4j
@Component
public class DataMuseClient {

    @Value("${datamuse.url}")
    private String datamuseUrl;

    public Collection<DataMuseResult> query(final Endpoint endpoint) {

        String url = endpoint.qs(this.datamuseUrl);

        log.info("Querying datamuse api at url: " + url);

        String json = WebClient.create().get()
                .uri(url)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return new Gson().fromJson(json, new TypeToken<Collection<DataMuseResult>>(){}.getType());
    }
}
