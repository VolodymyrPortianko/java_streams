package streams.block1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Volodymyr Portianko
 * @since 30.05.2017
 */
public class Example3 {

    public static void main(String[] args) {
        Stream newStream = Stream.of("one", "two", "three");

        String[] array = new String[]{"one", "two", "three"};
        Arrays.stream(array);


        IntStream.range(0, 5)
                .forEach(System.out::println);


        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);


    }
}
