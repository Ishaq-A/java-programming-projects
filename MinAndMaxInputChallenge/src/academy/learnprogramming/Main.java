package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true; // Variable or (flag) set to true.

        while (true) {

            System.out.println("Enter number:");
            boolean isAnINt = scanner.hasNextInt();

            if (isAnINt) {

                int number = scanner.nextInt();

//                if (first) { // First we check if first number flag is set to true.
//                    first = false; // When first number inputted, flag set to false.
//                    min = number;
//                    max = number;
//                } // This code only ever executes once.

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }

            scanner.nextLine(); // Handle end of line.
        }

        System.out.println("Min = " + min + " , max = " + max);
        scanner.close();
    }
}
