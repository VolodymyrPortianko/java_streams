package streams.block2;

import streams.Message;
import streams.User;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

/**
 * @author Volodymyr Portianko
 * @since 01.06.2017
 */
public class Task5 {

    static User user1 = new User("Laura", 22,
            new Message("Hi", LocalDateTime.now()),
            new Message("I had been waiting for quite", LocalDateTime.now()));
    static User user2 = new User("Tom", 43,
            new Message("Continue in this manner.", LocalDateTime.now()),
            new Message("Dear children", LocalDateTime.now()),
            new Message("New Message", LocalDateTime.now()));
    static User user3 = new User("Kane", 30,
            new Message("Do not be afraid. ", LocalDateTime.now()),
            new Message("Look at me.", LocalDateTime.now()),
            new Message("Look at me now.", LocalDateTime.now()));

    public static void main(String[] args) {
        // Собрать список всех Message. Написать свой Collectors.toList()

    }
}
