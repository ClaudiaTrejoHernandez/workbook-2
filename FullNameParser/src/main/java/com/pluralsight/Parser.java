package com.pluralsight;
import java.util.Scanner;

public class Parser {
    public static void parseName() {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter your name (first last OR first middle last): ");
        String name = read.nextLine();
        name = name.trim();

        // Split the name by spaces
        String[] parts = name.split("\\s+");

        if (parts.length == 2){
            System.out.println("First Name: " + parts[0]);
            System.out.println("Middle Name: (none)");
            System.out.println("Last Name: " + parts[1]);
        }else if (parts.length == 3){
            System.out.println("First Name: " + parts[0]);
            System.out.println("Middle Name: " + parts[1]);
            System.out.println("Last Name: " + parts[2]);
        }else {
            System.out.println("Invalid input. Please enter either 'first last' OR 'first middle last'.");
        }
    }
}