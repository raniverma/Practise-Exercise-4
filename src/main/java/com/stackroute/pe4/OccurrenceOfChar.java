package com.stackroute.pe4;

public class OccurrenceOfChar {
    /*count occurrence of a character in a string*/
    public long countOccurrence(String input, final char m,int index) {
            if (index >= input.length()) {
                return 0;
            }

            int count = input.charAt(index) == m ? 1 : 0;
            return count + countOccurrence(input, m, index + 1);
    }

}
