package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Library {

    public static Scanner read = new Scanner(System.in);

    public static Book findID(List<Book> books, int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public static void showAvailableBooks(List<Book> availableBooks, List<Book> checkedOutBooks) {
        System.out.println("\nList of books available for check-out: ");
        for (int i = 0; i < availableBooks.size(); i++) {
            availableBooks.get(i).displayBookInfo(i + 1);
        }

        System.out.println("Enter Book ID to check out or press ENTER to return: ");
        String input = read.nextLine();

        if (!input.isBlank()) {
            try {
                int id = Integer.parseInt(input);
                Book book = findID(availableBooks, id);

                if (book != null && !book.isCheckedOut()) {
                    System.out.print("Enter your name: ");
                    String name = read.nextLine();
                    book.checkOut(name);
                    availableBooks.remove(book);
                    checkedOutBooks.add(book);
                    System.out.println(" Book checked out to " + name);
                } else {
                    System.out.println(" Not available or wrong ID.");
                }
            } catch (NumberFormatException e) {
                System.out.println(" Please enter a valid number.");
            }
        }
    }

    public static void showCheckedOutBooks(List<Book> checkedOutBooks, List<Book> availableBooks) {
        System.out.println("\nList of books checked-out: ");
        for (int i = 0; i < checkedOutBooks.size(); i++) {
            checkedOutBooks.get(i).displayBookInfo(i + 1);
        }

        System.out.println("C - Check in book\nX - Go back");
        String input = read.nextLine().toUpperCase();

        if ("C".equals(input)) {
            System.out.println("Enter Book ID to check in: ");
            try {
                int id = Integer.parseInt(read.nextLine());
                Book book = findID(availableBooks, id);

                if (book != null && book.isCheckedOut()) {
                    book.checkIn();
                    System.out.println("Book is checked back in!");
                } else {
                    System.out.println("Book not found or already checked back in.");
                }
                } catch(NumberFormatException e){
                    System.out.println("Please enter a valid number: ");
                }
            }
         }
    }