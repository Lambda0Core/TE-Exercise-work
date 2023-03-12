package com.techelevator;

public class Card {
    private int suit;
    private int rank;
    private boolean faceDown = true;

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public Card(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }

     public void flip(){
            this.faceDown = !this.faceDown;
     }

     public boolean isFaceDown(){
        return this.faceDown;
     }


     public String cardString(boolean faceDown){
        if (faceDown){
            return "##";
        } else {
            return  this.getRank() + " of " + this.getSuit();
        }
     }
    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }
}
