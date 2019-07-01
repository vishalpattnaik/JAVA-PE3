package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new StudentMarks();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void showStudentDetails() {

        int marks[] = {86, 65, 98, 77};
        String res = ob.studentDetails(4, marks);

        assertEquals("Input is valid", res);

    }

    @Test
    public void checkValidInputThrowError() {

        int marks[] = {56, 45, 101, 61, 75, 126};
        String res = ob.studentDetails(6, marks);
        assertEquals("Please enter valid input", res);

    }

}