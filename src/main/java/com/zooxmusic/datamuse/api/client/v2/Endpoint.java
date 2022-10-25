package com.zooxmusic.datamuse.api.client.v2;

import lombok.Getter;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;

public abstract class Endpoint {

    enum EndpointTypes {
        words, sug
    }
    private final EndpointTypes matcher;

    public Endpoint(final EndpointTypes matcher) {
        this.matcher = matcher;
    }
    private List<AbstractType> types = new ArrayList<>();
    private Set<SingleType> singleTypes = new LinkedHashSet<>();

    public void setSingleTypes(Set<SingleType> singleTypes) {
        this.singleTypes = singleTypes;
    }

    public void setTypes(List<AbstractType> types) {
        this.types = types;
    }

    public void addType(final AbstractType type) {
        this.types.add(type);
    }

    public void addSingleType(final SingleType singleType) {
        this.singleTypes.add(singleType);
    }
    public String qs(final String url) {
        StringBuilder builder = new StringBuilder(String.format("%s/%s?", url, matcher));
        int counter = 1;
        int size = types.size() + singleTypes.size();
        for(AbstractType type : types) {
            builder.append(type.queryPart());
            counter++;
            if(counter <= size) {
                builder.append("&");
            }
        }
        for(SingleType type : singleTypes) {
            builder.append(type.queryPart());
            counter++;
            if(counter <= size) {
                builder.append("&");
            }
        }
        return builder.toString();
    }


}
