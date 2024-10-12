package com.amanishaq;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Locations implements Map<Integer, Location> {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) throws IOException {
        try(FileWriter localFile = new FileWriter("locations.txt");
            FileWriter dirFile = new FileWriter("directions.txt")) {
            for(Location location : locations.values()) {
                localFile.write(location.getLocationID() + ", " + location.getDescription() + "\n");
                for(String direction : location.getExits().keySet()) {
                    dirFile.write(location.getLocationID() + ", " + direction + ", "
                            + location.getExits().get(direction) + "\n");
                }
            }
        }

//        FileWriter localFile = null; // FileWriter object created.
//        try {
//            localFile = new FileWriter("locations.txt"); // Passes filename as a parameter.
//            for(Location location : locations.values()) {
//                // Write method used to write data to a file.
//                localFile.write(location.getLocationID() + ", " + location.getDescription() +"\n");
//            }
//        } finally {
//            System.out.println("In finally block");
//            if (localFile != null) {
//                System.out.println("Attempting to close");
//                localFile.close();
//            }
//        }
    }

    static {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("locations.txt"));
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()) {
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                System.out.println("Imported loc: " + loc + ": " + description);
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(scanner != null) {
                scanner.close();
            }
        }

        // Now read the exits
        try {
            scanner = new Scanner(new BufferedReader(new FileReader("directions.txt")));
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()) {
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String direction = scanner.next();
                scanner.skip(scanner.delimiter());
                String dest = scanner.nextLine();
                int destination = Integer.parseInt(dest);
                System.out.println(loc + ": " + direction + ": " + destination);
                Location location = locations.get(loc);
                location.addExit(direction, destination);
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(scanner != null) {
                scanner.close();
            }
        }


//        Map<String, Integer> tempExit = new HashMap<String, Integer>();
//        locations.put(0, new Location(0, "You are In front of screen",null));
//
//        // Exits for location 1.
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("W", 2);
//        tempExit.put("E", 3); // East exits to location 3.
//        tempExit.put("S", 4); // south exits to location 4.
//        tempExit.put("N", 5); // North exits to location 5.
//        locations.put(1, new Location(1, "You are Standing at end of road",tempExit));
//
//        // Exits for location 2.
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("N", 5); // North exits to location 5.
//        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));
//
//        // Exits for location 3.
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("W", 1); // West exits to location 1.
//        locations.put(3, new Location(3, "You are inside a building",tempExit));
//
//        // Exits for location 4.
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("N", 1); // North exits to location 1.
//        tempExit.put("W", 2); // West exits to location 2.
//        locations.put(4, new Location(4, "You are in a valley besides a stream",tempExit));
//
//        // Exits for location 5.
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("S", 1); // South exits to location 1.
//        tempExit.put("W", 2); // West exits to location 2.
//        locations.put(5, new Location(5, "You are in the forest",tempExit));
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
