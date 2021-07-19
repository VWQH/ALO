package lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LamdaQ {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 10, 5);
        Collections.sort(list, (o1, o2) -> {
            return o1.compareTo(o2);
        });
        list.forEach(System.out::println);
        // list.forEach(i -> System.out.println(i));
    }
}
