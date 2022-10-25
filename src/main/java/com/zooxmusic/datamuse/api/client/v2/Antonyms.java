package com.zooxmusic.datamuse.api.client.v2;

public class Antonyms extends RelatedWord {
    public Antonyms(String term) {
        super(term);
    }

    @Override
    public String getCode() {
        return "ant";
    }
}
