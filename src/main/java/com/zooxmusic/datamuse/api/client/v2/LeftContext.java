package com.zooxmusic.datamuse.api.client.v2;

public class LeftContext extends SingleType {
    public LeftContext(String term) {
        super(term);
    }

    @Override
    public String getCommand() {
        return "lc";
    }
}
