package streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author Volodymyr Portianko
 * @since 01.06.2017
 */
public class User {
    public String name;
    public int age;
    public List<Message> messages;

    public User(String name, int age, Message... messages) {
        this.name = name;
        this.age = age;
        this.messages = Arrays.asList(messages);
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", messages=" + messages +
                '}';
    }
}
