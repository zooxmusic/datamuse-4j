package com.zooxmusic.datamuse.api.client.v2;

public class KindOf extends RelatedWord {
    public KindOf(String term) {
        super(term);
    }

    @Override
    public String getCode() {
        return "spf";
    }
}
