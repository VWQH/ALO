package com.hqh.MAP;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExp {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(3);

        // list.forEach(s -> System.out.print(s + " "));
        System.out.println(list);

        /*
        *   list.add
        *   list.addAll
        *   list.addFirst
        *   list.addLast
        *   list.remove
        *   list.removeAll
        *   list.removeFirst
        *   list.removeLast
        *   list.clear
        *   list.removeFirstOccurrence => xóa phần tử lần đầu tiền xuất hiện ở đầu link
        *   list.removeLastOccurrence => xóa phần tử lần đầu tiền xuất hiện ở cuối link
        * */

        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(5);

        list1.addAll(list);
        System.out.println(list1);
        list1.removeFirstOccurrence(5);

        System.out.println(list1);

        // duyệt ngược
        Iterator itr = list1.descendingIterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }

    }
}
