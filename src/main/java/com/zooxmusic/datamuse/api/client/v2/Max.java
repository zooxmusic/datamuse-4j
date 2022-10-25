package com.zooxmusic.datamuse.api.client.v2;

public class Max extends SingleType {
    public Max(int max) {
        super(String.valueOf(max));
    }

    @Override
    public String getCommand() {
        return "max";
    }
}
