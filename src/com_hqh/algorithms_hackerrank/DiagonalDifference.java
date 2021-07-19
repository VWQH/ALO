package com_hqh.algorithms_hackerrank;

public class DiagonalDifference {

    static int print(int a[][]){
        int left = 0, right = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            left += a[i][i];
            right += a[i][n-1-i];
        }

        return Math.abs(left - right);
    }

    public static void main(String[] args) {
        int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}
        };

        System.out.println(print(a));
    }
}
