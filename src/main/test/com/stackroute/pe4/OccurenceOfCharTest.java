package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurenceOfCharTest {
    OccurrenceOfChar obj;

    @Before
    public void setUp() throws Exception {
        obj=new OccurrenceOfChar();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void checkNumOfCharTest(){
        String input="rammmmmmmmmm";
        assertEquals(10,obj.countOccurrence(input,'m',0));
    }
    @Test
    public void checkNumOfCharSuccessTest(){
        String input="raniiiiiiii";
        assertEquals(8,obj.countOccurrence(input,'i',0));
    }
    @Test
    public void checkNumOfCharWithSpecialCharInputTest(){
        String input="ra@@@@@@";
        assertEquals(1,obj.countOccurrence(input,'r',0));
    }
    @Test
    public void checkNumOfCharWithSpecialCharInStartOfInputTest(){
        String input="@@.rammmmmmmmmm";
        assertEquals(1,obj.countOccurrence(input,'a',0));
    }
}