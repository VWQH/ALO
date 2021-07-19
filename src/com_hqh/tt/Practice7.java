package com_hqh.tt;

public class Practice7 {


    static void printF(int arr[][], int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int sumOf(int arr[][]){
        int row = arr.length;
//      int col = arr[0].length;
        int col = arr.length;
        int max_hourglass_sum = 0;
        for (int i = 0; i < row-2; i++) {
            for (int j = 0; j < col-2; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                        arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                max_hourglass_sum = Math.max(max_hourglass_sum, sum);
            }
        }
        return max_hourglass_sum;
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        printF(arr, n);
        System.out.println("Sum: " + sumOf(arr));
    }
}
