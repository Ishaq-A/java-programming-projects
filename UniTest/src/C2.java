import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
//        int number = 1234;
//        String stringVal = null;
//
//        stringVal = String.valueOf(number);
//        System.out.println(stringVal);

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("NORTHEAST", "NE");
        vocabulary.put("NORTHWEST", "NW");
        vocabulary.put("EAST", "E");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("SOUTHEAST", "SE");
        vocabulary.put("SOUTHWEST", "SW");
        vocabulary.put("WEST", "W");
        vocabulary.put("UP", "U");
        vocabulary.put("DOWN", "D");

        Scanner input = new Scanner(System.in);
        String direction = input.nextLine().toUpperCase();

        if (direction.length() > 1) {
            String[] words = direction.split(" ");

            for(String word : words) {
                for(int i = 0; i < words.length; i++) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }

            }
            System.out.println(direction);
        }

    }
}

