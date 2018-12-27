package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceCharTest {
    ReplaceChar obj;

    @Before
    public void setUp() throws Exception {
        obj=new ReplaceChar();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void CorrectReplacementTest(){
        String input="daily dry";
        assertEquals("faily fry",obj.replaceDWithF(input));
    }
    @Test
    public void InCorrectReplacementTest(){
        String input="radddvcvcgd";
        assertEquals("rafffvcvcgf",obj.replaceDWithF(input));
    }
    @Test
    public void withSpecialCharInputStringTest(){
        String input="radddd@@@";
        assertEquals("raffff@@@",obj.replaceDWithF(input));
    }
    @Test
    public void withSpecialCharInStartInputStringTest(){
        String input="@@@radd";
        assertEquals("@@@raff",obj.replaceDWithF(input));
    }


}
