package com.hqh.TT;

import java.util.Arrays;

public class Practice13 {

    /*
    *  { 6, 0, 8, 2, 3, 0, 4, 0, 1 } -> [6, 8, 2, 3, 4, 1, 0, 0, 0]
    * */

    static void printReoder(int a[]){
        int k = 0;
        for (int i : a) {
            if(i != 0)
                a[k++] = i;
        }

        for (int i = k; i < a.length; i++) {
            a[i] = 0;
        }
    }

    static void swap_QuickSort(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void printReoderA(int a[]){
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != 0){
                swap_QuickSort(a, i, j);
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
        // printReoder(a);
        // System.out.println(Arrays.toString(a));
        printReoderA(a);
        System.out.println(Arrays.toString(a));
    }
}
