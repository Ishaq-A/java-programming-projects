package com.amanishaq;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();

        languages.put("Java", "A compiled high-level, OOP, platform independent language");
        languages.put("Python", "An interpreted high-level, OOP, language with dynamic semantics");
        languages.put("Algol", "An algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners all-purpose symbolic instruction code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "This course is about java");
        }

        System.out.println("==========================================================");

//        languages.remove("Lisp");

        if (languages.remove("Algol", "An algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key-value pair not found");
        }

        if (languages.replace("Lisp", "Therein lies madness", "Words")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

        System.out.println(languages.replace("Scala", "This will not be added"));

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
