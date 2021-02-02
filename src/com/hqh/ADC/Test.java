package com.hqh.ADC;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        /*System.out.println("Cod3l3arn".replace('3', 'e'));
        String s = "Codelearn";
        System.out.println(s.indexOf("learn")); // xuất hiện String trong 1 String khác
        System.out.println(s.startsWith("Code"));
        System.out.println(s.endsWith("rn"));
        String[] words = s.split("");
        for(String word:words) {
            System.out.println(word);
        }
        System.out.println(s.substring(0, 2));*/


        Scanner sc = new Scanner(System.in);
        String s1 = "Codelearn";
        String s2 = "LEARN";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        System.out.print(s1.indexOf(s2));


        String s = sc.next();
        for(char c = '0'; c <= '9'; c++){
            s = s.replace(c +"", "");
        }
        System.out.println(s);


        String s3 = "ABC123";
        int count = 0;
        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) >= 'A' && s3.charAt(i) <= 'Z') {
                count++;
            }
        }
        System.out.print(count);



        String an = "";
        for (int i = s3.length()-1 ; i >= 0; i--) {
            an += s.charAt(i);
            System.out.println(an);
        }



    }
}
