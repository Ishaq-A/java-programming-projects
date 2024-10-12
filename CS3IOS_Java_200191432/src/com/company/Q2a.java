package com.company;

import java.util.Scanner;

public class Q2a {

    public static Scanner scanner = new Scanner(System.in);

    public static void textArea() {
        System.out.print("Enter the number of lines: ");
        int lines = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter text below");
        String text = null;

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < lines; i++) {
            text = scanner.nextLine();
            int length = text.length();

            if(length > max) {
                max = length;
            }
        }

        System.out.println(max + " x " + lines);

    }
}
