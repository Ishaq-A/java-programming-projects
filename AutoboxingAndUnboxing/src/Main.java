import java.util.ArrayList;

public class Main {

    public static void main(String [] args) {

        String[] strArray = new String[10]; //Creating string array with 10 elements.
        int[] intArray = new int[10]; // Creating int array with 10 elements.

        ArrayList<String> strArrayList = new ArrayList<String>(); // Creating string ArrayList.
        strArrayList.add("Aman"); // Adds element to ArrayList.
        // Actually adds an object of type string to the ArrayList automatically.

        //ArrayList<int> intArrayList = new ArrayList<int>(); CANNOT use primitive type when creating ArrayList.

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<>();
//        for (int i = 0; i <= 10; i++) {
//            intArrayList.add(Integer.valueOf(i));
//        }
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i + " --> " + intArrayList.get(i).intValue());
//        }

        Integer myIntValue = 56; // Same as Integer.valueOf(56);
        int myInt = myIntValue; // Same as myInt.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl);
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }
    }
}
