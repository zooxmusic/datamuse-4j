package com.zooxmusic.datamuse.api.client.v2;

public class FrequentFollowers extends RelatedWord {
    public FrequentFollowers(String term) {
        super(term);
    }

    @Override
    public String getCode() {
        return "bga";
    }
}
