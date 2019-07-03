/*Write a program to create a ChessBoard pattern with the help of multidimensional array, where
WWrepresents white color and BB represents Black color.*/

package com.stackroute.p3;

public class ChessBoard {
    private String[][] chess;
    private int rows,columns;

    public void matrixInitialise(int rows)          //initialise the matrix
    {
        this.rows=rows;
        this.columns=rows;
        chess=new String[rows][columns];

    }
    public String setChess()                        //set the chess board
    {    int counter=0; String chessboardresult="";
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                chess[i][j]=(counter++%2==0)?"BB":"WW";
                chessboardresult= chessboardresult.concat(chess[i][j]).concat(" ");
            }
            chessboardresult=chessboardresult.concat("\n");
        }return chessboardresult;
    }
}