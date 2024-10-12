import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in); // Open the scanner.
        System.out.println("Enter a number:"); // The code begins by printing this text.

        int sum = 0; // Initialise variable sum as an int and assign a value of zero.
        long average = 0; // Initialise variable average as a long and assign a value of zero.
        int count = 0; // Initialise a variable to keep count of the numbers as type int and set it to zero.

        while (true) { // An endless loop.

            boolean isAnInt = scanner.hasNextInt(); // Method determines whether number passed is an int.

            if (isAnInt) { // If the number is an int.
                int number = scanner.nextInt(); // Variable number is equal to the next integer inputted by the user.
                count++; // Count increases by value of 1 after each loop.
                sum += number; // Calculates the sum (same as sum = sum + number).
                average = Math.round((double) sum / count); // Calculates the average.

            } else { // Else the number inputted is not an int.
                break; // Break out of the loop.
            }

            scanner.nextLine(); // Handles end of line (enter key).
        }
        System.out.println("SUM = " + sum + " AVG = " + average); // After loop is completed this message gets printed.
        scanner.close(); // Close the scanner.
    }
}
