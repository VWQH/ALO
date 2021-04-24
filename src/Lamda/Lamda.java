package Lamda;

import java.util.Arrays;
import java.util.List;

public class Lamda {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("ad", "df", "cr");
        list
                .stream()
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
