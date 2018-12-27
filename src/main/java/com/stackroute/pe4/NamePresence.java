package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NamePresence {
    public boolean isPresent(String input,String str){
        String regex="Harry";
        Pattern pattern=Pattern.compile(regex);
        Matcher match=pattern.matcher(input);
        if(match.find())
          return true;
        else
            return false;
    }
}
