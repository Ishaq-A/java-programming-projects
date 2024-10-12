import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    private static int readInteger() {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.close();
        return count;
    }

    private static int[] readElements(int values) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[values];

        for (int i = 0; i < array.length; i++) {
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
            return array;
    }

    private static int findMin(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value < min) {
                min = value;
            }
        }       return min;
    }
}
