package com.hqh.AlgorithmsHackerrank;

import java.util.Scanner;

public class SolveMeFirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        int sum;
        sum = (int) solveMeFirst(a, b);
        System.out.println(sum);
    }

    static Object solveMeFirst(int a, int b) {
        return a + b;
    }
}
