package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static Scanner read = new Scanner(System.in);

    public static  void main(String[] args) {


//        //Create string with your birthday
//        String birthday = "1989-06-02"; //this was already ISO for LocalDate
//
//        String friendBirthday = "06-02-1989"; //not in ISO standard
//
//        //looks like a constructor
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD-MM-YYYY");
//
//        LocalDate realBirthday = LocalDate.parse(birthday);
//        LocalDate friendBirthday = LocalDate.parse(friendBirthday, formatter);
//
//        DateTimeFormatter formatArrivalDate = DateTimeFormatter.ofPattern("MM/dd/yyyy");


        //Create the object that will hold the movie info:
        MovieInfo movieInfo = new MovieInfo("", "", "", 0);

        //Get user's full name:
        System.out.println("Please enter your first name: ");
        String firstName = read.nextLine();
        movieInfo.setFirstName(firstName);

        System.out.println("Please enter your last name: ");
        String lastName = read.nextLine();
        movieInfo.setLastName(lastName);

        //Get date of the show and use DateTimeFormatter with LocalDate
        System.out.println("Please enter the date of the show (MM/dd/yyyy): ");
        String dateOfShow = read.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate dateOfShowParse = LocalDate.parse(dateOfShow, formatter);
        movieInfo.setDateOfShow(String.valueOf(dateOfShowParse));

        //Get number of tickets:
        System.out.println("Please enter the number of tickets you need: ");
        int numOfTickets = read.nextInt();
        read.nextLine();
        movieInfo.setNumOfTickets(numOfTickets);

        System.out.println(movieInfo.Reservation());

        read.close();
    }

}