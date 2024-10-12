public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        // A variable is created for the sum of the factors. It is of type int and is assigned a value of zero.
        // The for-loop initialises the variable i of type int with a value of 1.
        // The condition is that i must NOT be equal to the number.
        // After each loop a value of 1 is added to the variable i.
        // An if statement is used: If the number divided by i has no remainder (is a factor) then add it to the sum.
        // The value of i is then added to the sum.
        // If the sum is equal to the number then the method returns true.
        // Otherwise the method returns false.

        int sum = 0;

        for (int i =1; i != number; i++) {
            if (number % i == 0) {
                sum += i;
            }

            if (sum == number) {
                return true;
            }
        }       return false;
    }
}
