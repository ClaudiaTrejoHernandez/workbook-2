package org.example;

public class Client {

    // Storing information like. firstname, lastname



    public String firstName;
    private String lastName;
    private String businessName;
    private String email;
    private String phoneNumber;

    // Constructor
    // its to design and create new Clients where we must provide this information
    public Client(String firstName, String lastName, String businessName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.businessName = businessName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //
    public String getFormattedName() {
        return String.format("%s, %s %s.", this.lastName, this.firstName, this.firstName.charAt(0));
    }

    public void printEmail() {
        System.out.println("Email: " + this.email);
    }
}