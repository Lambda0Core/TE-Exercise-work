package com.techelevator;

public class InClassDemo2 {
    public static void main(String[] args) {

        int [] team1Score = new int [4];

        team1Score[0]= 20;
        team1Score[1]= 14;
        team1Score[2]= 18;
        team1Score[3]= 23;

        System.out.println(team1Score[0]);
        System.out.println(team1Score[1]);
        System.out.println(team1Score[2]);
        System.out.println(team1Score[3]);

        for (int i = 0; i < team1Score.length; i++) {
            System.out.println(team1Score[i]);
        }


    }
}
