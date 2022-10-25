package com.zooxmusic.datamuse.api.client.v2;

public class RightContext extends SingleType {
    public RightContext(String term) {
        super(term);
    }

    @Override
    public String getCommand() {
        return "rc";
    }
}
