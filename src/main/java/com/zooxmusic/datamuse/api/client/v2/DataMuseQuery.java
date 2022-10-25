package com.zooxmusic.datamuse.api.client.v2;

public class DataMuseQuery {

    public static Words words() {
        return new Words();
    }

    public static void main(String...args) {

        Words words = Words.builder()
                .rhymes("the gates of hell")
                .meansLike("gate")
                .topic("hell")
                .topic("heaven")
                .leftContext("left context")
                .rightContext("right context")
                .metadata(Metadata.builder()
                        .definitions()
                        .syllableCount()
                        .wordFrequency()
                        .build())
                .max(1000)
                .queryEcho("sp&md=fr")
                .build();

        System.out.println(words.qs("http://api.datamuse.com"));

//        Words words = DataMuseQuery.words();
//        words.addType(new Rhymes("the gates of hell"));
//        words.addType(new MeansLike("opening your door here"));
//
//        words.addSingleType(new English());
//        Topics topics = new Topics();
//        topics.addTerm("hell");
//        words.addSingleType(topics);
//        words.addSingleType(new LeftContext("niche"));
//        Metadata md = new Metadata();
//        md.definitions();
//        md.wordFrequency();
//        md.pronunciation();
//        md.syllableCount();
//        md.partsOfSpeech();
//        words.addSingleType(md);
//
//
//        QueryEcho qe = new QueryEcho();
//        qe.addType(new SpelledLike(""));
//        Metadata md2 = new Metadata();
//        md2.wordFrequency();
//        md2.pronunciation();
//        qe.addType(md2);
//        //words.addSingleType(qe);
//
//
//        System.out.println(words.qs("http://api.datamuse.com"));
    }
}
