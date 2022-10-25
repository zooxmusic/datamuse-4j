package com.zooxmusic.datamuse.api.client.v2;

public class MoreGeneralThan extends RelatedWord {
    public MoreGeneralThan(String term) {
        super(term);
    }

    @Override
    public String getCode() {
        return "gen";
    }
}
