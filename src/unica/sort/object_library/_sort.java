package unica.sort.object_library;

import java.util.*;
import java.util.stream.Collectors;

public class _sort {
    public static void main(String[] args) {

        List<Player> players = new ArrayList<>(Arrays.asList(
                new Player(1, "F", 30),
                new Player(2, "G", 10),
                new Player(3, "B", 10)
        ));

        //

//         Collections.sort(players, (p1, p2) -> p1.getAge() - p2.getAge());
//         System.out.println(players);

//        Comparator<Player> byAge = Comparator.comparing(Player::getAge);
//        Collections.sort(players, byAge);
//        players.forEach(System.out::println);

        //
//        Comparator<Player> byAge = Comparator.comparing(Player::getAge);
//        Comparator<Player> byName = Comparator.comparing(Player::getName);
//        // Collections.sort(players, byAge);
//        Collections.sort(players, byAge.thenComparing(byName));
//        players.forEach(System.out::println);


        //
        players =  players.stream()
                .sorted(Comparator.comparing(Player::getAge)
                .thenComparing(Comparator.comparing(Player::getName)))
                .collect(Collectors.toList());
        players.forEach(System.out::println);

    }
}
