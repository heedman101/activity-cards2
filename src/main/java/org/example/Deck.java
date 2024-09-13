package org.example;

public interface Deck {

    void shuffle();
    void cut(int index);
    Card deal();
    int search(Card Card);
    void newOrder(Deck cards);
    int size();
}
