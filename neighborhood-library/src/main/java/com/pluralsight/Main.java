package com.pluralsight;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        //Array to hold inventory of at least 20 books
        Book[] book = new Book[20];

        //Preloaded array with 20 books
        book[0] = new Book(1000, "978-0-7432-4722-1", "Fahrenheit 451");
        book[1] = new Book(1001, "978-0-307-26543-1", "The Road");
        book[2] = new Book(1002, "978-1-4013-0237-7", "The 48 Laws of Power");
        book[3] = new Book(1003, "978-0-7434-7702-0", "Hamlet");
        book[4] = new Book(1004, "978-0-06-112008-4", "To Kill a Mockingbird");
        book[5] = new Book(1005, "978-1-4215-1063-0", "Grave of the Fireflies");
        book[6] = new Book(1006, "978-0-452-28423-4", "1984");
        book[7] = new Book(1007, "978-0-06-085052-4", "Brave New World");
        book[8] = new Book(1008, "978-0-316-76948-0", "The Catcher in the Rye");
        book[9] = new Book(1009, "978-0-7432-7356-5", "The Great Gatsby");
        book[10] = new Book(1010, "978-0-14-243724-7", "Moby-Dick");
        book[11] = new Book(1011, "978-0-14-044924-2", "The Brothers Karamazov");
        book[12] = new Book(1012, "978-0-14-305814-4", "Crime and Punishment");
        book[13] = new Book(1013, "978-0-14-303999-1", "War and Peace");
        book[14] = new Book(1014, "978-0-14-303500-0", "Anna Karenina");
        book[15] = new Book(1015, "978-0-14-143957-0", "The Picture of Dorian Gray");
        book[16] = new Book(1016, "978-0-679-72018-1", "The Stranger");
        book[17] = new Book(1017, "978-0-14-044917-4", "The Trial");
        book[18] = new Book(1018, "978-0-14-044228-1", "The Metamorphosis");
        book[19] = new Book(1019, "978-0-684-80146-8", "The Sun Also Rises");


        //Array list of books in the library
        List<Book> availableBooks = new ArrayList<>();

        //List of each book checked-out
        List<Book> checkedOutBooks = new ArrayList<>();

        //Creating loops for screens
        for (Book b : book) {
            availableBooks.add(b);
        }
        int command = 0;
        //The Store Home Screen
        while (command != 3) {
            System.out.println("\n********************Welcome to the Home Screen of your Friendly Neighborhood Library!********************\n" +
                    "\nWhat would you like to do today?\n" +
                    "1 - Show Available Books\n" +
                    "2 - Show Checked Out Books\n" +
                    "3 - Exit\n");
            System.out.println("Please enter your command: ");
            command = read.nextInt();
            read.nextLine();

            switch (command) {
                case 1:
                    //call Library class
                    Library.showAvailableBooks(availableBooks, checkedOutBooks);
                    break;
                case 2:
                    Library.showCheckedOutBooks(checkedOutBooks, availableBooks);
                    break;
                case 3:
                    System.out.println("Thanks for stopping by. See you soon!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }

    }

}
