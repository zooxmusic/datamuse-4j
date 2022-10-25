package com.zooxmusic.datamuse.api.client.v2;

public class SpelledLike extends AbstractType{
    private final String term = "";
    public SpelledLike(final String term) {
        super(term);
    }
    @Override
    public String getCommand() {
        return "sp";
    }
}
