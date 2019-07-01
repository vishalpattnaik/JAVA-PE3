package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {

    ConsecutiveNumbers ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new ConsecutiveNumbers();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void checkNonConsecutiveNumbersReturnMessage() {

        String res = ob.checkConsecutiveNumbers("98,96,95,94,93");
        assertEquals("98,96,95,94,93 are non consecutive numbers", res);

    }

    @Test
    public void checkConsecutiveNumbersReturnMessage() {

        String res = ob.checkConsecutiveNumbers("54,53,52,51,50,49,48");
        assertEquals("54,53,52,51,50,49,48 are consecutive numbers", res);

    }


}