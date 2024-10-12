package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in); // Scanner to accept console input.
    private static int[] baseData = new int[10]; // Array of 10 elements.

    public static void main(String[] args) {
        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
//        System.out.println("Enter 12 integers:");
//        getInput();
        baseData[10] = 67;
        baseData[11] = 34;
        printArray(baseData);

    }

    private static void getInput() { // Method to get data from the console.
        for (int i = 0; i < baseData.length; i++)
            baseData[i] = s.nextInt(); // Save data in an array.
    }

    private static void printArray(int[] arr) { // Method to print array contents.
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static void resizeArray() { // Method that copies base array and resizes array.
        int[] original = baseData; // Save the original array first to another variable.

        baseData = new int[12]; // Then initialise variable with a new int array with different number of elements.
        for (int i = 0; i < original.length; i++) // Loop to copy values from original array into new array.
            baseData[i] = original[i];
    }
}
