package com.pluralsight;

import java.util.List;

public class Book {

    //Instance variables:
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut = false;
    private String checkedOutTo = " ";

    //Overloaded constructor used to initialize objects in main; no return type (allows flexible object creation)
    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    //Instance Method (not static) for displaying individual book information
    public void displayBookInfo(int number){
        System.out.println("----------------------------------------Book #" + number + ": Available for Check-Out----------------------------------------\n");
        System.out.println("Book Title: " + this.title);
        System.out.println("Book ID: " + this.id);
        System.out.println("Book ISBN: " + this.isbn);

    }

    //Methods: show available books
    public static void showAvailableBooks(List<Book> availableBooks) {
        for (int i = 0; i < availableBooks.size(); i++) {

            availableBooks.get(i).displayBookInfo(i + 1);
        }
    }

    //Methods: showCheckOut(name)
    public void checkingOutName(Book[] library, int bookCounter) {
        boolean found = false;

        for (int i = 0; i < bookCounter; i++){
            String borrower = library[i].getCheckedOutTo() + " ";
        }

    }

    //Methods: checkingInName
//    public void dropOff();

}
