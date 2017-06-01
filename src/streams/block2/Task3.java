package streams.block2;

import streams.Message;
import streams.User;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Volodymyr Portianko
 * @since 01.06.2017
 */
public class Task3 {

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
        // Создать Map<String, List<String>>. (Имя, Список сообщений) Сообщения должны быть отсортированы в порядке убывания


    }
}
