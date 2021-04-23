package com.hqh.TT;

import java.util.Arrays;

public class Practice14 {

    /*
    *
    *   { 1,  2,  3,  4  },       {13, 9,  5, 1}
        { 5,  6,  7,  8  },       {14, 10, 6, 2}
        { 9,  10, 11, 12 },  ->   {15, 11, 7, 3}
        { 13, 14, 15, 16 }        {16, 12, 8, 4}
    *
    *
    * */

    static void rotate(int a[][]){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // swap column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][n-j-1];
                a[i][n-j-1] = temp;
            }
        }

        /*
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < n; j++) {
                int temp = a[j][i];
                a[j][i] = a[j][n-1-i];
                a[j][n-1-i] = temp;

            }
        }
        */
    }



    public static void main(String[] args) {
        int a[][] = {
                { 1,  2,  3,  4  },
                { 5,  6,  7,  8  },
                { 9,  10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        rotate(a);
        for (var r: a) {
            System.out.println(Arrays.toString(r));
        }
    }
}
