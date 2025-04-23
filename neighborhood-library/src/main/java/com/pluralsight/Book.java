package com.pluralsight;

import java.util.List;

public class Book {

    //Instance variables:
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;



    //Overloaded constructor used to initialize objects in main; no return type (allows flexible object creation)
    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = " ";

    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    //Methods:
    public void checkOut(String name) {
        isCheckedOut = true;
        checkedOutTo = name;
    }

    public void checkIn() {
        isCheckedOut = false;
        checkedOutTo = " ";
    }

    //Instance Method (not static) for displaying individual book information
    //Since not static, no use of this.title, this.id, etc..
    public void displayBookInfo(int bookNumber){
        System.out.println("----------------------------------------Book #" + bookNumber + ": Available for Check-Out----------------------------------------\n");
        System.out.println("Book Title: " + title);
        System.out.println("Book ID: " + id);
        System.out.println("Book ISBN: " + isbn + "\n");

    }


//    //instance methods... they need to create an instance of a book
//    public void ThisMethodBelongsToABook() {
//        System.out.println("I have to create an instance of a book to show a particular title, for this instance its this titel: " + this.title );
//    }

}
