package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    RemoveVowels ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new RemoveVowels();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void removeVowelsReturnStringArray() {

        String[] input = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};
        String res = ob.removeVowels(input);
        assertEquals("Ind Untd Stts Grmny Egypt czchslvk", res);

    }

}