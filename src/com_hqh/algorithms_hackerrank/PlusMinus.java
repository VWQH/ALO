package com_hqh.algorithms_hackerrank;

public class PlusMinus {

    static void plusMinus(double[] a, double n){
        double s1 = 0, s2 = 0, s3 = 0;
        for (int i = 0; i <n; i++) {
            if(a[i] > 0)
                s1++;
            else if(a[i] < 0)
                s2++;
            else
                s3++;
        }
        System.out.println(s1/n + "\n" + s2/n + "\n" + s3/n);
    }

    public static void main(String[] args) {
        double a[] = {1, 2, 3, -1, -2, -3, 0, 0}, n = a.length;
        plusMinus(a, n);
    }
}
