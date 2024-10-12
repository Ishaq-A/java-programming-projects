public class Circle {

    private double radius; // Created instance variable (field) for radius.

    // Constructor created to assign a value to the radius.
    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    // A getter created to return the value of the radius.
    public double getRadius() {
        return radius;
    }

    // A method created to calculate the area of a circle.
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
