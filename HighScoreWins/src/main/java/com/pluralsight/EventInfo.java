package com.pluralsight;
import java.util.Scanner;

public class EventInfo {
    public static void userInput(){

        Scanner read = new Scanner(System.in);

        //Gather team info
        System.out.println("Please enter a game score using this format --> Home:Visitor|21:9");
        String input = read.nextLine();

        //Split on "|"
        String[] parts = input.split("\\|");

        //Make sure input followed format: there must be 2 parts to the whole input (teams, scores)
        if (parts.length != 2){
            System.out.println("Error. Please follow this format: Home:Visitor|21:9: ");
            return;
        }

        //Split teams and scores
        String[] teams = parts[0].trim().split(":");
        String[] scores = parts[1].trim().split(":");

        //Make sure input followed format: there must be two parts inside of teams and 2 parts inside of scores
        if (teams.length != 2 || scores.length != 2){
            System.out.println("Error. Please follow this format: Home:Visitor | 21:9: ");
            return;
        }

        String homeTeam = teams[0];
        String visitorTeam = teams[1];
        int homeScore = Integer.parseInt(scores[0].trim());
        int visitorScore = Integer.parseInt(scores[1].trim());

        if ( homeScore > visitorScore){
            System.out.println("Winner: " + homeTeam);
        }else if (homeScore < visitorScore){
            System.out.println("Winner " + visitorTeam);
        }else {
            System.out.println("Tie");
        }

        read.close();

    }

}
