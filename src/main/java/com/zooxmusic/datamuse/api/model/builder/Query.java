package com.zooxmusic.datamuse.api.model.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Query {

    private String matcher;
    private String searchTerm;
    private Predicate predicate;

//    public Query(String matcher, String searchTerm) {
//        this.matcher = matcher;
//        this.searchTerm = searchTerm;
//    }

//    public static QueryBuilder builder() {
//        return new QueryBuilder();
//    }
//
//    static class QueryBuilder {
//
//        private String matcher;
//        private String searchTerm;
//
//        public QueryBuilder matcher(String matcher) {
//            this.matcher = matcher;
//            return this;
//        }
//        public QueryBuilder searchTerm(String searchTerm) {
//            this.searchTerm = searchTerm;
//            return this;
//        }
//        public Query build() {
//            return new Query(this.matcher, this.searchTerm);
//        }
//    }

}

