package com.hqh.TT;

import java.util.Arrays;

public class Practice1 {

    /*
    *  {50, 1, 1, 50, 20, 50} => 50
    * */

    static int mostFrequent(int a[], int n) {
        Arrays.sort(a);
        int curr_count = 0, res = a[0];
        int max_count = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1])
                curr_count++;
            else {
                if (curr_count > max_count) {
                    max_count = curr_count;
                    res = a[i - 1];
                }
                curr_count = 0;
            }
        }
        if (curr_count > max_count) {
            res = a[n - 1];
            System.out.println(curr_count);
        }
        return res;

    }

    public static void main(String[] args) {
        int a[] = {50, 1, 1, 50, 20, 50};
        int n = a.length;
        System.out.println(mostFrequent(a, n));
    }
}
