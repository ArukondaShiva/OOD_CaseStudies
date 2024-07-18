package org.example.cardhanddeckdealerplayerimpl;

import org.example.enumerationimpl.Rank;
import org.example.enumerationimpl.Suit;

public class Card {

    Rank rank;
    Suit suit;

    public Card(Suit suit, Rank rank){
        this.rank = rank;
        this.suit = suit;
    }

    public int getValue(){
        return this.rank.value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }

}