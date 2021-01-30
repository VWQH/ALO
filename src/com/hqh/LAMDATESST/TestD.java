package com.hqh.LAMDATESST;

public class TestD {
    interface Sayable{
        String say(String mess);
    }

    public static void main(String[] args) {
        Sayable person = mess -> {
          String s1 = "AB";
          String s2 = s1 + mess;
          return s2;
        };
        System.out.println(person.say(" time C"));


        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("r1");
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("r2");
            }
        };

        Thread t2 = new Thread(r2);
        t2.start();
    }
}
