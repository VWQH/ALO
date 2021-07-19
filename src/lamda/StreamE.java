package lamda;

import java.util.stream.Stream;

public class StreamE {
    public static void main(String[] args) {

        //
        Stream.of("d2", "a2", "b1", "b3", "c")
                .sorted((o1, o2) -> {
                    System.out.printf("sort: %s : %s\n", o1, o2);
                    return o1.compareTo(o2);
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));

        //
        System.out.println("* * * * *");

        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .sorted((o1, o2) -> {
                    System.out.printf("sort: %s : %s\n", o1, o2);
                    return o1.compareTo(o2);
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }
}
