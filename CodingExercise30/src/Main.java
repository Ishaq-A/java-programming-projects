public class Main {

    public static void main(String [] args) {

        Person person = new Person();
        person.setFirstName(""); // First name is set to empty string.
        person.setLastName(""); // Last name is set to empty string.
        person.setAge(10);
        System.out.println("Full name = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
        System.out.println("");
        person.setFirstName("Aman");
        person.setLastName("Ishaq");
        person.setAge(21);
        System.out.println("Full name = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
        System.out.println("");

    }
}
