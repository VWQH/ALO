package com.hqh.AlgorithmsHackerrank;

public class BirthdayCakeCandles {

    static void birthdayCakeCandles(int a[]){
        int max = 1, count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
                count++;
            }else if(a[i] == max)
                count++;
        }
        System.out.println(max + " " + count);
    }

    public static void main(String[] args) {
        int a[] = {82, 49, 82, 82, 41, 82, 15, 63, 38, 25}, n = a.length;
        birthdayCakeCandles(a);
    }
}
