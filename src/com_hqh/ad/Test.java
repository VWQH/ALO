package com_hqh.ad;


public class Test {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(count + " ");
                count += 1;
            }
            System.out.println();
        }
    }
}
