package com_hqh.map;


import java.util.*;

public class ArrayListExp {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("K");
        list.add("C");

        // list.forEach((n) -> System.out.println(n));

        // trả về phần tử.
        System.out.println(list.get(1));
        list.set(0, "Dates");

        Collections.sort(list);

        Iterator itr = list.iterator();

        while (itr.hasNext()){
            String s = (String) itr.next();
            System.out.print(s + " ");
        }

        //
        System.out.println();

        ListIterator<String> listIt = list.listIterator(list.size());
        while (listIt.hasPrevious()){
            String str = listIt.previous();
            System.out.println(str);
        }

        //
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("1");

        list1.addAll(list);
        System.out.println(list1);

        // list1.remove(0);
        // list1.removeAll(list);
        // list.clear();
        // list.isEmpty()
        list1.removeIf(s -> s.contains("C"));
        System.out.println(list1);
    }
}
