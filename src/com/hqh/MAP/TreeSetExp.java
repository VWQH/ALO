package com.hqh.MAP;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExp {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(4);
        ts.add(2);
        System.out.println(ts);

        /*
        *
        * */

        Iterator itr = ts.descendingIterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println("\nHighest value: " + ts.pollFirst()); // highest
        System.out.println("Lowest value: " + ts.pollLast());     // lowest


        TreeSet<Integer> ts1 = new TreeSet<>();
        ts1.add(1);
        ts1.add(2);
        ts1.add(4);
        System.out.println(ts1.descendingSet()); // print ngược
        System.out.println(ts1.headSet(2, true));
    }
}
