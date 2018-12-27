package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurenceOfCharTest {
    OccurenceOfChar obj;

    @Before
    public void setUp() throws Exception {
        obj=new OccurenceOfChar();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void checkNumOfCharTest(){
        String input="rammmmmmmmmm";
        assertEquals(10,obj.countOccurence(input,'m'));
    }
    @Test
    public void checkNumOfCharSuccessTest(){
        String input="raniiiiiiii";
        assertEquals(8,obj.countOccurence(input,'i'));
    }
    @Test
    public void checkNumOfCharWithSpecialCharInputTest(){
        String input="ra@@@@@@";
        assertEquals(1,obj.countOccurence(input,'r'));
    }
    @Test
    public void checkNumOfCharWithSpecialCharInStartOfInputTest(){
        String input="@@.rammmmmmmmmm";
        assertEquals(1,obj.countOccurence(input,'a'));
    }
}