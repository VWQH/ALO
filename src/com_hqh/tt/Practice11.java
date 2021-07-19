package com_hqh.tt;

public class Practice11 {

    /*
    *  8, 7, 2, 5, 3, 1 => 8 + 2 or 7 + 3
    * */

    static void findPair(int a[], int sum){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] + a[j] == sum)
                    System.out.println("Pair: " + a[i] + " " + a[j]);
            }
        }
    }



    public static void main(String[] args) {
        int a[] = {8, 7, 2, 5, 3, 1 };
        int sum = 10;
        findPair(a, sum);
    }
}
