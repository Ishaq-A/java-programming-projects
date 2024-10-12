package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);

        Case theCase = new Case("O11 Dynamic", "Lian Li", "750W", dimensions);

        Monitor theMonitor = new Monitor("G27Q Gaming", "GIGABYTE", 27, new Resolution(2560, 1440));

        Motherboard motherboard = new Motherboard("TUF GAMING X570-PRO", "ASUS", 4, 2, "V 4002");

        PC thePC = new PC(theCase, theMonitor, motherboard);
        thePC.powerUp();
    }
}
