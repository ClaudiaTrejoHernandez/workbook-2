package com.pluralsight;

//STEP 1:
    public class CellPhone {

    //Variables for user input:
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    //Parameterless constructor:
    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";

    }

    public void StrangerPhone(){
        this.serialNumber = 101010;
        this.model = "iPhone 15";
        this.carrier = "Verizon";
        this.phoneNumber = "(123)456-7890";
        this.owner = "Stranger";

    }

    //Getters: special methods that always begin with get - they allow us to read the value of a variable from a class
    //Setters: special methods that always begin with set - they allow us to change the value of a variable in a class
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    //Exercise 2 - Module 2 - STEP 1: Add a dial method
    public void dial(String phoneToDial){
        System.out.println(owner + "'s phone is calling " + phoneToDial);
    }

    //for a public String to work, make sure you use return to get your string to print out
    public String CellPhoneInfo(){
        System.out.println();
        System.out.println("-------Cell Phone Info-------");
        return "Serial number: " + getSerialNumber() + "\nModel: " + getModel() + "\nCarrier: " + getCarrier() + "\nPhone number: " + getPhoneNumber() + "\nOwner: " + getOwner();

    }
}



