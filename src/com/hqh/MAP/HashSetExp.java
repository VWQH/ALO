package com.hqh.MAP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExp {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(3);

        System.out.println(set);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);

        HashSet<Integer> set1 = new HashSet(arr);
        set1.add(20);
        System.out.println(set1);

        //
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.addAll(set);
        lhs.add(3);
        System.out.println(lhs);
    }
}
