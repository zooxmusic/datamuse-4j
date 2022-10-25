package com.zooxmusic.datamuse.api.client.v1;

public class QBuilder {

   public static class Results {
        LeftContext leftContext;
        RightContext rightContext;
        Metadata metadata;
        int max = 1000;
        boolean queryEcho = false;
    }
    class LeftContext {

    }
    class RightContext {

    }
    class Metadata {

    }


    class Topic {
        String value;
    }


    public static class Suggestions {

    }

    public interface Matching {

    }

    abstract class AbstractMatching implements Matching {
        private String term;
        AbstractMatching(String term) {
            this.term = term;
        }
    }
    public class SoundsLike extends AbstractMatching {
        SoundsLike(String term) {
            super(term);
        }
    }
    public class SpelledLike extends AbstractMatching {

        SpelledLike(String term) {
            super(term);
        }
    }
    public class MeansLike extends AbstractMatching {

        MeansLike(String term) {
            super(term);
        }
    }
    public class RelatedTo extends AbstractMatching {

        public RelatedTo(String term) {
            super(term);
        }
    }







}
