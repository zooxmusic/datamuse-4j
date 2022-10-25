package com.zooxmusic.datamuse.api.client.v1.builder;

import lombok.Getter;
import org.springframework.web.util.UriComponentsBuilder;

@Getter
public class Query {
    private static Query instance = null;
    public static Query instance() {
        if(null == Query.instance) {
            Query.instance = new Query();
        }
        return Query.instance;
    }
    private Query(){}

    public static void savePredicate(Predicate predicate) {
        Query.instance().predicate = predicate;
    }
    public static void init(UriComponentsBuilder uriComponentsBuilder) {
        Query.instance().uriComponentsBuilder = uriComponentsBuilder;
    }
    private UriComponentsBuilder uriComponentsBuilder;
    private Predicate predicate;

    public String toUrl() {
        if(null == this.predicate) {
            throw new RuntimeException("You have not set the values for the query");
        }
        if(null == uriComponentsBuilder) {
            throw new RuntimeException("You have to initialize this component with the UriComponentsBuilder");
        }

        String url = "";

        return url;

    }
}
