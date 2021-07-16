package reduce.user;

import java.util.Arrays;
import java.util.List;

public class exp3 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("james", 21),
                new User("anny", 20)
        );

        int computeAges = users
                .stream()
                .reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);
        System.out.println(computeAges);
    }
}
