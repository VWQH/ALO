package com_hqh.algorithms_hackerrank;

import java.util.ArrayList;
import java.util.List;

public class PickingNumbers {

    static int pickingNumbers(List<Integer> a){
        int fre[] = new int[10];
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int index = a.get(i);
            fre[index]++;
        }
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, fre[i] + fre[i+1]);
        }
        return max;
    }

    public static void main(String[] args) {
        int n = 6;
        List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(2);
            list.add(3);
            list.add(1);
            list.add(2);
        System.out.println(list);
        System.out.println(pickingNumbers(list));
    }
}
