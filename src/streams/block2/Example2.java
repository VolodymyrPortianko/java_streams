package streams.block2;

import streams.User;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;

/**
 * @author Volodymyr Portianko
 * @since 01.06.2017
 */
public class Example2 {

    public static void main(String[] args) {
        List<User> users =
                Arrays.asList(
                        new User("Max", 18),
                        new User("Peter", 23),
                        new User("Pamela", 23),
                        new User("David", 12));

//        List<User> filtered =
//                users
//                        .stream()
//                        .filter(p -> p.name.startsWith("P"))
//                        .collect(Collectors.toList());
//        System.out.println(filtered);

//        Map<Integer, List<User>> byAge = users.stream()
//                .collect(Collectors.groupingBy(user -> user.age));
//        byAge.forEach((age, u) -> System.out.format("age %s: %s\n", age, u));

//        String message = users.stream()
//                .filter(user -> user.age >= 18)
//                .map(user -> user.name)
//                .collect(Collectors.joining(", ", "Пользователи: "," являются совершеннолетними."));
//        System.out.println(message);


//        Collector<User, StringJoiner, String> personNameCollector = Collector.of(
//                () -> new StringJoiner(" | "),  // supplier
//                (j, u) -> j.add(u.name.toUpperCase()),   // accumulator
//                (j1, j2) -> j1.merge(j2),                // combiner
//                j -> j.toString()                        // finisher
//        );
//        String names = users
//                .stream()
//                .collect(personNameCollector);
//
//        System.out.println(names);

    }
}
