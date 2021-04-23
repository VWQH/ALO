package com.hqh.AlgorithmsHackerrank;

public class SaddlePoint {

    static void print(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void saddlePoint(int[][] a){
        for (int i = 0; i < a.length; i++) {
            int rowMin = a[i][0];
            int colIndex = 0;

            boolean saddlePoint = true;
            for (int j = 1; j < a.length; j++) {
                if(a[i][j] < rowMin){
                    rowMin = a[i][j];
                    colIndex = j;
                }
            }

            for (int j = 0; j < a.length; j++) {
                if(a[j][colIndex] > rowMin){
                    saddlePoint = false;
                    break;
                }
            }
            if(saddlePoint)
            {
                System.out.println("Saddle Point is : "+rowMin);
            }
        }
    }


    public static void main(String[] args) {
        int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = a.length;

        print(a);

        saddlePoint(a);
    }
}
