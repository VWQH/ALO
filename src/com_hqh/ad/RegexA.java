package com_hqh.ad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexA {
    public static void main(String[] args) {
        String regex = "[a-z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("qwe");
        boolean match = matcher.matches();
        System.out.println(match);
    }
}
