package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurencesTest {
    MultipleOccurences obj;
    @Before
    public void setUp() throws Exception {
        obj=new MultipleOccurences();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void multipleOccurrenceCorrect(){
        String sentence="She sells seashells by the seashore";
        assertEquals("4-6-10-12-27-29-",obj.findMultipleOccurrence(sentence));
    }

    @Test
    public void multipleOccurrenceInCorrect(){
        String sentence="She seashells by the seashore";
        assertEquals("4-6-21-23-",obj.findMultipleOccurrence(sentence));
    }

    @Test
    public void multipleOccurrenceNull(){
        String sentence=null;
        assertNull(obj.findMultipleOccurrence(sentence));
    }

    @Test
    public void multipleOccurrenceNotFound(){
          String sentence="he";
          assertEquals("-1",obj.findMultipleOccurrence(sentence));
    }

}