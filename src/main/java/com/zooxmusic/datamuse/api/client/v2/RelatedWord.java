package com.zooxmusic.datamuse.api.client.v2;

public abstract class RelatedWord extends AbstractType{
    private final String term = "";
    public RelatedWord(final String term) {
        super(term);
    }
    public abstract String getCode();
    @Override
    public String getCommand() {
        return String.format("rel_%s", getCode());
    }
}
