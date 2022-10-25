package com.zooxmusic.datamuse.api.client.v2;

public class Words extends Endpoint {

    public static WordsQuery builder() {
        return new WordsQuery();
    }
    public Words() {
        super(EndpointTypes.words);
    }


}
