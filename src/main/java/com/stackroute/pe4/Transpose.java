package com.stackroute.pe4;

public class Transpose {
    public String transposeString(String input){
        if(input==null)
            return null;

        StringBuffer sb=new StringBuffer(input);
        String reversed=sb.reverse().toString();
        System.out.println(reversed);
        String reversedWords[]=reversed.split(" ");
        String transposedString="";
        for(int i=reversedWords.length-1;i>=0;i--){
            transposedString+=(reversedWords[i]+" ");
        }
        return transposedString.trim();
    }

}
