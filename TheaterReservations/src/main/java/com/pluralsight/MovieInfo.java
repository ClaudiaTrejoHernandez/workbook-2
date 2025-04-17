package com.pluralsight;
import java.time.format.DateTimeFormatter;

public class MovieInfo {

    private String firstName;
    private String lastName;
    private String dateOfShow;
    private int numOfTickets;

    public MovieInfo(String firstName, String lastName, String dateOfShow, int numOfTickets) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfShow = dateOfShow;
        this.numOfTickets = numOfTickets;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getDateOfShow() {
        return dateOfShow;
    }

    public void setDateOfShow(String dateOfShow) {
        this.dateOfShow = dateOfShow;
    }

    public int getNumOfTickets() {
        return numOfTickets;
    }

    public void setNumOfTickets(int numOfTickets) {
        this.numOfTickets = numOfTickets;
    }

    public String Reservation(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String dateOfShowString = String.format(dateOfShow, formatter);

        if (this.numOfTickets == 1) {
            return numOfTickets + " ticket reserved for " + dateOfShowString + " under " + lastName + ", " + firstName;
        } else if (this.numOfTickets > 1) {
            return numOfTickets + " tickets reserved for " + dateOfShowString + " under " + lastName + ", " + firstName;
        } else {
            return "You've input an invalid number of tickets.";
        }
    }

}




