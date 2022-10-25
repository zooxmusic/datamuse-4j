package com.zooxmusic.datamuse.api.client.v2;

import java.util.ArrayList;
import java.util.List;

public class Topics extends SingleType {
    private static int MAX = 5;
    private List<String> terms = new ArrayList<String>();

    public Topics() {
        super("fake");
    }

    public void addTerm(final String term) {
        int count = this.terms.size();
        if(count == MAX) throw new RuntimeException("You can only have 5 terms");
        this.terms.add(term);
    }

    public String getTerm() {
        return String.join(",", this.terms);
    }
    @Override
    public String getCommand() {
        return "topics";
    }
}
