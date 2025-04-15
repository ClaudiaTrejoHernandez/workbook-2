package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        userInput();
    }

        public static void userInput() {
            Scanner read = new Scanner(System.in);


            //User input:
            System.out.println("Enter your first name: ");
            String firstName = read.nextLine().trim();

            System.out.println("Enter your middle name (press Enter to skip): ");
            String middleName = read.nextLine().trim();

            System.out.println("Enter your last name: ");
            String lastName = read.nextLine().trim();

            System.out.println("Enter your suffix (press Enter to skip): ");
            String suffix = read.nextLine().trim();


            String fullName = firstName;

            //If middle name is present:
            if (!middleName.isEmpty()) {
                fullName = fullName + " " + middleName;
            }

            //Add last name after:
            fullName = fullName + " " + lastName;

            //If suffix is present:
            if (!suffix.isEmpty()) {
                fullName = fullName + ", " + suffix;
            }

            //Print out full name:
            System.out.println("Full Name: " + fullName);

            read.close();

        }
    }

