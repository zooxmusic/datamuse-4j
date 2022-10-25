package com.zooxmusic.datamuse.api.client.v2;

public class SoundsLike extends AbstractType{
    private final String term = "";
    public SoundsLike(final String term) {
        super(term);
    }
    @Override
    public String getCommand() {
        return "sl";
    }
}
