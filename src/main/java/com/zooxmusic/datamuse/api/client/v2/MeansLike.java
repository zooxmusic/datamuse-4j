package com.zooxmusic.datamuse.api.client.v2;

public class MeansLike extends AbstractType{
    private final String term = "";
    public MeansLike(final String term) {
        super(term);
    }
    @Override
    public String getCommand() {
        return "ml";
    }
}
