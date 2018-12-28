package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurences {
    /*Method for finding multiple occurences of a string in input string*/
    public String  findMultipleOccurrence(String sentence){
        if(sentence==null)
            return null;
     //   sentence="She sells seashells by the seashore";
        String regex="se";
        Pattern pattern=Pattern.compile(regex);
        Matcher match=pattern.matcher(sentence);
        String result="";
        while(match.find())
            result+=match.start()+"-"+match.end()+"-";
      //  System.out.println(result);

        if(result=="")
            return "-1";
        else
            return result;
    }
}
