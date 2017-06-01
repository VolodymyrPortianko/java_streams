package streams.block2;

import streams.User;

import java.util.Arrays;
import java.util.List;

/**
 * @author Volodymyr Portianko
 * @since 01.06.2017
 */
public class Example3 {

    static List<User> users =
            Arrays.asList(
                    new User("Max", 18),
                    new User("Peter", 23),
                    new User("Pamela", 23),
                    new User("David", 12));

    public static void main(String[] args) {
        users
                .stream()
                .reduce((u1, u2) -> u1.age > u2.age ? u1 : u2)
                .ifPresent(user -> System.out.println(user.name));    // Pamela

    }
}
