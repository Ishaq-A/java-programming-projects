public class Main {

    public static void main(String[] args) {

        Audi audi = new Audi(36);
        audi.steer(45);
        System.out.println("");
        audi.accelerate(30);
        System.out.println("");
        audi.accelerate(20);
        System.out.println("");
        audi.accelerate(-42);
    }
}
