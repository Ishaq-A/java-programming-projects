public class Main {

    public static void main(String[] args) {
        House blueHouse = new House("Blue");
        House anotherHouse = blueHouse;

        System.out.println(blueHouse.getColour()); // Prints blue.
        System.out.println(anotherHouse.getColour()); // Blue.

        anotherHouse.setColour("Red");
        System.out.println(blueHouse.getColour()); // Red.
        System.out.println(anotherHouse.getColour()); // Red.

        House greenHouse = new House("Green");
        anotherHouse = greenHouse;

        System.out.println(blueHouse.getColour()); // Red
        System.out.println(greenHouse.getColour()); // Green
        System.out.println(anotherHouse.getColour()); // Green
    }
}
