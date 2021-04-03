package com.hqh.LAMDATESST;

public class TestB {
    interface  Say{
        public String say();
    }

    public static void main(String[] args) {
        Say s = () -> {
             return  "OK";
        };
        System.out.println(s.say());
    }
}
