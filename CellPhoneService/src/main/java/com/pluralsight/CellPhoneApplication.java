package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication{

    public static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {


        //Exercise 1: 1st instance of a cell:
        CellPhone cell1 = new CellPhone();

        //Exercise 2: 2nd instance of a cell:
        CellPhone strangerPhone = new CellPhone();
        //Calling the StrangerPhone method from CellPhone class:
        strangerPhone.StrangerPhone();

        //Exercise 3: 3rd instance of a cell:
        CellPhone cell3 = new CellPhone(1234, "iPhone 8", "Verizon", "(111)000-0000", "Sam");



        System.out.println("Enter the cell serial number: ");
        int serialNumber = read.nextInt();
        cell1.setSerialNumber(serialNumber);
        read.nextLine();

        System.out.println("Enter the cell model: ");
        String model = read.nextLine();
        cell1.setModel(model);

        System.out.println("Enter cell carrier: ");
        String carrier = read.nextLine();
        cell1.setCarrier(carrier);

        System.out.println("Enter phone number: ");
        String phoneNumber = read.nextLine();
        cell1.setPhoneNumber(phoneNumber);

        System.out.println("Enter cell owner: ");
        String owner = read.nextLine();
        cell1.setOwner(owner);

        display(cell1);
        display(strangerPhone);
        //Exercise 3: calling the display () method of the new cell3
        display(cell3);

        System.out.println("-----------------------------\n ");

        System.out.println();

        cell1.dial(strangerPhone.getPhoneNumber());
        strangerPhone.dial(cell1.getPhoneNumber());

    }


    public static void display(CellPhone phone){
        //(CellPhone phone) is a parameter. It's saying whoever calls this method must give me a CellPhone object to work with.
        System.out.println(phone.CellPhoneInfo());
    }

}

