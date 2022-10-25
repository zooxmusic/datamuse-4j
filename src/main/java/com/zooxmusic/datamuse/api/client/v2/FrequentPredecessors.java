package com.zooxmusic.datamuse.api.client.v2;

public class FrequentPredecessors extends RelatedWord {
    public FrequentPredecessors(String term) {
        super(term);
    }

    @Override
    public String getCode() {
        return "bgb";
    }
}
