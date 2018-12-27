package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextParagraphTest {
    TextParagraph obj;
    @Before
    public void setUp() throws Exception {
        obj=new TextParagraph();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void textParagraphCorrect(){
        String input="My Name is Pratima I Like Reading Biographies";
        String sorted[]={"biographies","i","is","like","my","name","pratima","reading"};
        assertArrayEquals("Test passed",sorted,obj.sortWords(input));
    }
    @Test
    public void textParagraphInCorrect(){
        String input="My Name is Pratima";
        String sorted[]={"is","my","name","pratima"};
        assertArrayEquals("Test passed",sorted,obj.sortWords(input));
    }
    @Test
    public void textParagraphNull(){
        String input=null;
        assertEquals(0,obj.sortWords(input).length);
    }
}