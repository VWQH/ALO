package com.hqh.Lamda;

import java.util.Scanner;

public class Algorithms {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*int n = 3;
        int a[][] = {
                {11,2,4},
                {4,5,6},
                {10,8,-12}
        };*/

        /*int n = s.nextInt();
        int a[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for (int j = 0; j < n ; j++) {
                a[i][j] = s.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for (int j = 0; j < n ; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int sumx = 0, sumy = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j)
                    sumx += a[i][j];
                if(i+j == n-1)
                    sumy += a[i][j];
            }
        }
        int q = Math.abs(sumx - sumy);
        System.out.print(q);*/

        /*double arr[] = {-4, 3, -9, 0, 4, 1}, n = 6;
        int  s1 = 0, s2 = 0, s3 = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0)
                s1++;
            else if(arr[i] < 0)
                s2++;
            else s3++;
        }
        System.out.println( s1/n + " " + s2/n + " " + s3/n);*/

        /*
        int n = 4;
        s.close();
        for(int i=1; i<=n; i++){
            for (int j = n; j > i  ; j--) {
                System.out.print("   ");
            }
            for (int k = 0; k < i ; k++) {
                System.out.print(" # ");
            }
            System.out.println();
        }
        */

    }
}
