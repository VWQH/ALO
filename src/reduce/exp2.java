package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class exp2 {
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("a", "b", "c", "d");

        String result = letters
                .stream()
                .reduce("", ((partialString, element) -> partialString + element));
        System.out.println(result);

        String result1 = letters
                .stream()
                .reduce("", String::concat);
        System.out.println(result1);

        String result2 = letters
                .stream()
                .reduce("", (partialString, element) -> partialString.toUpperCase() + element.toUpperCase());
        System.out.println(result2);


    }
}
