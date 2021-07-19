package com_hqh.lamda;


public class Main {




    public static void main(String[] args) {
        /*List<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);

        //num.forEach((p) -> System.out.println(p));
        Consumer<Integer> con = (n) -> {
            System.out.println(n);
        };
        num.forEach(con)*/;

        String s = "GeeksforGeeks";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.substring(3));
        System.out.println(s.substring(2,5));
        String s1 = "Quang", s2 = "Huy";
        System.out.println(s1.concat(s2));
        String s3 = "learn share";
        System.out.println(s3.indexOf("share"));
        System.out.println(s3.indexOf('s', 3));
    }
}
