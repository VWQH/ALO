package com_hqh.java8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class TestC {

     static class SV{
        public SV(){
        }
        private SV(int a, int b){
        }
    }

    public static void main(String[] args) {
        try {
            SV sv = new SV();
            Class obj = sv.getClass();
            Constructor[] ht = obj.getDeclaredConstructors();
            for (Constructor c: ht) {
                System.out.println("Constructor name: " + c.getName());
                int tc = c.getModifiers();
                String a = Modifier.toString(tc);
                System.out.println(a);
                System.out.println("Parameter: " + c.getParameterCount());
            }
        }catch (Exception e){

        }
    }
}
