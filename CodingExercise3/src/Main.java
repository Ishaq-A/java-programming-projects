public class Main {
    public static void main(String [] args) {
        boolean wake = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(wake);

        wake = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(wake);

        wake = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(wake);

        wake = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(wake);
    }
}
