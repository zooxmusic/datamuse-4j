package com.zooxmusic.datamuse.api.client.v2;

public class Rhymes extends RelatedWord {
    public Rhymes(String term) {
        super(term);
    }

    @Override
    public String getCode() {
        return "rhy";
    }
}
