import java.util.Arrays;
import java.util.List;

public class Unit1Exercise {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Step 1: Sort the list by last name
        // Step 2: Create a method that prints all elements in the list
        // Step 3: Create a method that prints all people that have last name beginning with 'C'

        // Have the methods accept behaviour instead of hard-coding them.
        // E.g. pass in behaviour to find if a person's last name begins with 'C'
    }
}

