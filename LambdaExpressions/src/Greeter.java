public class Greeter {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting lambdaGreeting = () -> System.out.println("Hello, World!");
        lambdaGreeting.perform();


        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello, World!");
            }
        };

        innerClassGreeting.perform();

    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }
}





