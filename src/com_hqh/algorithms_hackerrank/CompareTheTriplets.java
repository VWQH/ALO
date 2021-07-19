package com_hqh.algorithms_hackerrank;

import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {


    static void compareTriplets(int[] a, int[] b){
        int alice = 0, bob = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i])
                alice++;
            if (a[i] < b[i])
                bob++;
        }
        System.out.println(alice + " " + bob);
    }

    public static void main(String[] args) {
        int[] a = {17, 28, 30};
        int[] b = {99, 16, 8};
        compareTriplets(a, b);
    }


    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
        int alice = 0, bob = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i))
                alice++;
            else if(a.get(i) < b.get(i))
                bob++;
        }
        return Arrays.asList(alice, bob);
    }



}
