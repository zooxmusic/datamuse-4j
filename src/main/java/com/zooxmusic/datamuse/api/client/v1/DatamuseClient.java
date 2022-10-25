package com.zooxmusic.datamuse.api.client.v1;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zooxmusic.datamuse.api.client.v1.builder.Query;
import com.zooxmusic.datamuse.api.client.v2.DataMuseQuery;
import com.zooxmusic.datamuse.api.client.v2.Endpoint;
import com.zooxmusic.datamuse.api.model.DatamuseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;

/**
 * A handler for making calls to the Datamuse RESTful API.
 *
 * @author sjblair
 * @since 21/02/15
 */
@Component
public class DatamuseClient {

    @Autowired
    private UriComponentsBuilder uriComponentsBuilder;

    @PostConstruct
    public void init() {
        Query.init(uriComponentsBuilder);
    }
    @Value("${datamuse.url}")
    private String datamuseUrl;

    private String wordsRdUrl(final String qs) {
        return wordsUrl("rd", qs);
    }
    private String wordsSpUrl(final String qs) {
        return wordsUrl("sp", qs);
    }
    private String wordsSlUrl(final String qs) {
        return wordsUrl("sl", qs);
    }
    private String suggestionsUrl(final String qs) {
        return String.format("%s/sug?s=%s", datamuseUrl, qs);
    }

    private String wordsUrl(final String name, final String qs) {
        return String.format("%s/words?%s=%s", datamuseUrl, name, qs);
    }

    /**
     * Returns a list of similar words to the word/phrase supplied.
     * @param word A word of phrase.
     * @return A list of similar words.
     */
    public String findSimilar(String word) {
        String s = word.replaceAll(" ", "+");
        return getJSON(wordsRdUrl(s));
        //return getJSON("http://api.datamuse.com/words?rd="+s);
    }

    /**
     * Returns a list of similar words to the word/phrase supplied beginning with the specified letter(s).
     * @param word A word or phrase.
     * @param startLetter The letter(s) the similar words should begin with.
     * @return A list of similar words.
     */
    public String findSimilarStartsWith(String word, String startLetter) {
        String s = word.replaceAll(" ", "+");
        return getJSON(wordsRdUrl(s+"&sp="+startLetter+"*"));
        //return getJSON("http://api.datamuse.com/words?rd="+s+"&sp="+startLetter+"*");
    }

    /**
     * Returns a list of similar words to the word/phrase supplied ending with the specified letter(s).
     * @param word A word or phrase.
     * @param endLetter The letter(s) the similar words should end with.
     * @return A list of similar words.
     */
    public String findSimilarEndsWith(String word, String endLetter) {
        String s = word.replaceAll(" ", "+");
        return getJSON(wordsRdUrl(s+"&sp=*"+endLetter));
        //return getJSON("http://api.datamuse.com/words?rd="+s+"&sp=*"+endLetter);
    }

    /**
     * Returns a list of words beginning and ending with the specified letters and with the specified number of letters
     * in between.
     * @param startLetter The letter(s) the similar words should start with.
     * @param endLetter The letter(s) the similar words should end with.
     * @param numberMissing The number of letters between the start and end letters
     * @return A list of matching words.
     */
    public String wordsStartingWithEndingWith(String startLetter, String endLetter, int numberMissing) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberMissing; i++) {
            sb.append("?");
        }
        return getJSON(wordsSpUrl(startLetter + sb + endLetter));
        //return getJSON("http://api.datamuse.com/words?sp=" + startLetter + sb + endLetter);
    }

    /**
     * Returns a list of words beginning and ending with the specified letters and with an unspecified number of letters
     * in between.
     * @param startLetter The letter(s) the similar words should start with.
     * @param endLetter The letter(s) the similar words should end with.
     * @return A list of matching words.
     */
    public String wordsStartingWithEndingWith(String startLetter, String endLetter) {
        return getJSON(wordsSpUrl(startLetter + "*" + endLetter));
        //return getJSON("http://api.datamuse.com/words?sp=" + startLetter + "*" + endLetter);
    }

    /**
     * Find words which sound the same as the specified word/phrase when spoken.
     * @param word A word or phrase.
     * @return A list of words/phrases which sound similiar when spoken.
     */
    public String soundsSimilar(String word) {
        String s = word.replaceAll(" ", "+");
        return getJSON(wordsSlUrl(s));
        //return getJSON("http://api.datamuse.com/words?sl=" + s);
    }

    /**
     * Find words which are spelt the same as the specified word/phrase.
     * @param word A word or phrase.
     * @return A list of words/phrases which are spelt similar.
     */
    public String speltSimilar(String word) {
        String s = word.replaceAll(" ", "+");
        return getJSON(wordsSpUrl(s));
        //return getJSON("http://api.datamuse.com/words?sp=" + s);
    }

    /**
     * Returns suggestions for what the user may be typing based on what they have typed so far. Useful for
     * autocomplete on forms.
     * @param word The current word or phrase.
     * @return Suggestions of what the user may be typing.
     */
    public String prefixHintSuggestions(String word) {
        String s = word.replaceAll(" ", "+");
        return getJSON(suggestionsUrl(s));
        //return getJSON("http://api.datamuse.com/sug?s=" + s);
    }

    public Collection<DatamuseResult> getResult(final Endpoint endpoint) {

        String json = WebClient.create().get()
                .uri(endpoint.qs(this.datamuseUrl))
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return new Gson().fromJson(json, new TypeToken<Collection<DatamuseResult>>(){}.getType());
    }
    /**
     * Query a URL for their source code.
     * @param url The page's URL.
     * @return The source code.
     */
    private String getJSON(String url) {
        URL datamuse;
        URLConnection dc;
        StringBuilder s = null;
        try {
            datamuse = new URL(url);
            dc = datamuse.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(dc.getInputStream(), "UTF-8"));
            String inputLine;
            s = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                s.append(inputLine);
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s != null ? s.toString() : null;
    }
}
