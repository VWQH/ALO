package com_hqh.algorithms_hackerrank;


import java.util.Arrays;

public class MarkAndToys {

    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
            if (sum <= k)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = {1, 12, 5, 111, 200, 1000, 10};
        int n = 50;
        System.out.println(maximumToys(a, n));
    }
}
