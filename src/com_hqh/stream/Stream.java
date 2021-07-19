package com_hqh.stream;

import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
        IntStream.range(1, 4).forEach(System.out::println);
        IntStream.of(1, 2, 3, 4).forEach(System.out::println);
    }
}
