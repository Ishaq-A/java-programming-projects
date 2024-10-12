public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Santander"); // New object created from bank class.

        bank.addBranch("Birmingham");
        System.out.println("Birmingham branch created");

        bank.addCustomer("Birmingham", "Aman", 100.50);
        bank.addCustomer("Birmingham", "Saif", 167.39);
        bank.addCustomer("Birmingham", "Yusuf", 259.13);

        bank.addBranch("London");

        bank.addCustomer("London", "Ishaq", 500.45);

        bank.addCustomerTransaction("London", "Aman", 69.69);
        bank.addCustomerTransaction("London", "Ishaq", 56.22);
        bank.addCustomerTransaction("London", "Yusuf", 10.12);

        bank.listCustomers("Birmingham", true);
        bank.listCustomers("London", true);

        bank.addBranch("Melbourne");
        if (!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if (!bank.addBranch("Birmingham")) {
            System.out.println("Birmingham branch already exists");
        }

        if (!bank.addCustomerTransaction("Birmingham", "Person", 52.01)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Birmingham", "Aman", 12.21)) {
            System.out.println("Customer Aman already exists");
        }
    }
}
