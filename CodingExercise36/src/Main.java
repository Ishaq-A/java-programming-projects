public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Area of a rectangle Width: 5 and length: 5 = " + rectangle.getArea());
        System.out.println("");
        Cuboid cuboid = new Cuboid(4, 5, 3);
        System.out.println("Volume of a cuboid Width: 4 Length: 5 Height: 3 =  " + cuboid.getVolume());
    }
}
