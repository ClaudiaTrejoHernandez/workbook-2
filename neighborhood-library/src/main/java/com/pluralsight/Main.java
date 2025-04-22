package com.pluralsight;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        //Array to hold inventory of at least 20 books
        Book[] library = new Book[20];

        //Book counter
        int bookCounter = 20;

        //Preloaded array with 20 books

        library[0] = new Book(1000, "978-0-7432-4722-1", "Fahrenheit 451", false, " ");
        library[1] = new Book(1001, "978-0-307-26543-1", "The Road", false, " ");
        library[2] = new Book(1002, "978-1-4013-0237-7", "The 48 Laws of Power", false, " ");
        library[3] = new Book(1003, "978-0-7434-7702-0", "Hamlet", false, " ");
        library[4] = new Book(1004, "978-0-06-112008-4", "To Kill a Mockingbird", false, " ");
        library[5] = new Book(1005, "978-1-4215-1063-0", "Grave of the Fireflies", false, " ");
        library[6] = new Book(1006, "978-0-452-28423-4", "1984", false, " ");
        library[7] = new Book(1007, "978-0-06-085052-4", "Brave New World", false, " ");
        library[8] = new Book(1008, "978-0-316-76948-0", "The Catcher in the Rye", false, " ");
        library[9] = new Book(1009, "978-0-7432-7356-5", "The Great Gatsby", false, " ");
        library[10] = new Book(1010, "978-0-14-243724-7", "Moby-Dick", false, " ");
        library[11] = new Book(1011, "978-0-14-044924-2", "The Brothers Karamazov", false, " ");
        library[12] = new Book(1012, "978-0-14-305814-4", "Crime and Punishment", false, " ");
        library[13] = new Book(1013, "978-0-14-303999-1", "War and Peace", false, " ");
        library[14] = new Book(1014, "978-0-14-303500-0", "Anna Karenina", false, " ");
        library[15] = new Book(1015, "978-0-14-143957-0", "The Picture of Dorian Gray", false, " ");
        library[16] = new Book(1016, "978-0-679-72018-1", "The Stranger", false, " ");
        library[17] = new Book(1017, "978-0-14-044917-4", "The Trial", false, " ");
        library[18] = new Book(1018, "978-0-14-044228-1", "The Metamorphosis", false, " ");
        library[19] = new Book(1019, "978-0-684-80146-8", "The Sun Also Rises", false, " ");


        //Array list of books in the library
        List<Book> availableBooks = new ArrayList<>();

        //List of each book checked-out

        List<Book> checkedOutBooks = new ArrayList<>();

        //List of each book available for check-out
        availableBooks.add(library[0]);
        availableBooks.add(library[1]);
        availableBooks.add(library[2]);
        availableBooks.add(library[3]);
        availableBooks.add(library[4]);
        availableBooks.add(library[5]);
        availableBooks.add(library[6]);
        availableBooks.add(library[7]);
        availableBooks.add(library[8]);
        availableBooks.add(library[9]);
        availableBooks.add(library[10]);
        availableBooks.add(library[11]);
        availableBooks.add(library[12]);
        availableBooks.add(library[13]);
        availableBooks.add(library[14]);
        availableBooks.add(library[15]);
        availableBooks.add(library[16]);
        availableBooks.add(library[17]);
        availableBooks.add(library[18]);
        availableBooks.add(library[19]);

        //Creating loops for screens

        int command = 0;
        //The Store Home Screen
        while (command != 3) {
            System.out.println("Welcome to the Store Home Screen friendly Neighborhood Library!\n" +
                                "What would you like to do today?\n" +
                                "1 - Show Available Books\n" +
                                "2 - Show Checked Out Books\n" +
                                "3 - Exit\n");
            System.out.println("Plese enter your command: ");
            command = read.nextInt();

            switch (command) {
                case 1:
                    Book.showAvailableBooks(availableBooks);
                    System.out.println("Select a book to check out: ");
                    read.nextInt();
                    break;
//                case 2:
//                    Book.showCheckedOutBooks();
//                case 3:
//                    System.out.println("Thank you for visiting! See you soon!");
            }
        }

    }

}