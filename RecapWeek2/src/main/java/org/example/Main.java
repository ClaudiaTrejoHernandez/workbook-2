package org.example;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Create an array list of Books: (array lists can hold an infinite amount of info(books in this case)
        List<Book> books = new ArrayList<>();
        //Create an array list of Books:
        List<Book> bookList = new ArrayList<>();

        //Create 3 book objects using the constructor:
        Book book1 = new Book("The Three-Body Problem", "Cixin Liu", "9780765382030");
        //Adding a book to the list
        books.add(book1);

        Book book2 = new Book("Atomic Habits", "James Clear", "9780735211292");
        books.add(book2);

        Book book3 = new Book("Fahrenheit 451", "Ray Bradbury", "9781451673319");
        books.add(book3);

        Book book4 = new Book("1984", "George Orwell", "9780451524935");
        books.add(book4);

        Book book5 = new Book("Things Fall Apart", "Chinua Achebe", "9780385474542");
        books.add(book5);

        Book book6 = new Book("Mushoku Tensei: Jobless Reincarnation Vol. 1", "Rifujin na Magonote", "9781642751383");
        books.add(book6);

        Book book7 = new Book("Artemis Fowl", "Eoin Colfer", "9781368036986");
        books.add(book7);

        Book book8 = new Book("Unbroken", "Laura Hillenbrand", "9780812974492");
        books.add(book8);

        Book book9 = new Book("Prisoner B-3087", "Alan Gratz", "9780545459013");
        books.add(book9);

        Book book10 = new Book("The Heroin Diaries", "Nikki Sixx", "9781501187544");
        books.add(book10);

        Book book11 = new Book("90 Rules for Entrepreneurs", "Marnus Broodryk", "9780620758352");
        books.add(book11);

        Book book12 = new Book("The 48 Laws of Power", "Robert Greene", "9780140280197");
        books.add(book12);

        Book book13 = new Book("Ender's Game", "Orson Scott Card", "9780812550702");
        books.add(book13);

        Book book14 = new Book("The Prince", "Niccolò Machiavelli", "9781668506448");
        books.add(book14);

        Book book15 = new Book("Disruptive Thinking", "T.D. Jakes", "9781546004004");
        books.add(book15);

        //Adding a book to the list
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
//        book5.displayDetails();
//        book6.displayDetails();
//        book7.displayDetails();
//        book8.displayDetails();
//        book9.displayDetails();
//        book10.displayDetails();
//        book11.displayDetails();
//        book12.displayDetails();
//        book13.displayDetails();
//        book14.displayDetails();
//        book15.displayDetails();

        System.out.println();

        // Method 1: Enhanced For-Loop (short & elegant)
        System.out.println("📘 Using enhanced for-loop:");
        for (Book book : bookList) {
            book.displayDetails();
            System.out.println();
        }
//  Method 2: Classic For-Loop with index
        System.out.println("📘 Using classic for-loop:");
        for (int i = 0; i < bookList.size(); i++) {
            bookList.get(i).displayDetails();
            System.out.println();
        }

    }

}