package org.example;

public class Book {

    //Author, title, tableOfContent, Genre, ISBN
    private String title;
    private String author;
    private String tableOfContent;
    private int pageNumber;
    private String genre;
    private String ISBN;
    private int publishingYear;

    //Create a constructor with title, Author, and ISBN.
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTableOfContent() {
        return tableOfContent;
    }

    public void setTableOfContent(String tableOfContent) {
        this.tableOfContent = tableOfContent;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        if (pageNumber <= 0) {
            throw new IllegalArgumentException("Page number must be greater than 0."); //First error path; won't necessarily stop the program
        }
            this.pageNumber = pageNumber;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    //Create a method to display the book information:
    public void displayDetails() {
        System.out.println("----------Book Details----------");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Published Year: " + this.publishingYear);
        System.out.println("Page Number: " + this.pageNumber);
    }
}
