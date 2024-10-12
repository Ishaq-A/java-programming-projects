class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}


public class Main {
    public static void main(String[] args) {

        Car car = new Car(8, "Base car");

        System.out.println(car.getName());
        System.out.println(car.getCylinders() + " Cylinders");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println("");

        Mitsubishi mitsubishi = new Mitsubishi(6, "Mitsubishi Evo");

        System.out.println(mitsubishi.getName());
        System.out.println(mitsubishi.getCylinders() + " Cylinders");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        System.out.println("");

        Holden holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.getName());
        System.out.println(holden.getCylinders() + " Cylinders");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
        System.out.println("");

        Ford ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.getName());
        System.out.println(ford.getCylinders() + " Cylinders");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}
