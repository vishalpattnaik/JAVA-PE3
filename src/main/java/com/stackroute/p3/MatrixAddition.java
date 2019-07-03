/*program to compute the addition of two matrix, Read the number of rows and columns
as input, also the values of each matrix*/

package com.stackroute.p3;

public class MatrixAddition {

    public int[][] matrixAddition(int row, int colum, int[][]firstMatrix, int[][] secondMatrix) {

        int sum[][] = new int[row][colum];      //intialise sum matrix
        for(int i=0; i<row; i++) {
            for(int j=0; j<colum; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];     //calculate sum of the matrices
            }
        }

        return sum;
    }


}
