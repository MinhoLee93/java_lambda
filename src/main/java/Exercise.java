import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Exercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // lambda
        printConditionally(people, (p) -> true, System.out::println);
    }

    private static void printConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> action) {
        for (Person p : people) {
            if (condition.test(p)) {
                action.accept(p);
            }
        }
    }
}
