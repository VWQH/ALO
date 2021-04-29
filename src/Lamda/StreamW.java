package Lamda;

import java.util.stream.Stream;

public class StreamW {

    public static void main(String[] args) {

//        Stream.of("d2", "a2", "b1", "b3", "c")
//                .filter(s -> {
//                    System.out.println("filter " + s);
//                    return true;
//                })
//                .forEach(s -> System.out.println("forEach: " + s));


        //

//        Stream.of("d2", "a2", "b1", "b3", "c")
//                .map(s -> {
//                    System.out.println("map: " + s);
//                    return s.toUpperCase();
//                })
//                .anyMatch(s -> {
//                    System.out.println("antMatch: " + s);
//                    return s.startsWith("A");
//                });


        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: "+ s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("A");
                })
                .forEach(s -> System.out.println("forEach: "+ s));




        System.out.println("***");
        //
        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: "+ s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: "+ s));


        System.out.println("***");
        //

    }
}
