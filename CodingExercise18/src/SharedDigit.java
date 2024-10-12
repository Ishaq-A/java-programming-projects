public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10) || (num1 > 99) || (num2 < 10) || num2 > 99) { //Set the conditions.
            return false;
        }

        int firstDigitNum1 = num1 /10; // Initialise a variable to obtain the first digit of number 1.
        int lastDigitNum1 = num1 % 10; // Initialise a variable to obtain the last digit number 1.
        int firstDigitNum2 = num2 / 10; // Initialise a variable to obtain the first digit of number 2.
        int lastDigitNum2 = num2 % 10; // Initialise a variable to obtain the last digit of number 2.

        // The next if statement below compares the digits of both numbers to see if any of them match.

        if ((firstDigitNum1 == firstDigitNum2) || (firstDigitNum1 == lastDigitNum2) || (lastDigitNum1 == firstDigitNum2)
                || (lastDigitNum1 == lastDigitNum2)) {
                return true;
        } else {
                return false;
        }
    }
}
