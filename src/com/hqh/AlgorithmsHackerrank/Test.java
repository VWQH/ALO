package com.hqh.AlgorithmsHackerrank;

public class Test {

    /*
    *   min row
    *   max col
    * */

    static void saddlePoint(int[][] a){
        for (int i = 0; i < a.length; i++) {
            int rowMin = 0, rowMax = 0;
            rowMin = a[i][0];
            int colIndex = 0;
            for (int j = 0; j < a.length; j++) {
                if(a[i][j] < rowMin){
                    rowMin = a[i][j];
                    colIndex = j;
                }
            }

            rowMax = a[0][colIndex];
            for (int j = 0; j < a.length; j++) {
                if (a[j][colIndex] > rowMax){
                    rowMax = a[j][colIndex];
                }
            }
            if(rowMin == rowMax){
                System.out.println(rowMin);
            }
        }
    }



    static void print(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /*int a[][] = {
                {9, 1, 2},
                {8, 5, 7},
                {3, 4 ,6}
        };*/

        int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8 ,9}
        };
        print(a);
        saddlePoint(a);

    }
}
