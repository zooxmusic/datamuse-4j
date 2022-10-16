package com.zooxmusic.datamuse.api.client;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zooxmusic.datamuse.api.config.AppConfig;
import com.zooxmusic.datamuse.api.model.DatamuseResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.util.UriComponentsBuilder;

import java.lang.reflect.Type;
import java.util.Collection;

@SpringBootTest(classes = AppConfig.class)
public class DatamuseClientTests {

    private final DatamuseClient datamuseClient;
    private final UriComponentsBuilder uriComponentsBuilder;

    @Autowired
    public DatamuseClientTests(final DatamuseClient datamuseClient, final UriComponentsBuilder uriComponentsBuilder) {
        this.datamuseClient = datamuseClient;
        this.uriComponentsBuilder = uriComponentsBuilder;
    }

    @Test
    public void testQueryWorks() {
        DatamuseQuery query = DatamuseQuery.builder(uriComponentsBuilder)
                .rhymes("egg")
                .topics("ocean")
                .build();
        Collection<DatamuseResult> result = datamuseClient.getResult(query.getUrl());

        System.out.println(result.toString());
    }
}
