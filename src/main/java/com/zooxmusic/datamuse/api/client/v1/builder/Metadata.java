package com.zooxmusic.datamuse.api.client.v1.builder;


public class Metadata {

    enum Vocabulary {
        ENGLISH, SPANISH, WIKI
    }

    enum Values {
        Definitions("d"),
        PartsOfSpeech("p"),
        SyllableCount("s"),
        Pronunciation("r"),
        WordFrequency("f");
        private String value;

        Values(String value) {
            this.value = value;
        }
    }
    static WithMetadata withMetadataInstance = null;

    private Metadata(String values) {
        this.values = values;
    }

    private String values = "";
    static class WithMetadata {
         StringBuilder stringBuilder = new StringBuilder();
        public WithMetadata definitions() {
            this.stringBuilder.append(Values.Definitions.value);
            return this;
        }
        public WithMetadata partsOfSpeech() {
            this.stringBuilder.append(Values.PartsOfSpeech.value);
            return this;
        }
        public WithMetadata pronunciation() {
            this.stringBuilder.append(Values.Pronunciation.value);
            return this;
        }
        public WithMetadata syllableCount() {
            this.stringBuilder.append(Values.SyllableCount.value);
            return this;
        }
        public WithMetadata wordFrequency() {
            this.stringBuilder.append(Values.WordFrequency.value);
            return this;
        }

    }
}
