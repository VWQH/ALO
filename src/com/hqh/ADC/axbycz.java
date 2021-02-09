package com.hqh.ADC;

public class axbycz {
    public static void main(String[] args) {
        String s1 = "abc", s2 = "xyz";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
            if(i < s1.length())
                sb.append(s1.charAt(i));
            if(i < s2.length())
                sb.append(s2.charAt(i));
        }
        System.out.println(sb);
    }
}
