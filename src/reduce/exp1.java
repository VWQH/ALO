package reduce;

import java.util.Arrays;
import java.util.List;

public class exp1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 3, 5);
        int result = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(result);
        //
        int result1 = numbers
                .stream()
                .reduce(0, Integer::sum);
        System.out.println(result1);
        //

        List<Integer> ages = Arrays.asList(25, 30, 5);
        int computerAges = ages
                .parallelStream()
                .reduce(0, (a, b) -> a + b, Integer::sum);
        System.out.println(computerAges);

    }

}
