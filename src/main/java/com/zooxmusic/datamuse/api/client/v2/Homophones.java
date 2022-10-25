package com.zooxmusic.datamuse.api.client.v2;

public class Homophones extends RelatedWord {
    public Homophones(String term) {
        super(term);
    }

    @Override
    public String getCode() {
        return "hom";
    }
}
