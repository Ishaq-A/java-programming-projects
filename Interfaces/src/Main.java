public class Main {

    public static void main(String[] args) {

        ITelephone AmansPhone; // Defining the telephone interface.

        AmansPhone = new DeskPhone(12345); // creating new object from DeskPhone class.

        // Calling various methods from the DeskPhone class.
        AmansPhone.powerOn();
        AmansPhone.callPhone(12345);
        AmansPhone.answer();
        System.out.println("===================================");

        AmansPhone = new MobilePhone(24565);

        AmansPhone.powerOn();
        AmansPhone.callPhone(24565);
        AmansPhone.answer();
    }
}
