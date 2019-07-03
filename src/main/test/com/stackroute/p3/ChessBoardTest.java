package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    ChessBoard ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new ChessBoard();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void chess8x8()
    {

        ob.matrixInitialise(8);
        String result=ob.setChess();
        assertEquals("BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n",result);
    }
    @Test
    public void chess2x2()
    {

        ob.matrixInitialise(2);
        String result=ob.setChess();
        assertEquals("BB WW \n" +
                "BB WW \n",result);
    }
    @Test
    public void chess4x4()
    {

        ob.matrixInitialise(4);
        String result=ob.setChess();
        assertEquals("BB WW BB WW \n" +
                "BB WW BB WW \n" +
                "BB WW BB WW \n" +
                "BB WW BB WW \n",result);
    }
}

