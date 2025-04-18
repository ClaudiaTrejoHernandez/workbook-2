package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication{

    public static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        CellPhone cell1 = new CellPhone();

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

        System.out.println(cell1.CellPhoneInfo());

        read.close();
    }
}
