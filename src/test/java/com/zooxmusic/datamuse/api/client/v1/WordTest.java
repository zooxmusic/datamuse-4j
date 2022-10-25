package com.zooxmusic.datamuse.api.client.v1;

import com.zooxmusic.datamuse.api.client.v2.*;
import com.zooxmusic.datamuse.api.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;

@SpringBootTest(classes = AppConfig.class)
public class WordTest {

    @Test
    public void testWordQuery() {

        Words words = DataMuseQuery.words();
        words.addType(new Rhymes("shitake"));
        words.addType(new MeansLike("your ass"));
        words.addType(new English());

        try {
            System.out.println(words.qs("http://api.datamuse.com/"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

    }


}
