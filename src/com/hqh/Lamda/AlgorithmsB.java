package com.hqh.Lamda;

import java.util.Scanner;

public class AlgorithmsB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 4;
        for(int i=1;i<=n;i++) {
            for(int j=0;j<n-i;j++)
                System.out.print(" ");
            for(int j=0;j<i;j++)
                System.out.print("#");
            System.out.println();
        }

        System.out.println("OK");
    }
}
