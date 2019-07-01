package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class CalculateDateTest {

    CalculateDate ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new CalculateDate();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void getRequiredDateReturnMessage() {

        Calendar c = Calendar.getInstance();
        String res = ob.calculateDate(c);
        assertEquals("First Date of Week: Mon 01/07/2019\nLast date of the week: Sun 07/07/2019", res);

    }
}