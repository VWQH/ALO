package com.hqh.AD;

public class Array2D {
    public static void main(String[] args) {
        
        int[][] A = {
                {11, 12, 13, 14, 15},
                {16, 17, 19, 20, 21},
                {22, 23, 24, 25, 26},
                {27, 28, 29, 30, 31}

        };
        int m = 4, n = 5;
        int i, j;
        for (int k = 0; k <= m-1; k++) {
            i = k;
            j = 0;
            while (i >= 0){
                System.out.print(A[i][j] + " ");
                i = i-1;
                j = j+1;
            }
            System.out.println("");
        }
        for (int k = 1; k <= n-1; k++) {
            i = m-1;
            j = k;
            while (j<=n-1){
                System.out.print(A[i][j] + " ");
                i = i-1;
                j = j+1;
            }
            System.out.println("");
        }
    }
}
