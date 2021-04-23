package com.hqh.TT;

import java.util.Arrays;

public class Practice12 {

    /*
    * 0, 0, 1, 0, 1 => 0, 0, 0, 1, 1
    * */

    static void printSort(int a[]){
        int count_zero = 0;
        for (int value: a) {
            if(value == 0)
                count_zero++;
        }
        int k = 0;
        while (count_zero-- != 0)
            a[k++] = 0;

        while (k < a.length)
            a[k++] = 1;
    }

    public static void main(String[] args) {
        int[] a = {0, 0, 1, 0, 1, 1, 0, 1, 0, 0};
        printSort(a);
        System.out.println(Arrays.toString(a));
    }
}
