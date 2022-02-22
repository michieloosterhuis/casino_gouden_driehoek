package nl.oosterhuis;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private ArrayList<Card> cards;
    private int totalValue;

    public Hand() {
        cards = new ArrayList<>();
        totalValue = 0;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getTotalValue() {
        totalValue = 0;
        for (Card card : cards) {
            totalValue += card.getValue();
        }
        return totalValue;
    }

    public void render() {
        cards.forEach(card -> System.out.println(card.render()));
    }
}
