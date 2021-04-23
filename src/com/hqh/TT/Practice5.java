package com.hqh.TT;

public class Practice5 {


    /*
    * [2, 3, 5, 9] => [9, 2, 3, 5]
    * */

    static void printArray(int a[]){
        for (int x: a) {
            System.out.print(x + " ");
        }
    }

    static int[] shiftArrayRight(int a[]){
        int[] a2 = new int[a.length];
        for (int i = 0; i < a.length-1; i++) {
            a2[i+1] = a[i];
        }
        a2[0] = a[a.length-1];
        return a2;
    }


    public static void main(String[] args) {
        int a[] = {2, 3, 5, 9};
        int[] newAr = shiftArrayRight(a);
        printArray(newAr);
    }
}
