package com_hqh.tt;

public class Practice10 {


    static void maxRow(int a[][], int n){
        int max = 0;
        int [] result = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i][j] > max){
                    max = a[i][j];
                }
            }
            result[i] = max;
            max = 0;
        }
        print(result);
    }

    static void print(int[] result){
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {1, 4, 9},
                {76, 34, 21}
        };
        int n = a.length;
        maxRow(a, n);
    }
}
