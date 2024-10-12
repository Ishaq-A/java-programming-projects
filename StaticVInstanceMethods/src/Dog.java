class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name = " + name);
    }
}

public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog("rex"); // Create instance (rex).
        Dog fluffy = new Dog("fluffy"); // Create instance (fluffy).
        rex.printName(); // Prints rex.
        fluffy.printName(); // Prints fluffy.
    }
}
