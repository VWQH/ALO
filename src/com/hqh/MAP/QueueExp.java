package com.hqh.MAP;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExp {
    public static void main(String[] args) {

        /*
        *
        * */

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(4);

        System.out.println(queue.element());
    }
}
