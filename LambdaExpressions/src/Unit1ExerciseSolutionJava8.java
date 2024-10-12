import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        System.out.println("================================================================");

        performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));

        System.out.println("================================================================");

        performConditionally(people, p -> true, p -> System.out.println(p));

        System.out.println("================================================================");

        performConditionally(people, p -> p.getFirstName().startsWith("C"),p -> System.out.println(p));
    }

    public static void printAllLastC(List<Person> people) {
        for(Person p : people) {
            if(p.getLastName().startsWith("C")) {
                System.out.println(p);
            }
        }
    }

    public static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p : people) {
            if(predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}

