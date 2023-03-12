package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> listOfCards = new ArrayList<>();

//    public Deck(){
//
//        for( int suit = 0; suit < 4; suit++){
//            for (int rank = 0; rank < 13; rank++){
//                listOfCards.add(new Card(suit,rank));
//            }
//        }
//    }
    public Deck(int[] suits, int[] ranks){
        for (int suit : suits){
            for (int rank : ranks){
                listOfCards.add(new Card(suit, rank));
            }
        }
    }

    public Card dealOne(){

        if (listOfCards.size() != 0){
            return listOfCards.remove(0);
        } else {
            return null;
        }
    }

    public int NumberOfCards(){
        return listOfCards.size();
    }

    public void shuffle(){
        Collections.shuffle(listOfCards);
    }

    public String deckString() {
        String string = "";
        for (Card card : listOfCards) {
            // Note, cardString(false) returns the card face-up.
            string += card.cardString(false) + "\n";
        }
        return string;
    }

}
