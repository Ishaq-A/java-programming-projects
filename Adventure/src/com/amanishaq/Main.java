package com.amanishaq;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are In front of screen",null));



        // Exits for location 1.
        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3); // East exits to location 3.
        tempExit.put("S", 4); // south exits to location 4.
        tempExit.put("N", 5); // North exits to location 5.
        locations.put(1, new Location(1, "You are Standing at end of road",tempExit));

        // Exits for location 2.
        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5); // North exits to location 5.
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));

        // Exits for location 3.
        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1); // West exits to location 1.
        locations.put(3, new Location(3, "You are inside a building",tempExit));

        // Exits for location 4.
        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1); // North exits to location 1.
        tempExit.put("W", 2); // West exits to location 2.
        locations.put(4, new Location(4, "You are in a valley besides a stream",tempExit));

        // Exits for location 5.
        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1); // South exits to location 1.
        tempExit.put("W", 2); // West exits to location 2.
        locations.put(5, new Location(5, "You are in the forest",tempExit));

        Map<String, String> vocabulary = new HashMap<String, String>();

        vocabulary.put("QUIT", "Q"); // Word QUIT gets converted to Q.
        vocabulary.put("NORTH", "N"); // Word NORTH gets converted to N.
        vocabulary.put("SOUTH", "S"); // Word SOUTH gets converted to S.
        vocabulary.put("WEST", "W"); // Word WEST gets converted to W.
        vocabulary.put("EAST", "E"); // Word EAST gets converted to E.


        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            tempExit.remove("S");
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] words = direction.split(" "); // Array created to store split words.
                for (String word : words) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
