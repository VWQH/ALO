package com.hqh.AlgorithmsHackerrank;

import java.util.Scanner;

public class TimeConversion {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String s = "01:40:22AM";
        String[] str = s.split(":");
        int hour = Integer.parseInt(str[0]);
        String min = str[1];
        String sec = str[2];
        String secLeft = sec.substring(0, sec.length()-2);
        String secRight = sec.substring(sec.length()-2);
        String newString = "";
        if((0 <= hour && hour < 12) && (secRight.equals("AM")))
            newString = String.format("%02d", hour) + ":" + min + ":" + secLeft;
        else if((0 <= hour && hour < 12) && (secRight.equals("PM")))
            newString = (12+hour) + ":" + min + ":" + secLeft;
        else if((hour==12) && secRight.equals("AM"))
            newString = "00" + ":" + min + ":" + sec;
        else if((hour==12) && (secRight.equalsIgnoreCase("PM")))
            newString = hour + ":" + min + ":" + sec;
        System.out.println(newString);
    }
}
