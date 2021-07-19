package com_hqh.java8;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestA {
    static class SV{
        private int In(){
            System.out.println("OK");
            return 0;
        }
    }

    public static void main(String[] args) {
        SV sv = new SV();
        Class obj = sv.getClass();

        Method[] pt = obj.getDeclaredMethods();
        for (Method m: pt) {
            System.out.println(m.getName());
            int modifier = m.getModifiers();
            System.out.println("Quyền truy cập: " + Modifier.toString(modifier));
            System.out.println("Kiểu trả về : " + m.getReturnType());
        }
    }
}
