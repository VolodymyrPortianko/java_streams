package streams.block1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Volodymyr Portianko
 * @since 31.05.2017
 */
public class Task3 {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Bob", 25, true));
        users.add(new User("Tatiana", 18, false));
        users.add(new User("Sergey", 34, true));
        users.add(new User("Alex", 54, true));
        users.add(new User("Marina", 65, false));


        // Вывести средний возраст пользователей из списка




        // Вывести мужчин в порядке увеличения возраста.

    }
}

class User {
    String name;
    int age;
    boolean isMan;

    public User(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }
}
