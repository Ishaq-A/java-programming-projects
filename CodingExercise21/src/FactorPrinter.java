public class FactorPrinter {

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        // Variable (i) is initialised and assigned a value of 1.
        // The condition for the loop is i must be less than or equal to the number.
        // After one loop is complete the value of i is increased by 1 (incremented once).
        // If the number divided by i has a remainder of zero, the value of i is printed.
        // Otherwise it keeps looping until the condition becomes false.

        for (int i = 1; i <= number; i++) {
             if (number % i == 0) {
                 System.out.println(i);
             }
        }
    }
}
