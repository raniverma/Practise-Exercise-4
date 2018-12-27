package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NamePresenceTest {
    NamePresence obj;

    @Before
    public void setUp() throws Exception {
        obj=new NamePresence();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void CheckPresenceCorrect(){
        String input="This is Harry.";
        assertTrue(obj.isPresent(input,"Harry"));
    }
    @Test
    public void CheckPrasenceIncorrect(){
        String input="This is Henry.";
        assertFalse(obj.isPresent(input,"Harry"));
    }

}