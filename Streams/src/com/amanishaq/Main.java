package com.amanishaq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71");

        List<String> gNumbers = new ArrayList<>();

        someBingoNumbers
                .stream()
                // Stream that contains all items in list, in same order they occur in the list.
                .map(String::toUpperCase) // Map method called and passing an inner method.
                // The String::toUpperCase is a method reference. Can be used when
                // all a lambda does is call an existing method.
                // Same as s -> s.toUpperCase().
                .filter(s -> s.startsWith("G"))
                // Filter method wants a Predicate not a Function.
                // Taking a lambda expression which evaluates a true or false value.
                // Resulting stream will only contain items the Predicate determines true.
                .sorted()
                // Sorted method sorts, based on natural ordering of items in the stream.
                .forEach(System.out::println);
                // Results printed using forEach method.
                // NOTE: Not the same forEach as used previously with Iterable interface.
                // This forEach method is from the Stream class.
                // All steps have used methods from the Stream class.

        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        System.out.println("-----------------------");
        System.out.println(concatStream.distinct().peek(System.out::println).count());

//        someBingoNumbers.forEach(number -> {
//            if(number.toUpperCase().startsWith("G")) {
//                gNumbers.add(number);
//            }
//        });
//        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        gNumbers.forEach((String s) -> System.out.println(s));

        Employee john = new Employee("John Doe", 30);
        Employee jane = new Employee("Jane Dear", 25);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        Department hr = new Department("Human Resources");
        hr.addEmployee(jane);
        hr.addEmployee(jack);
        hr.addEmployee(snow);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

        System.out.println("-----------------------------------------");

//        List<String> sortedGNumbers = someBingoNumbers
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.startsWith("G"))
//                .sorted()
//                .collect(Collectors.toList());

        List<String> sortedGNumbers = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for(String s : sortedGNumbers) {
            System.out.println(s);
        }

        Map<Integer, List<Employee>> groupedByAge = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1 ,e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);

        Stream.of("ABC", "AC", "BAA", "CCC", "XY", "ST")
                .filter(s -> {
                    System.out.println(s);
                    return s.length() == 3;
                })
                .count();
    }

}
