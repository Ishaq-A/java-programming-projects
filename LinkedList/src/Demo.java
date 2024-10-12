import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();

//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Alice Springs");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
//        printList(placesToVisit);

        visit(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator(); // Standard Iterator.
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator(); // List Iterator.
        // This is not actually pointing to the first entry.
        // So you have to use the .next() to go to the first entry.

        while (stringListIterator.hasNext()) { // Goes through all entries in stringListIterator.
            int comparison = stringListIterator.next().compareTo(newCity); // Returns a number.
            if (comparison == 0) {
                // Equal, do not add.
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // New city should appear before this one.
                // Brisbane -> Adelaide
                stringListIterator.previous(); //Go back to previous entry.
                stringListIterator.add(newCity); // Adds to correct position.
                return true;
            } else if (comparison < 0) {
                // Move on to next city (goes back to start of loop).
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true; // Flag.
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) { // Checks if string is empty.
            System.out.println("No cities in the itinerary");
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \n press");
        System.out.println("0 - To quit \n" + "1 - Go to next city \n" +
                "2 - Go to previous city \n" + "3 - Print menu options");
    }
}
