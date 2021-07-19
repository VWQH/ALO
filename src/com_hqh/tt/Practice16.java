package com_hqh.tt;

public class Practice16 {

    /*
    *
    *   s1 = abc, s2 = xyz  -> axbycz
    *
    * */

    static String merge(String s1, String s2){
        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
            if(i < s1.length())
                rs.append(s1.charAt(i));
            if(i < s2.length())
                rs.append(s2.charAt(i));
        }
        return rs.toString();
    }

    public static void main(String[] args) {
        String s1 = "abc", s2 = "xyz";
        System.out.println(merge(s1, s2));
    }
}
