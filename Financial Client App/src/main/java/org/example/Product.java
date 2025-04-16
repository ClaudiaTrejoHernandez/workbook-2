package org.example;

import java.util.regex.Pattern;

public class Product {

    private String name;
    private double price;
    private int quantity;
    private int id;

    public Product(String name, double price, int quantity, int id) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }

    public double grossTotalPrice() {
        return quantity * price;
    }

    //Getter for name
    public String getName() {
        return name;
    }

    //Setter for name
    public void setName(String name) {
        this.name = name;
    }

    //Getter for price
    public double getPrice() {
        return price;
    }

    //Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

