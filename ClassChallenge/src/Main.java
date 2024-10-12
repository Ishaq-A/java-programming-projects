public class Main {

    public static void main(String[] args) {

        Bank amanBank = new Bank();//("12345", 0.00, "Aman Ishaq",
               // "Aman@bank.com", "0769115268");
        System.out.println(amanBank.getAccountNumber());
        System.out.println(amanBank.getBalance());

        amanBank.withdrawal(100.0);

        amanBank.deposit(50);
        amanBank.withdrawal(100.0);

        amanBank.deposit(51.0);
        amanBank.withdrawal(100.0);

        Bank gojoBank = new Bank("Gojo", "Gojo@juju.com", "12345");
        System.out.println(gojoBank.getAccountNumber() + " name " + gojoBank.getCustomerName());
    }
}
