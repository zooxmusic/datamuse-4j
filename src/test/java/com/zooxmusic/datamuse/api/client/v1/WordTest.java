package com.zooxmusic.datamuse.api.client.v1;

import com.zooxmusic.datamuse.api.client.v2.*;
import com.zooxmusic.datamuse.api.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;

@SpringBootTest(classes = AppConfig.class)
public class WordTest {

    @Autowired
    private DataMuseClient dataMuseClient;

    @Test
    public void testWordQuery() {

        Words words = Words.builder()
                .approximateRhymes("electric")
                .english()
                .metadata(Metadata.create("srfdp"))
                .max(20)
                .build();

        Collection<DataMuseResult> results = dataMuseClient.query(words);
        for(DataMuseResult result : results) {
            System.out.println(result);
        }

    }


}
