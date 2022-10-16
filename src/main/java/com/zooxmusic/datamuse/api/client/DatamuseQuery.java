package com.zooxmusic.datamuse.api.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.List;

@Getter
public class DatamuseQuery {
    private String url;
    enum EndpointTypes {
        Words("words"),
        Suggestions("sug");
        private String value;
        private EndpointTypes(String value) {
            this.value = value;
        }
    }
    enum RelatedWordsTypes {
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
        private RelatedWordsTypes(String value) {
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
        RelatedWords("rel_%s"),
        Max("max"),
        MetaData("md"),
        QueryEcho("qe");


        private String value;
        private Types(String value) {
            this.value = value;
        }
    }
    static class RelatedWords {
        private static final String PREFIX = "rel_";
        private final String value;
        private RelatedWords(final String value) {
            this.value = String.format("%s%s", PREFIX, value);
        }
        public static RelatedWords rhymes() {
            return create(RelatedWordsTypes.Rhymes);
        }
        private static RelatedWords create(RelatedWordsTypes type) {
            return new RelatedWords(type.value);
        }
    }
    public DatamuseQuery(String url) {
        this.url = url;
    }

    public static DatamuseQueryBuilder builder(final UriComponentsBuilder uriComponentsBuilder) {
        return new DatamuseQueryBuilder(uriComponentsBuilder);
    }
    public static class DatamuseQueryBuilder {

        private long created;
        private boolean created$set;
        private String name;
        private int age;
        private List<String> occupations;
        private RelatedWords relatedWords;
        private MultiValueMap<String, String> queryParameters  = new LinkedMultiValueMap<>();

        private final UriComponentsBuilder uriComponentsBuilder;
        DatamuseQueryBuilder(final UriComponentsBuilder uriComponentsBuilder) {
            this.uriComponentsBuilder = uriComponentsBuilder;
        }

        public DatamuseQueryBuilder rhymes(String value) {
            this.queryParameters.add(RelatedWords.rhymes().value, value);
            return this;
        }
        public DatamuseQueryBuilder topics(String value) {
            this.queryParameters.add(Types.Topics.value, value);
            return this;
        }

        public DatamuseQuery build() {
            UriComponents uriComponents = this.uriComponentsBuilder
                    .queryParams(queryParameters)
                    .buildAndExpand(EndpointTypes.Words.value)
                    .encode();
            return new DatamuseQuery(uriComponents.toUriString());
        }

    }
}
