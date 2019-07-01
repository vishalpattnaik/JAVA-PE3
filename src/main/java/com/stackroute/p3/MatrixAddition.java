package com.stackroute.p3;

public class MatrixAddition {

   /* public static void main(String args[]) {

        int input1[][] = {{1,2}, {3,4}, {5,6}};
        int input2[][] = {{9,8}, {7,6}, {5,4}};

        matrixAddition(3, 2, input1, input2);

    } */

    public int[][] matrixAddition(int row, int colum, int[][]firstMatrix, int[][] secondMatrix) {

        int sum[][] = new int[row][colum];
        for(int i=0; i<row; i++) {
            for(int j=0; j<colum; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

      /*  for(int i=0; i<row; i++) {
            for(int j=0; j<colum; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        } */

        return sum;
    }


}
