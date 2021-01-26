package com.hqh.LamdaA;

public class LamdaExp {


    @FunctionalInterface
    interface MathOperation{
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }


    public static void main(String[] args) {
        LamdaExp d = new LamdaExp();
        MathOperation adddition = (a, b) -> a + b;
        System.out.println(" " + d.operate(10, 5, adddition));
    }
}
