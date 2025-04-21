package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        //Step 1: Create an array of 10 test scores

        int[] testScores = {40, 95, 82, 46, 100, 97, 84, 12, 36, 99};

        //Calculate the average of test scores
        double sum = 0;

        for (int i = 0; i < testScores.length; i++){
            sum += testScores[i];
        }

        double average = sum / testScores.length;

        //Calculate high and low test scores
        int highScore = testScores[0];
        int lowScore = testScores[0];

        for (int i = 1; i < testScores.length; i++){
            if (testScores[i] < lowScore){
                lowScore = testScores[i];
            }
            if (testScores[i] > highScore){
                highScore = testScores[i];
            }
        }

        System.out.println("The Average is: " + average);
        System.out.println("The Low Score is: " + lowScore);
        System.out.println("The High Score is: " + highScore);

    }
}