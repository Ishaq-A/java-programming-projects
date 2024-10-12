import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 5, 3, 7, 11, 9, 15};
        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {

        int maxIndex = array.length - 1; // Represents maximum index.
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i]; // Saving current element at index i.
            array[i] = array[maxIndex - i]; // Moved element from max index to one before.
            array[maxIndex - i] = temp;
        }
    }
}
