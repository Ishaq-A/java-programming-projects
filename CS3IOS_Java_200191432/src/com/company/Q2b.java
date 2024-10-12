package com.company;

import java.util.Scanner;

public class Q2b {

    public static Scanner scanner = new Scanner(System.in);

    public static void textAreaMod() {
        System.out.print("Enter the character width: ");
        int width = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the character height: ");
        int height = scanner.nextInt();

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

        System.out.println((max * width) + " x " + (lines * height));

    }
}
