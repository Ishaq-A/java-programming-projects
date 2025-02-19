import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args) {

        int[] myIntegers = getIntegers(5);
        int [] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values.\r");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length]; // Creates a new array of same length.
//
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true; // Flag initially set to true.
        int temp;

        while (flag) { // Loop only continues when flag is true.
            flag = false; // Immediately set to false.

            // element 0 = 50.
            // element 1 = 160.
            // element 2 = 40.

            // Loop only continues if flag gets set to true (based on condition below).
            for (int i = 0; i < sortedArray.length - 1; i++) { // start at element 0. Ending element is always one less than the total.
                if (sortedArray[i] < sortedArray[i + 1]) { // The reason is because of the i + 1.
                    temp = sortedArray[i]; // Value of next element stored in variable.
                    sortedArray[i] = sortedArray[i + 1]; // Swaps the value if next element has bigger value.
                    sortedArray[i + 1] = temp; // Make the temp variable equal to that value.
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
