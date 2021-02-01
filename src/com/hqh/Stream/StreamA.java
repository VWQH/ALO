package com.hqh.Stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StreamA {
    public static void main(String[] args) {
        int[] numbers = {4, 1, 13, 90, 16, 2, 0};
        //int min = IntStream.of(numbers).min().getAsInt(); // min, max, averrage, count, sum
        //int m = IntStream.of(numbers).max().getAsInt();


        IntSummaryStatistics statistics = IntStream.of(numbers).summaryStatistics();
        statistics.getMin();
        statistics.getMax();
        statistics.getSum();
        System.out.println(statistics.toString());
    }
}
