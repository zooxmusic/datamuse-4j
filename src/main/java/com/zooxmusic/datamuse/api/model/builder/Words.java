package com.zooxmusic.datamuse.api.model.builder;


import java.util.HashMap;
import java.util.Map;

public class Words {


    enum RelatedWordCodes {
        JJA("jja"),
        JJB("jjb"),
        Synonyms("syn"),
        Triggers("trg"),
        Antonyms("ant"),
        KindOf("spc"),
        MoreGeneralThan("gen"),
        Compromises("com"),
        PartOf("par"),
        BGA("bga"),
        BGB("bgb"),
        Rhymes("rhy"),
        ApproximateRhymes("nry"),
        Homophones("hom"),
        ConstantMatch("cns");

        private String value;
        private RelatedWordCodes(String value) {
            this.value = String.format("rel_%s", value);
        }

    }

    private String words = EndpointTypes.Words.value;
    private String sug = EndpointTypes.Suggestions.value;


    StringBuffer query = new StringBuffer();




    class NameValue<K, V> {
        private final K key;
        private final V value;
        NameValue(final K key, final V value) {
            this.key = key;
            this.value = value;
        }
    }

    class Matcher<K, V> extends NameValue<K, V> {
        public Matcher(final K words, final V term) {
            super(words, term);
        }
    }

    class SingleFilter<K, V> extends NameValue<K, V> {
        SingleFilter(final K key, final V value) {
            super(key, value);
        }
    }

    class MultiValueFilter<K, V>{
        private final K key;
        private final V values;
        public MultiValueFilter(final K key, final V values) {
            this.key = key;
            this.values = values;
        }
    }

    private String searchTerm = "doggie doo";
    private Matcher ml = new Matcher(Types.MeansLike, searchTerm);
    private Matcher sl = new Matcher(Types.SoundsLike, searchTerm);
    private Matcher sp = new Matcher(Types.SpelledLike, searchTerm);



//    private Matcher ml = new Matcher<Types.ml, term>(EndpointTypes.Words, term);

    class RelatedTerm<RelatedWordCodes,String> {
        private final Words.RelatedWordCodes key;
        private final String value;
        public RelatedTerm(final Words.RelatedWordCodes key, final String value) {
            this.key = key;
            this.value = value;
        }
    }

//       private String sl;
//    private String sp;

    private String url;
    enum EndpointTypes {
        Words("words"),
        Suggestions("sug");
        private String value;
        private EndpointTypes(String value) {
            this.value = value;
        }
    }

    enum Types {
        MeansLike("ml"),
        SoundsLike("sl"),
        SpelledLike("sp"),
        Vocabulary("v"),
        Topics("topics"),
        LeftContext("lc"),
        RightContext("rc"),
        Max("max"),
        MetaData("md"),
        QueryEcho("qe");

        private String value;
        private Types(String value) {
            this.value = value;
        }
    }



//    static class RelatedWords {
//        private static final String PREFIX = "rel_";
//        private final String value;
//        private RelatedWords(final String value) {
//            this.value = String.format("%s%s", PREFIX, value);
//        }
//        public static DatamuseQuery.RelatedWords rhymes() {
//            return create(DatamuseQuery.RelatedWordsTypes.Rhymes);
//        }
//        private static DatamuseQuery.RelatedWords create(DatamuseQuery.RelatedWordsTypes type) {
//            return new DatamuseQuery.RelatedWords(type.value);
//        }
//    }
//    public DatamuseQuery(String url) {
//        this.url = url;
//    }
//
//    public static DatamuseQuery.DatamuseQueryBuilder builder(final UriComponentsBuilder uriComponentsBuilder) {
//        return new DatamuseQuery.DatamuseQueryBuilder(uriComponentsBuilder);
//    }


}
