package com.zooxmusic.datamuse.api.model.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Metadata {
//    static class MetadataBuilder {
//        private char d;
//        private char p;
//        private char s
//        ;
//        private char f;
//        private char r;
//
//        public MetadataBuilder d() {
//            this.d = 'd';
//            return this;
//        }
//        public MetadataBuilder p() {
//            this.p = 'p';
//            return this;
//        }
//
//        public MetadataBuilder s() {
//            this.s = 's';
//            return this;
//        }
//
//        public MetadataBuilder f() {
//            this.f = 'f';
//            return this;
//        }
//
//        public MetadataBuilder r() {
//            this.r = 'r';
//            return this;
//        }
//
//        public Metadata build() {
//            return new Metadata(this.d, this.p, this.s, this.f, this.r);
//        }
//
//    }

    private char d;
    private char p;
    private char s;
    private char f;
    private char r;

//    public Metadata(char d, char p, char s, char f, char r) {
//        this.d = d;
//        this.p = p;
//        this.s = s;
//        this.f = f;
//        this.r = r;
//    }

}
