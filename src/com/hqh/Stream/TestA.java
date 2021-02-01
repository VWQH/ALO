package com.hqh.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestA {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,3,4,5,2);
        Set<Integer> set = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(set);
        Set<Integer> seta = numbers.stream().filter(x -> x%2==0).collect(Collectors.toSet());
        System.out.println(seta);

        List<Integer> list = numbers.stream().map(x -> x * x)
                .filter(x -> x%2==0)
                .collect(Collectors.toList());
        System.out.println(list);

        Stream<String> s = Stream.of("Gee", "Kee", "Geekee");
        Set<String> mySet = s.collect(Collectors.toSet());
        mySet.forEach(System.out::println);

        List<String> listA = new ArrayList<>();
        listA.add("One");
        listA.add("Two");
        listA.add("Three");
        listA.add("Four");
        listA.add("5");

        Stream<String> stream = listA.stream();        //toUpperCase()
        List<String> filt = listA.stream().filter(x -> x.startsWith("T")).collect(Collectors.toList());
        filt.forEach(System.out::println);

        long countNum = listA.stream().filter(x -> x.startsWith("T")).count();
        System.out.println(countNum);





    }
}
