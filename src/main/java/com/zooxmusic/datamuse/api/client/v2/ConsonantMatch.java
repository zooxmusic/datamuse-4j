package com.zooxmusic.datamuse.api.client.v2;

public class ConsonantMatch extends RelatedWord {
    public ConsonantMatch(String term) {
        super(term);
    }

    @Override
    public String getCode() {
        return "cns";
    }
}
