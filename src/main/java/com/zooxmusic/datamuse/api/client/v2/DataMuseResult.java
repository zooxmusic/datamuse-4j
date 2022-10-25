package com.zooxmusic.datamuse.api.client.v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataMuseResult {
    private String word;
    private Integer score;
    private Integer numSyllables;
    private ArrayList<String> tags;
    private ArrayList<String> defs;

}