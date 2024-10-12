public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstVal, double secondVal) {

        int val1 = (int) (firstVal * 1000);
        int val2 = (int) (secondVal * 1000);
        System.out.println(val1);
        System.out.println(val2);

        if (val1 == val2) {
            return true;
        } else {
            return false;
        }
    }
}
