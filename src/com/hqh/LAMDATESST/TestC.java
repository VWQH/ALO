package com.hqh.LAMDATESST;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TestC {
    interface Addalbe{
        int add(int a, int b);
    }

    public static void main(String[] args) {
        Addalbe sum = (int a,int b) -> (a+b);
        System.out.println(sum.add(10,20));

        //
        Addalbe sum1 = (a, b) -> {
            return (a + b);
        };
        System.out.println(sum1.add(20, 40));

        //
        List<String> list = new ArrayList<String>();
        list.add("1A");
        list.add("2B");
        list.add("3C");
        list.forEach((n) -> System.out.println(n));

    }
}
