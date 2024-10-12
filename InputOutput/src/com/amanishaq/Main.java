package com.amanishaq;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Locations locations = new Locations();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> vocabulary = new HashMap<String, String>();

        vocabulary.put("QUIT", "Q"); // Word QUIT gets converted to Q.
        vocabulary.put("NORTH", "N"); // Word NORTH gets converted to N.
        vocabulary.put("SOUTH", "S"); // Word SOUTH gets converted to S.
        vocabulary.put("WEST", "W"); // Word WEST gets converted to W.
        vocabulary.put("EAST", "E"); // Word EAST gets converted to E.


        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
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
