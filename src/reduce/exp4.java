package reduce;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exp4 {


    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ar", "qw", "er");
        strings
                .forEach(System.out::println);
        //
        String result = strings
                .stream()
                .reduce("typ", String::concat);
        System.out.println(result);

        //
        List<Integer> list = Arrays.asList(9, 9, 9, 9, 1, 2, 2, 1, 4, 5, 6, 6);
        Integer max = list
                .stream()
                .max(Integer::compare).get();
        Integer min = list
                .stream()
                .min(Integer::compare).get();
        System.out.println(max + " " + min);
        //

        // bỏ lặp
        list
                .stream()
                .distinct()
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        //
        list
                .stream()
                .distinct()
                .map(i -> i*i)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();



        //
        list
                .stream()
                .sorted()
                .forEach(s -> System.out.print(s + " "));
        System.out.println();




        //
        List<Integer> list1 = Arrays.asList(1, 2, 2, 1, 4, 7);
        list1
                .stream()
                .skip(3)
                .limit(3)
                .forEach(i -> System.out.print(i + " "));
        System.out.println();


        //


        List<String> strings1 = Arrays.asList("Q", "W", "E", "R");
        String s1 = strings1
                .stream()
                .reduce("I'm ", String::concat);
        System.out.println(s1);



        String s2 = strings1
                .parallelStream()
                .reduce("\nI'm ", String::concat);
        System.out.println(s2);

    }
}
