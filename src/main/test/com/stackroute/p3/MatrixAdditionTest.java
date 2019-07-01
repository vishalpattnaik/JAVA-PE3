package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {

    MatrixAddition ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new MatrixAddition();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void returnAdditionOfTwoMatrices() {

        int input1[][] = {{1,2}, {3,4}, {5,6}};
        int input2[][] = {{9,8}, {7,6}, {5,4}};
        int[][] res = ob.matrixAddition(3, 2, input1, input2);
        int[][] final_res ={{10,10},{10,10},{10,10}};

        assertArrayEquals(final_res, res);

    }

}