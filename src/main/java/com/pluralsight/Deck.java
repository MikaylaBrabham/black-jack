package com.pluralsight;

//add imports

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    //add arrays
    private ArrayList<Card> cards;


    public Deck() {
        cards = new ArrayList<>();

// add suites and values for the cards
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8",
                "9", "10", "J", "Q", "K", "A"};

        //add format adding new cards
        for (String suit : suits) {
            for (String value : values) {
                cards.add(new Card(suit, value));
            }
        }
    }

    // add shuffle
    public void shuffle() {
        Collections.shuffle(cards);
    }

    //add deal
    public Card deal() {
        if (cards.size() > 0) {
            return cards.remove(0);
        }

        return null;
    }

    // add card size 
    public int getSize() {
        return cards.size();
    }
}
    
