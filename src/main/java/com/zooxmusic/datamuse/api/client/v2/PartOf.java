package com.zooxmusic.datamuse.api.client.v2;

public class PartOf extends RelatedWord {
    public PartOf(String term) {
        super(term);
    }

    @Override
    public String getCode() {
        return "par";
    }
}
