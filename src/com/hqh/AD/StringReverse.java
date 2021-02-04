package com.hqh.AD;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*String A = "madam";

        int a_pointer = 0;
        int b_pointer = A.length()-1;
        while (a_pointer <= b_pointer){
            if(A.charAt(a_pointer) != A.charAt(b_pointer)){
                System.out.println("No");
                return;
            }
            a_pointer++;
            b_pointer--;
        }
        System.out.println("Yes");*/

        String a = "hel";
        int[] char_fre = new int[26];
        int a_lenght = a.length();
        for (int i = 0; i < a_lenght; i++) {
            char current = a.charAt(i);
            int index = current - 'a';
            char_fre[index]++;
        }

    }
}
