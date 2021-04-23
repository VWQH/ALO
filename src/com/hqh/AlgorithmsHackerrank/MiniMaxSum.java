package com.hqh.AlgorithmsHackerrank;

public class MiniMaxSum {

    static void miniMaxSum(int a[]){
        long sum = 0;
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if(a[i] < min) min = a[i];
            if(a[i] > max) max = a[i];
        }
        System.out.println((sum-max) + " " + (sum-min));
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        miniMaxSum(a);
    }
}
