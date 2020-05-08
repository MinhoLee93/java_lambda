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

        // step 1 : Sort list by last name
        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

        // step 2 : Create a method that prints all elements in the list
        printConditionally(people, (p) -> true, p-> System.out.println(p));


        // step 3 : Create a method that prints all people that have last name beginning with C
        printConditionally(people, p -> p.getLastName().startsWith("C"), (p)-> System.out.println(p));

    }

    private static void printConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> action) {
        for (Person p : people) {
            if (condition.test(p)) {
                action.accept(p);
            }
        }
    }
}
