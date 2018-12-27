package com.stackroute.pe4;

import java.util.Arrays;

public class TextParagraph {

    public String[] sortWords(String input) {
        String[] words={};
        if(input==null)
           return words;
        words=input.trim().toLowerCase().split(" ");
        Arrays.sort(words);
        return words;
    }
}
