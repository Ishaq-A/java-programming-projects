public class EqualSumChecker {

    public static boolean hasEqualSum(int num1, int num2, int num3) {

        if (num1 + num2 == num3) {
            System.out.println("Sum of num1 and num2 = num3");
            return true;
        } else {
            return false;
        }
    }
}
