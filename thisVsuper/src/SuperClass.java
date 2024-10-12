public class SuperClass { // Parent class a.k.a super class.

    public void printMethod() {
        System.out.println("Printed in SuperClass");
    }
}

    class SubClass extends SuperClass { // Subclass a.k.a child class.
        // Overrides method from parent.
        @Override
        public void printMethod() {
            super.printMethod(); // Calls method in SuperClass (parent).
            System.out.println("Printed in subClass");
        }
    }

    class MainClass {
        public static void main(String[] args) {
            SubClass s = new SubClass();
            s.printMethod();
        }
    }
