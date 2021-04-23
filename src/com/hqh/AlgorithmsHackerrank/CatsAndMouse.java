package com.hqh.AlgorithmsHackerrank;

import java.util.Scanner;

public class CatsAndMouse {

    static String catAndMouse(int x, int y, int z){
        int a = Math.abs(x - z);
        int b = Math.abs(y - z);

        if(a > b)
            return "Cat B";
        else if(a < b)
            return "Cat A";
        else
            return "Mouse C";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            System.out.println(catAndMouse(x, y, z));
        }
    }
}
