package com.zooxmusic.datamuse.api.client.v2;

import com.zooxmusic.datamuse.api.UrlEncoder;
import lombok.Getter;



@Getter
public abstract class AbstractType {
    private final String term;
    public abstract String getCommand();
    public AbstractType(final String term) {
        this.term = term;
    }

    public String queryPart() {
        return String.format("%s=%s", getCommand(), UrlEncoder.encodeValue(getTerm()));
    }


}
