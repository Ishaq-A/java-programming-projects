import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter count:");
        int count = scanner.nextInt(); // Retrieving number of elements.
        scanner.nextLine(); // Handles enter key press.

        int[] returnedArray = readIntegers(count); // Assigning return value (the array) to a new local variable.

        int returnedMin = findMin(returnedArray); // Passing returned array as argument for findMin method.

        System.out.println("min = " + returnedMin);
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count]; // Array created to store user input.
        // For-loop to read he numbers.
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt(); // Reads the next integer.
            scanner.nextLine(); // Handles enter key press.
            array[i] = number; // array equal to values entered in console.
        }
        return array; // Returns the entire array.
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i]; // Get element from index i.

            if (value < min) {
                min = value; //If value is less than min, it gets assigned to the variable.
            }
        }

        return min;
    }
}
