package streams.block1;

import java.util.Arrays;
import java.util.List;

/**
 * @author Volodymyr Portianko
 * @since 30.05.2017
 */
public class Example2 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");

        strings
                .stream()
                .filter(s -> s.endsWith("e"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
