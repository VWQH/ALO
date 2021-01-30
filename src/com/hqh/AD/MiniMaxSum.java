package com.hqh.AD;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        /*int[] a = {2,3,2,7,7};
        int n = 5;
        int max = a[0], count = 0, tmp = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] > max){
                max = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(a[i] == max)
                count++;
        }
        System.out.println(count);*/
        /*int n = scanner.nextInt();
        int max = 1, count = 0;
        for (int i = 0; i < n; i++) {
            int in = scanner.nextInt();
            if (in > max){
                max = in;
                count = 1;
            }else if(in == max)
                count++;
        }
        System.out.println(count);*/

        /*String s = "07:01:00PM";
        String[] str = s.split(":");
        int hour = Integer.parseInt(str[0]);
        String min = str[1];
        String secPeriod = str[2];
        String sec = str[2].substring(0, secPeriod.length()-2);
        String period = str[2].substring(secPeriod.length()-2, secPeriod.length());
        String newString = "";
        if((0<=hour && hour < 12) && (period.equalsIgnoreCase("AM"))){
            newString = String.format("%02d", hour) + ":" + min + ":" + sec;
        }else if((0<=hour && hour < 12) && (period.equalsIgnoreCase("PM"))){
            newString = (12 + hour) + ":" + min + ":" + sec;
        }else if((hour==12) && (period.equalsIgnoreCase("AM"))){
            newString = "00" + ":" + min + ":" + sec;
        }else if((hour==12) && (period.equalsIgnoreCase("PM"))){
            newString = hour + ":" + min + ":" + sec;
        }
        System.out.println(newString);*/

        /*Scanner in = new Scanner(System.in);
        int t= 1;
        for(int i=0;i<t;i++){
            int a = 0;
            int b = 2;
            int n = 10;
            for(int j=0; j<n; j++){
                a += b;
                if(j>0)
                    System.out.print(" ");

                System.out.print(a);
                b = b *2;
            }
            System.out.println("");
        }*/

        /*Scanner sc = new Scanner(System.in);
        int t= 1;

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)System.out.println("* byte");
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }*/

        Scanner sc = new Scanner(System.in);
        int line = 1;
        while(sc.hasNext()){ // ngắt dòng.
            System.out.print(line + " " + sc.nextLine());
            line++;
        }
    }
}
