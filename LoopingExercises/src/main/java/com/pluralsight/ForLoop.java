package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); //pause 1 sec
            } catch (InterruptedException e) {
                //do nothing
            }
        }
        System.out.println("Launch!");
    }
}
