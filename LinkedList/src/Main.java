import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Aman", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer; // points to first customer reference.
        anotherCustomer.setBalance(12.18); // Updates first customer reference.
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2); // Inserts element number 2 in index position 1.

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
