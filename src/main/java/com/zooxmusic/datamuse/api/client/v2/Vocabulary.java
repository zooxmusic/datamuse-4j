package com.zooxmusic.datamuse.api.client.v2;

public abstract class Vocabulary extends SingleType {
    public Vocabulary(String term) {
        super(term);
    }

    @Override
    public String getCommand() {
        return "v";
    }
}
