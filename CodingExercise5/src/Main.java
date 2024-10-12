public class Main {

    public static void main(String [] args) {

        boolean equality = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756d, -3.175d);

        if (equality) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
