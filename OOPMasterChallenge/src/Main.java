public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Lamb", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total burger price is " + hamburger.itemiseHamburger());
        System.out.println("");

        HealthyBurger healthyBurger = new HealthyBurger("Beef", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 6.69);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total healthy burger price is " + healthyBurger.itemiseHamburger());
        System.out.println("");

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        db.itemiseHamburger();
    }
}
