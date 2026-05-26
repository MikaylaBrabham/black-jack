package com.pluralsight;

public class Card {
    //add properties
    private String suit;
    private String value;
    private boolean isFaceUp;


    //add constructor

    public Card(String suit, String value, boolean isFaceUp) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }


    //add getters

    public String getSuit() {
        if (isFaceUp) {
            return suit;
        }
        return "#";
    }

    public String getValue() {
        if (isFaceUp) {
            return value;
        }
        return "#";
    }

    //add pointvalue system
    public int getPointValue() {
        if (!isFaceUp) {
            return 0;
        }
        if (value.equals("A")) {
            return 11;
        }
        if (value.equals("K") || value.equals("Q") || value.equals("J")) {
            return 10;
        }
        return Integer.parseInt(value);
    }

    //add flip

    public boolean isFaceUp() {
        return isFaceUp;
    }


    //add derived get suit
}
