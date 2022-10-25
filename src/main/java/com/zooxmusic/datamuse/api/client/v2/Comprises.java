package com.zooxmusic.datamuse.api.client.v2;

public class Comprises extends RelatedWord {
    public Comprises(String term) {
        super(term);
    }

    @Override
    public String getCode() {
        return "com";
    }
}
