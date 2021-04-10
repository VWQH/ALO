package com.hqh.TT;

public class Practice4 {

    /*
      { 5, 7, 3, 4 },           3, 4, 5, 7
      { 9, 5, 8, 2 },           9, 8, 5, 2
      { 6, 3, 8, 1 },   =>      1, 3, 6, 8
      { 5, 8, 9, 3 }            9, 8, 5, 3

    * */

    static int N = 4;

    static void funSum(int a[][]){
        for (int i = 0; i < N; i++) {
            if(i % 2 == 0){
                for (int j = 0; j < N; j++) {
                    for (int k = j+1; k < N; k++) {
                        if(a[i][j] > a[i][k]){
                            int temp = a[i][j];
                            a[i][j] = a[i][k];
                            a[i][k] = temp;
                        }
                    }
                }
            }
            else {
                for (int j = 0; j < N; j++) {
                    for (int k = j+1; k < N; k++) {
                        if(a[i][j] < a[i][k]){
                            int temp = a[i][j];
                            a[i][j] = a[i][k];
                            a[i][k] = temp;
                        }
                    }
                }
            }
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        int a[][] = {
                    { 5, 7, 3, 4 },
                    { 9, 5, 8, 2 },
                    { 6, 3, 8, 1 },
                    { 5, 8, 9, 3 }
                    };

        funSum(a);
    }

}
