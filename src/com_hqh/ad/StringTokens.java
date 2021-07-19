package com_hqh.ad;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*String s = "He is a very very good boy, isn't he?".trim();
        String[] token = s.split("[^a-zA-Z]+");
        if(s.length() == 0)
            System.out.println(0);
        else
            System.out.println(token.length);

        for (String sh: token) {
            System.out.println(sh);
        }*/

        int testCases = Integer.parseInt(scanner.nextLine());
        while(testCases>0){
            String pattern = scanner.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(Exception e){
                System.out.println(e);
                System.out.println("Invalid");
            }
            testCases--;
        }

    }
}
