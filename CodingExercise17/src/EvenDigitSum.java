public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0; // Set the sum value to 0. Must be initialised outside of while-loop.

        while (number > 0) {
            if (number % 2 == 0) { // IF the number is divisible by 2 (is an even number).
                sum += number % 10; // Extract the least significant digit and add it to the sum.
            }

            number /= 10; // Divide the number by 10 to check for the next digit in the loop.

        }   return sum; // Return the sum of the even numbers.
    }
}
