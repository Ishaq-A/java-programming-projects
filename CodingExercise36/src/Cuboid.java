public class Cuboid extends Rectangle {

    private double height; // Instance variable (field) created for height.

    // Constructor created to initialise height field and parameters from parent constructor.
    public Cuboid(double width, double length, double height) {
        super(length, width); // Calls the parent constructor.

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

    // Method created to calculate the volume.
    public double getVolume() {
        return height * getArea();
    }
}
