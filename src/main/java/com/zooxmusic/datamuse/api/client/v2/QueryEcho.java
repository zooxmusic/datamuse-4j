package com.zooxmusic.datamuse.api.client.v2;

public class QueryEcho extends SingleType {
    public QueryEcho(String query) {
        super(query);
    }

    @Override
    public String getCommand() {
        return "qe";
    }
}
