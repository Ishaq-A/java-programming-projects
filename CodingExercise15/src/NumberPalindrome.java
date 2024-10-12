public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int stored = number;

        while (stored > 0) {
            // Extract the least significant digit
            int lastDigit = stored % 10;
            reverse = (reverse * 10) + lastDigit;
            // Drop the least significant digit
            stored /= 10; // Same as number = number / 10;
        }

        System.out.println("Number is " + number + " Reverse is " + reverse);
        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
