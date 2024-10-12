public class Rectangle {

    private double width; // Instance variable (field) created for width.
    private double length; // Instance variable (field) created for length.

    // Constructor created to initialise the fields.
    public Rectangle(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    // Two getters created to return the length and width values.
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Method to calculate the area.
    public double getArea() {
        return length * width;
    }
}
