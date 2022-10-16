package com.zooxmusic.datamuse.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatamuseResult {
    private String word;
    private Integer score;
    private Integer numSyllables;

}