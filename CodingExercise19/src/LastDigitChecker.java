public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if ((num1 < 10) || (num1 > 1000) || (num2 < 10) || (num2 > 1000) || (num3 < 10) || (num3 > 1000)) {
            return false;
        }

        int lastDigitNum1 = num1 % 10; // Initialise a variable to obtain the last digit of number 1.
        int lastDigitNum2 = num2 % 10; // Initialise a variable to obtain the last digit of number 2.
        int lastDigitNum3 = num3 % 10; // Initialise a variable to obtain the last digit of number 3.

        // The if statement below compares if any of the three numbers have the same last digit

        if ((lastDigitNum1 == lastDigitNum2) || (lastDigitNum1 == lastDigitNum3) || (lastDigitNum2 == lastDigitNum3)) {
            return true; // If any of the above condition is satisfied, return TRUE.
        }   return false; // If none of the conditions are satisfied, return FALSE (Do not need an ELSE statement).
    }

    public static boolean isValid(int value) {
        if ((value < 10) || (value > 1000)) {
            return false; // If any of the above conditions are satisfied, return FALSE.
        }   return true; // If none of the conditions are satisfied, return FALSE.
    }
}
