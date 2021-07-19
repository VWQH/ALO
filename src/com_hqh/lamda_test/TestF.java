package com_hqh.lamda_test;

public class TestF {

    @FunctionalInterface
    interface Sayalbe{
        void say();
    }

    public static void saySomething(){
        System.out.println("H");
    }

    public static void main(String[] args) {
        Sayalbe s = TestF::saySomething;
        s.say();

    }
}
