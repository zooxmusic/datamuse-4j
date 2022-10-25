//package com.zooxmusic.datamuse.api.client;
//
//import com.zooxmusic.datamuse.api.config.AppConfig;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.web.util.UriComponentsBuilder;
//
//@SpringBootTest(classes = AppConfig.class)
//public class DatamuseQueryTests {
//
//    private final UriComponentsBuilder uriComponentsBuilder;
//
//    @Autowired
//    public DatamuseQueryTests(final UriComponentsBuilder uriComponentsBuilder) {
//        this.uriComponentsBuilder = uriComponentsBuilder;
//    }
//
//    @Test
//    public void testQueryStringWorks() {
//        DatamuseQuery query = DatamuseQuery.builder(uriComponentsBuilder)
//                .rhymes("egg")
//                .topics("ocean")
//                .build();
//
//        System.out.println(query.getUrl());
//    }
//}
