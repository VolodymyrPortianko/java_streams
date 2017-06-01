package streams.block2;

import streams.Message;
import streams.User;

import java.time.LocalDateTime;
import java.util.stream.Stream;

/**
 * @author Volodymyr Portianko
 * @since 01.06.2017
 */
public class Example1 {

    static User user1 = new User("Laura", 22,
            new Message("Hi", LocalDateTime.now()),
            new Message("I had been waiting for quite", LocalDateTime.now()));
    static User user2 = new User("Tom", 43,
            new Message("Continue in this manner.", LocalDateTime.now()),
            new Message("Dear children", LocalDateTime.now()));
    static User user3 = new User("Kane", 30,
            new Message("Do not be afraid. ", LocalDateTime.now()),
            new Message("Look at me.", LocalDateTime.now()));

    public static void main(String[] args) {

        Stream.of(user1, user2, user3)
                .flatMap(user -> user.messages.stream())
                .map(message -> message.datetime + ": " + message.text)
                .forEach(System.out::println);











//        Stream.of(user1, user2, user3)
//                .flatMap(user -> user.messages.stream()
//                        .map(message -> user.name + ": " + message.text))
//                .forEach(System.out::println);
    }
}
