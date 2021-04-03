package com.hqh.TT;

import java.util.Arrays;

public class Practice2 {

    //  ((a[i] & 1) != 0)

    static void twoWaySort(int a[], int n){
        for (int i = 0; i < n; i++)
            if(a[i] % 2 == 1)
                a[i] *= -1;

        Arrays.sort(a);

        for (int i = 0; i < n; i++)
            if(a[i] < 0)
                a[i] *= -1;
    }

    static void twoWaySort1(int a[], int n){

    }


    public static void main(String[] args) {
        int a[] = { 1, 3, 2, 7, 5, 4 };



        // twoWaySort(a, a.length);
        // System.out.println(Arrays.toString(a));

    }
}
