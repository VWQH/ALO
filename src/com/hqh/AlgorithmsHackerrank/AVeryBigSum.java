package com.hqh.AlgorithmsHackerrank;

import java.util.Scanner;

public class AVeryBigSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        long sum = 0L;
        for (int i = 0; i < num; i++) {
            sum += sc.nextLong();
        }
        sc.close();
        System.out.println(sum);
    }
}
