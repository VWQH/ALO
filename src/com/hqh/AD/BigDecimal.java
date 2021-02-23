package com.hqh.AD;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class BigDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5,6,8,9,7};
        int n = 9;
        /*String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();



        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }*/
        LK(a,n);

    }
    public static boolean SNT(int n){
        if(n<2)
            return false;
        for (int i = 2; i <= n/2; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void LK(int a[], int n){
        for (int i = 0; i < n; i++) {
            if(SNT(a[i]))
                System.out.println(a[i]);
        }
    }
}
