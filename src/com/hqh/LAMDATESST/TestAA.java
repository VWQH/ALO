package com.hqh.LAMDATESST;

import java.util.Arrays;

public class TestAA {

    /*interface inter{
        default void doA(){
            System.out.println("A");
        }
    }
    interface interA{
        default void doA(){
            System.out.println("B");
        }
    }
    static class ABC implements inter, interA{

        @Override
        public void doA() {
            inter.super.doA();
        }
    }
    public static void main(String[] args) {
        ABC a = new ABC();
        a.doA();
    }*/

    //

    /*interface IA{
        default void doSome(){
            System.out.println("A");
        }

         static boolean isValid(){
            System.out.println("B");
            return true;
        }

        void show();
    }

    public static class Car implements IA{
        @Override
        public void show() {
            doSome();
            IA.isValid();
        }
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.show();
    }*/


    /// Tham chiếu.

    /*@FunctionalInterface
    interface ExecuteFunction{
        int execute(int a, int b);
    }

    static class MathUtils{
        public static int sum(int a, int b) {
            return a + b;
        }

        public static int minus(int a, int b) {
            return a - b;
        }
    }

        public static int doAction(int a, int b, ExecuteFunction func) {
            return func.execute(a, b);
        }

        public static void main(String[] args) {
            int a = 10, b = 20;

            int sum = doAction(a, b, MathUtils::sum);
            System.out.println(sum);

            int minus = doAction(a, b, MathUtils::minus);
            System.out.println(minus);
        }*/



    /// non-static
    /*@FunctionalInterface
    interface ExecuteFunction{
        int execute(int a, int b);
    }

    static class MathUtils{
        public int sum(int a, int b) {
            return a + b;
        }

    }

    public static int doAction(int a, int b, ExecuteFunction func) {
        return func.execute(a, b);
    }

    public static void main(String[] args) {
        int a = 10, b = 20;

        MathUtils m = new MathUtils();
        int sum = doAction(a, b, m::sum);
        System.out.println(sum);;
    }*/


    /// instance method của một đối tượng tùy ý của một kiểu cụ thể
    /*public static void main(String[] args) {
        String[] stringArray = { "Java", "C++", "PHP", "C#", "Javascript" };

        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for (String str : stringArray) {
            System.out.println(str);
        }
    }*/


    ///
    @FunctionalInterface
    interface IA{
        void display(String say);
    }
    static class BA implements IA{

        public BA(String s) {
            System.out.println(s);
        }

        @Override
        public void display(String say) {
            System.out.println("A");
        }
    }

    public static void main(String[] args) {
        IA ia = BA::new;
        ia.display("OK");
    }

}
