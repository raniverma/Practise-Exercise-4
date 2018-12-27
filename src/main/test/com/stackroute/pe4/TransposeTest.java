package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    Transpose obj;
    @Before
    public void setUp() throws Exception {
        obj=new Transpose();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void transposeCorrect(){
        String input="a quick brown fox jumps over the lazy dog";
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",obj.transposeString(input));
    }

    @Test
    public void transposeNull() {
        assertNull("string is null",obj.transposeString(null));
    }
}