public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int stored = number;
        int lastDigit = stored % 10;

        while (stored > 9) {
            stored /= 10; // Same as number = number / 10;
            // While loop keeps dividing the number (stored) by 10 until the value is no longer greater than 9.
            // This is how we extract the first digit.
        }

        return stored + lastDigit;
    }
}
