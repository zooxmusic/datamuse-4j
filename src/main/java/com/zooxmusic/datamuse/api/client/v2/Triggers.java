package com.zooxmusic.datamuse.api.client.v2;

public class Triggers extends RelatedWord {
    public Triggers(String term) {
        super(term);
    }

    @Override
    public String getCode() {
        return "trg";
    }
}
