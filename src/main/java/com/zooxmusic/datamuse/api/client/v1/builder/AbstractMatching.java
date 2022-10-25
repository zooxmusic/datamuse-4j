package com.zooxmusic.datamuse.api.client.v1.builder;

import com.zooxmusic.datamuse.api.client.v1.Matching;
import lombok.Getter;

@Getter
public abstract class AbstractMatching implements Matching {
    private final String searchTerm;

    public String getSearchTerm() {
        return searchTerm;
    }

    public AbstractMatching(String searchTerm) {
        this.searchTerm = searchTerm;
    }

}
