public class Main {

    public static void main(String [] args) {

        Circle circle = new Circle(5);
        System.out.println("Radius is " + circle.getRadius() + " Area is " + circle.getArea());
        System.out.println("");
        Cylinder cylinder = new Cylinder(5, 6);
        System.out.println("Volume of cylinder with radius 5 and height 6 is " + cylinder.getVolume());
    }
}
