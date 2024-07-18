package org.example.cardhanddeckdealerplayerimpl;

import org.example.enumerationimpl.Rank;
import org.example.enumerationimpl.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    public ArrayList<Card> cards;
    int nextCardIndex;


    public Deck(){
        this.cards = new ArrayList<>();
        nextCardIndex = 0;
        createDeck();
    }

    private void createDeck(){

        for(Suit s : Suit.values()){
            for(Rank r : Rank.values()){
                Card c = new Card(s,r);
                cards.add(c);
            }
        }

    }


    public void shuffle(){
        Collections.shuffle(cards);
        nextCardIndex = 0;
    }

    public Card getCard(){
        return cards.get(nextCardIndex++);
    }

    public List<Card> getCards(int n){
        List<Card> subList = cards.subList(nextCardIndex,nextCardIndex+n);
        nextCardIndex+=n;
        return subList;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                ", nextCardIndex=" + nextCardIndex +
                '}';
    }

}
