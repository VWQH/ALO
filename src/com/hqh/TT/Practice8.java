package com.hqh.TT;

public class Practice8 {


    static int[] rotLeft(int a[], int d){
        int n = a.length;
        int[] rotArr = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + n -d) % n;
            rotArr[newIndex] = a[i];
        }
        return  rotArr;
    }



    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int d = 4;

        int[] b = rotLeft(a, d);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
