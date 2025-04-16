package com.pluralsight;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        // string contains "id|description|quantity|price"
        String input1 = "111|Hot Chocolate (12-count)|21|4.99";
        String input2 = "211|Cold Chocolate (12-count)|21|5.99";

        Product p1 = splitThisLineOfProducts(input1);
        Product p2 = splitThisLineOfProducts(input2);

        // Calculate total price
        System.out.println(p1.getTotalPrice());

    }
        public static Product splitThisLineOfProducts (String _input1){
            String[] tokens = _input1.split(Pattern.quote("|"));
            int id1 = Integer.parseInt(tokens[0]);
            String name1 = tokens[1];
            int quantity1 = Integer.parseInt(tokens[2]);
            double price1 = Double.parseDouble(tokens[3]);
            return new Product(name1, price1, quantity1, id1);
        }
    }
