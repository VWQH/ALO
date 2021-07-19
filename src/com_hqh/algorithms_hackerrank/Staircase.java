package com_hqh.algorithms_hackerrank;

public class Staircase {
    public static void main(String[] args) {
        int n = 12;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
