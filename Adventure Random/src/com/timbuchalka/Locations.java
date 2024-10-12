package com.timbuchalka;

import java.io.*;
import java.util.*;

/**
 * Created by timbuchalka on 2/04/2016.
 */
public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();

    private static Map<Integer, IndexRecord> index = new LinkedHashMap<>();

    private static RandomAccessFile ra;

    public static void main(String[] args) throws IOException {

        try(RandomAccessFile rao = new RandomAccessFile("locations_rand.dat", "rwd")) {
            rao.writeInt(locations.size()); // Writing number of locations to file.
            int indexSize = locations.size() * 3 * Integer.BYTES;
            int locationStart = (int) (indexSize + rao.getFilePointer() + Integer.BYTES);
            rao.writeInt(locationStart);

            long indexStart = rao.getFilePointer();

            int startPointer = locationStart; // first offset set to a variable.
            rao.seek(startPointer); // Seek method used to move file pointer to first locations offset.
            // Only has to be done for first location. After this data is written sequentially.

            for(Location location : locations.values()) {
                rao.writeInt(location.getLocationID()); // Writing LocationID.
                rao.writeUTF(location.getDescription()); // Writing description.
                StringBuilder builder = new StringBuilder();
                for(String direction : location.getExits().keySet()) {
                    if(!direction.equalsIgnoreCase("Q")) {
                        builder.append(direction);
                        builder.append(",");
                        builder.append(location.getExits().get(direction));
                        builder.append(",");
                    }
                }
                rao.writeUTF(builder.toString()); // Writing exits.

                IndexRecord record = new IndexRecord(startPointer, (int) (rao.getFilePointer()
                        - startPointer)); // IndexRecord created.
                index.put(location.getLocationID(), record); // Adding index record.

                startPointer = (int) rao.getFilePointer(); // Start pointer updated for next location.
            }

            rao.seek(indexStart); // Seeking to offset previously saved.
            // Looping through all index records and writing them to the file.
            for(Integer locationID : index.keySet()) {
                rao.writeInt(locationID);
                rao.writeInt(index.get(locationID).getStartByte());
                rao.writeInt(index.get(locationID).getLength());
            }
        }
    }

    // This gets executed and read in before the main method.
    static {

        try {
            ra = new RandomAccessFile("locations_rand.dat", "rwd");
            int numLocations = ra.readInt(); // Number of locations read into variable.
            long locationStartPoint = ra.readInt(); // Same for offset of location section.
            // Then index loaded into memory.

            // Looping through until file pointer reaches the locations offset.
            while(ra.getFilePointer() < locationStartPoint) {
                // Reading the index, and creating the record as it goes.
                int locationId = ra.readInt();
                int locationStart = ra.readInt();
                int locationLength = ra.readInt();

                // Creating new index record.
                IndexRecord record = new IndexRecord(locationStart, locationLength);
                // Saving the index record.
                index.put(locationId, record);
            }

        } catch(IOException e) {
            System.out.println("IOE in static initializer" + e.getMessage());
        }
    }

    public Location getLocation(int locationId) throws IOException {
        IndexRecord record = index.get(locationId);
        ra.seek(record.getStartByte());
        int id = ra.readInt(); // Retrieving locationID.
        String description = ra.readUTF(); // Retrieving description.
        String exits = ra.readUTF(); // Retrieving exits.
        // All of that is extracted into String array below.
        String[] exitPart = exits.split(",");

        // Creating a new location object which initially has no exits.
        Location location = new Location(locationId, description, null);

        if(locationId != 0) {
            // Loop adds exits to location.
            for(int i = 0; i < exitPart.length; i++) {
                System.out.println("exitPart = " + exitPart[i]);
                System.out.println("exitPart[+1] = " + exitPart[i + 1]);
                String direction = exitPart[i];
                int destination = Integer.parseInt(exitPart[++i]);
                location.addExit(direction, destination);
            }
        }
        return location;
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

    public void close() throws IOException {
        ra.close();
    }


}
