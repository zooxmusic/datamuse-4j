package com.zooxmusic.datamuse.api.client.v2;

public class Metadata extends SingleType {

    public static MetadataBuilder builder() {
        return new MetadataBuilder();
    }
    static class MetadataBuilder {
        private StringBuilder builder = new StringBuilder();
        public MetadataBuilder definitions() {
            if(builder.indexOf("d") > -1) return this;
            builder.append('d');
            return this;
        }
        public MetadataBuilder partsOfSpeech() {
            if(builder.indexOf("p") > -1) return this;
            builder.append('p');
            return this;
        }
        public MetadataBuilder syllableCount() {
            if(builder.indexOf("s") > -1) return this;
            builder.append('s');
            return this;
        }
        public MetadataBuilder pronunciation() {
            if(builder.indexOf("r") > -1) return this;
            builder.append('r');
            return this;
        }
        public MetadataBuilder wordFrequency() {
            if(builder.indexOf("f") > -1) return this;
            builder.append('f');
            return this;
        }
        public Metadata build() {
            return new Metadata(this.builder.toString());
        }
    }

    private Metadata(final String term) {
        super(term);
    }

    @Override
    public String getCommand() {
        return "md";
    }
}
