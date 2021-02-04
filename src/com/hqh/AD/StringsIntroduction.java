package com.hqh.AD;

import java.util.Scanner;

public class StringsIntroduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*String A = "hello";
        String B = "java";

        int a = A.length();
        int b = B.length();

        System.out.println(a+b);
        int rs = A.compareTo(B);
        if(rs > 0) System.out.println("Yes");
        else System.out.println("No");
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " "
                + B.substring(0,1).toUpperCase() + B.substring(1));*/


        /*String C = "welcometojava";
        int k = 3;
        String current = C.substring(0,k);
        String smallest = current;
        String largest = current;

        for (int i = 0; i <= C.length()-k; i++) {
            current = C.substring(i, k+i);
            //System.out.println(current);
            if(current.compareTo(largest) > 0){
                largest = current;
            }
            if(current.compareTo(smallest) < 0){
                smallest = current;
            }

        }
        System.out.println(largest + "\n" + smallest);*/

        /*String s1 = "Rockstar";
        System.out.println(s1.compareTo("rockstar"));*/

    }
}
