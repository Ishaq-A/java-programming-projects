public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }

        // Logic to find the greatest common divisor.
        // Example: (10;45)
        // 45 - 10 = 35
        // 35 - 10 = 25
        // 25 - 10 = 5
        // 10 - 5 = 5
        // 5 - 5 = 0
        // So the greatest common divisor is 5.

        // The while-loop keeps subtracting the two numbers from each other until they are equal.
        // Once they are equal the loop stops, as the condition is that they must NOT be equal.

        while (first != second) { // While the first number is NOT equal to the second number.
            if (first > second) { // If the first number is greater than the second number.
                first -= second; // Same as first = first - second.
            } else {
                second -= first; // Same as second = second - first
            }
        }   return first; // Returns the lowest common divisor.
    }
}
