package com.zooxmusic.datamuse.api.client.v2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class WordsQuery {

    private Vocabulary vocabulary = null;
    private Topics topics = null;
    private List<AbstractType> types = new ArrayList<>();
    private Set<SingleType> singleTypes = new LinkedHashSet<>();

    public WordsQuery meansLike(final String term) {
        this.types.add(new MeansLike(term));
        return this;
    }
    public WordsQuery soundsLike(final String term) {
        this.types.add(new SoundsLike(term));
        return this;
    }
    public WordsQuery spelledLike(final String term) {
        this.types.add(new SpelledLike(term));
        return this;
    }
    public WordsQuery rhymes(final String term) {
        this.types.add(new Rhymes(term));
        return this;
    }
    public WordsQuery approximateRhymes(final String term) {
        this.types.add(new ApproximateRhymes(term));
        return this;
    }
    public WordsQuery synonyms(final String term) {
        this.types.add(new Synonyms(term));
        return this;
    }
    public WordsQuery antonyms(final String term) {
        this.types.add(new Antonyms(term));
        return this;
    }
    public WordsQuery jja(final String term) {
        this.types.add(new Jja(term));
        return this;
    }
    public WordsQuery jjb(final String term) {
        this.types.add(new Jjb(term));
        return this;
    }
    public WordsQuery triggers(final String term) {
        this.types.add(new Triggers(term));
        return this;
    }
    public WordsQuery kindOf(final String term) {
        this.types.add(new KindOf(term));
        return this;
    }
    public WordsQuery moreGeneralThan(final String term) {
        this.types.add(new MoreGeneralThan(term));
        return this;
    }
    public WordsQuery comprises(final String term) {
        this.types.add(new Comprises(term));
        return this;
    }
    public WordsQuery partOf(final String term) {
        this.types.add(new PartOf(term));
        return this;
    }
    public WordsQuery frequentFollowers(final String term) {
        this.types.add(new FrequentFollowers(term));
        return this;
    }
    public WordsQuery frequentPredecessors(final String term) {
        this.types.add(new FrequentPredecessors(term));
        return this;
    }
    public WordsQuery homophones(final String term) {
        this.types.add(new Homophones(term));
        return this;
    }
    public WordsQuery consonantMatch(final String term) {
        this.types.add(new ConsonantMatch(term));
        return this;
    }
    public WordsQuery english() {
        this.vocabulary = new English();
        return this;
    }
    public WordsQuery spanish() {
        this.vocabulary = new Spanish();
        return this;
    }
    public WordsQuery enWiki() {
        this.vocabulary = new EnWiki();
        return this;
    }
    public WordsQuery topic(final String term) {
        if(null == this.topics) {
            this.topics = new Topics();
            this.singleTypes.add(topics);
        }
        this.topics.addTerm(term);
        return this;
    }
    public WordsQuery leftContext(final String term) {
        this.singleTypes.add(new LeftContext(term));
        return this;
    }
    public WordsQuery rightContext(final String term) {
        this.singleTypes.add(new RightContext(term));
        return this;
    }
    public WordsQuery metadata(final Metadata md) {
        this.singleTypes.add(md);
        return this;
    }
    public WordsQuery max(final int max) {
        this.singleTypes.add(new Max(max));
        return this;
    }

    // Example query = sp&md=fr
    public WordsQuery queryEcho(final String query) {
        this.singleTypes.add(new QueryEcho(query));
        return this;
    }

    public Words build() {
        Words words = new Words();
        words.setTypes(this.types);
        if(null != this.vocabulary)
            words.addSingleType(this.vocabulary);
        if(null != this.topics)
            words.addSingleType(topics);
        words.setSingleTypes(this.singleTypes);
        return words;
    }


}
