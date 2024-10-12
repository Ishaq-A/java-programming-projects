public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    // Constructor 1: Initialise fields (including those from parent class).
    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1; // Default current gear set to a value of 1.
    }

    public void changeGear(int currentGear) { // Allows the value of the current gear to be changed.
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
        move(speed, direction); // Calling the move method from the Vehicle class.
    }


}
