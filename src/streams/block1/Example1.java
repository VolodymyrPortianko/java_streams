package streams.block1;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Volodymyr Portianko
 * @since 30.05.2017
 */
public class Example1 {

    public static void main(String[] args) {
        Function<Integer, String> function = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return String.valueOf(integer);
            }
        };
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isEmpty();
            }
        };
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return ThreadLocalRandom.current().nextInt();
            }
        };
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };









        Function<Integer, String> functionLambda = integer -> String.valueOf(integer);
        Predicate<String> predicateLambda = s -> s.isEmpty();
        Supplier<Integer> supplierLambda = () -> ThreadLocalRandom.current().nextInt();
        Consumer<String> consumerLambda = s -> System.out.println(s);









        Function<Integer, String> functionMethodReference = String::valueOf;
        Predicate<String> predicateMethodReference = String::isEmpty;

        String testString = "testString";
        Predicate<String> predicateMethodReference2 = testString::contains;

        Supplier<Integer> supplierMethodReference = ThreadLocalRandom.current()::nextInt;
        Consumer<String> consumerMethodReference = System.out::println;








        Supplier<Date> constructorReference = Date::new;


    }
}
