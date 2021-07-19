package com_hqh.tt;

public class Practice6 {

    /*
    *  [1, 2, 5, 4] => 4, 5, 2, 1
    * */

    static  void swapIn(int a[]){
        int l = 0, r = a.length-1;
        while (l<r){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }

    static int[] reverseArray(int[] a){
        swapIn(a);
        return a;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = reverseArray(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
