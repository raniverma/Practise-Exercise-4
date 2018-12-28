package com.stackroute.pe4;

import java.util.Arrays;

public class TextParagraph {
    /*method to sort the words of a string input*/
    public String[] sortWords(String input) {
        String[] words={};
        if(input==null)
           return words;
        words=input.trim().toLowerCase().split(" ");
        Arrays.sort(words);
        return words;
    }
}
