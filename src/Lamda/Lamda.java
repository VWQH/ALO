package Lamda;

import java.util.Arrays;
import java.util.List;

public class Lamda {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("dd", "df", "cr");
        list
                .stream()
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("***");
        list
                .stream()
                .filter(s -> s.startsWith("d"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
