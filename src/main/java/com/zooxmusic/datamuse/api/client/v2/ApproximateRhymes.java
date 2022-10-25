package com.zooxmusic.datamuse.api.client.v2;

public class ApproximateRhymes extends RelatedWord {
    public ApproximateRhymes(String term) {
        super(term);
    }

    @Override
    public String getCode() {
        return "nry";
    }
}
