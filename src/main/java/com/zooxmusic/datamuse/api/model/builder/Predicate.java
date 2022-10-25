package com.zooxmusic.datamuse.api.model.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Predicate {

//    public static PredicateBuilder builder() {
//        return new PredicateBuilder();
//    }
//    static class PredicateBuilder {
//        private String vocab;
//        private String lc;
//        private String rc;
//        private int max;
//        private String[] topics; // >= 5
//
//        private boolean qe;
//
//        public PredicateBuilder lc(String lc) {
//            this.lc = lc;
//            return this;
//        }
//
//        public PredicateBuilder rc(String rc) {
//            this.rc = rc;
//            return this;
//        }
//
//
//        public PredicateBuilder max(int max) {
//            this.max = max;
//            return this;
//        }
//
//        public PredicateBuilder vocab(String vocab) {
//            this.vocab = vocab;
//            return this;
//        }
//
//        public PredicateBuilder qe(boolean qe) {
//            this.qe = qe;
//            return this;
//        }
//        public PredicateBuilder topics(String...topics) {
//            this.topics = topics;
//            return this;
//        }
//
//        public Predicate build() {
//            return new Predicate(this.vocab, this.lc, this.rc, this.max, this.topics, this.qe);
//        }
//    }


    private String vocab;
    private String lc;
    private String rc;
    private int max;
    private String[] topics; // >= 5
    private boolean qe;
    private Metadata metadata;

//    public Predicate(String vocab, String lc, String rc, int max, String[] topics, boolean qe) {
//        this.vocab = this.vocab;
//        this.lc = this.lc;
//        this.rc = this.rc;
//        this.max = this.max;
//        this.topics = this.topics;
//        this.qe = this.qe;
//    }
}
