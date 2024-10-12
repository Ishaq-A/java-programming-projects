public class LargestPrime {

    public static int getLargestPrime(int number) {
        if ((number < 2)) {
            return -1;
        }

        // Initialising variable i to a value of 2.
        // Condition is that i must be less than number (loop will run until condition is false).
        // A value of 1 is added to i after each complete loop.

        for (int i = 2; i < number; i++) {
            if (number % i == 0) { // If the number is divisible by 1.
                number /= i; // Divide the number by i (same as number = number / i;).
                i--; // A value of 1 is subtracted from i and this is compared against the new number.
            }
        }       return number; // Returns the value of the final number (largest prime factor).
    }
}
