package com_hqh.tt;

import java.util.Arrays;
import java.util.Collections;

public class Practice3 {

    /*
    *  {1, 2, 3, 4, 5, 6} => {1, 2, 3, 6, 5, 4}
    *   nửa đầu tăng, nửa sau giảm
    * */

    static void printOder(int a[], int n){
        Arrays.sort(a);
        for (int i = 0; i < n/2; i++) {
            System.out.print(a[i] + " ");
        }
        for (int j = n-1; j >= n/2 ; j--) {
            System.out.print(a[j] + " ");
        }
    }

    static void mySort(Integer b[]){
        int n = b.length;
        Arrays.sort(b, 0, n/2);
        Arrays.sort(b, n/2, n, Collections.reverseOrder());
    }

    // use function


    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int n = a.length;
        Integer b[] = { 5, 4, 6, 2, 1, 3, 8, 9, 7 };
        //printOder(a, n);
        mySort(b);
        System.out.println(Arrays.toString(b));
    }
}
