public class Cylinder extends Circle{

    private double height; // Created instance variable (field) for the height.

    // Constructor created to initialise the height field (also parent constructor called).
    public Cylinder(double radius, double height) {
        super(radius); // Calls the parent constructor.
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }

    // A getter created to return the value of the height.
    public double getHeight() {
        return height;
    }

    // A method to calculate the volume.
    public double getVolume() {
        return height * getArea();
    }
}
