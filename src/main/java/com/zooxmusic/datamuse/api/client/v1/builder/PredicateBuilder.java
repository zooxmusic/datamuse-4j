package com.zooxmusic.datamuse.api.client.v1.builder;

public class PredicateBuilder {
//    private final Matching matching;

//    private Predicate.Vocabulary vocabulary = Predicate.Vocabulary.English;
//    @Max(5)
//    private List<String> topics = new ArrayList<>();
//    private String leftContext = "";
//    private String rightContext = "";
//    private int maxResults = 10000;
//    private boolean queryEcho = false;
//
//    public static PredicateBuilder create(Matching matching) {
//        return new PredicateBuilder(matching);
//    }
//    private PredicateBuilder(Matching matching) {
//        this.matching = matching;
//    }
//
//    public PredicateBuilder vocabulary(Predicate.Vocabulary vocabulary) {
//        this.vocabulary = vocabulary;
//        return this;
//    }
//    public PredicateBuilder topic(String topic) {
//        if(this.topics.size() >= 5) {
//            throw new RuntimeException("You can only add 5 topics");
//        }
//        this.topics.add(topic);
//        return this;
//    }
//    public PredicateBuilder topics(String...topics) {
//
//        if(this.topics.size() >= 5) {
//            throw new RuntimeException("You can only add 5 topics");
//        }
//        this.topics.addAll(Arrays.asList(topics));
//        return this;
//    }
//
//    public PredicateBuilder leftContext(String leftContext) {
//        this.leftContext = leftContext;
//        return this;
//    }
//
//    public PredicateBuilder rightContext(String rightContext) {
//        this.rightContext = rightContext;
//        return this;
//    }
//
//    public PredicateBuilder maxResults(int maxResults) {
//        this.maxResults = maxResults;
//        return this;
//    }
//
//    public PredicateBuilder queryEcho() {
//        this.queryEcho = true;
//        return this;
//    }
//
//    public Predicate build() {
//        return Predicate.builder()
//                .maxResults(this.maxResults)
//                .leftContext(this.leftContext)
//                .rightContext(this.rightContext)
//                .queryEcho(this.queryEcho)
//                .vocabulary(this.vocabulary)
//                .topics(this.topics)
//                .matching(this.matching)
//                .build();
//    }
//


//    static class WithPredicate {
//        PredicateBuilder predicateBuilder = null;
//        public WithPredicate(PredicateBuilder predicateBuilder) {
//            this.predicateBuilder = predicateBuilder;
//
//        }
//
//    }
}
