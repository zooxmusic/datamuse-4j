package com.zooxmusic.datamuse.api.client.v2;

public class Synonyms extends RelatedWord {
    public Synonyms(String term) {
        super(term);
    }

    @Override
    public String getCode() {
        return "syn";
    }
}
