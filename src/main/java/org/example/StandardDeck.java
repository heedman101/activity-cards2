package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StandardDeck implements Deck {
    
    private List<Card> cards;
    
    public StandardDeck() {
        this.cards = newDeck();
    }

    private List<Card> newDeck() {
        List<Card> newDeck = new ArrayList<>();
        Arrays.stream(Suit.values()).forEach(suit -> {


            Arrays.stream(FaceValue.values()).map(faceValue -> new Card(suit, faceValue)).forEach(NewDeck::add);
        }
        });


    @Override
    public void shuffle() {

    }

    @Override
    public void cut(int index) {

    }

    @Override
    public Card deal() {
        return null;
    }

    @Override
    public int search(Card Card) {
        return 0;
    }

    @Override
    public void newOrder(Deck cards) {

    }

    @Override
    public int size() {
        return 0;
    }
}
