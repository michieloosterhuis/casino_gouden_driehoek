package nl.oosterhuis;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;
    private final CardSuit[] cardSuits;
    private final CardValue[] cardValues;

    public Deck () {
        this.cards = new ArrayList<>();

        this.cardSuits = new CardSuit[] {
                new CardSuit("diamonds", '\u2666', "red"),
                new CardSuit("spades", '\u2660', "black"),
                new CardSuit("hearts", '\u2665', "red"),
                new CardSuit("clubs", '\u2663', "black")
        };

        this.cardValues = new CardValue[] {
                new CardValue("two", 2),
                new CardValue("three", 3),
                new CardValue("four", 4),
                new CardValue("five", 5),
                new CardValue("six", 6),
                new CardValue("seven", 7),
                new CardValue("eight", 8),
                new CardValue("nine", 9),
                new CardValue("ten", 10),
                new CardValue("jack", 10),
                new CardValue("queen", 10),
                new CardValue("king", 10)
        };

        initialize();
        shuffle();
    }

    public void initialize() {
        cards.clear();
        for (CardSuit cardSuit : cardSuits) {
            for (CardValue cardValue : cardValues) {
                cards.add(new Card(cardSuit, cardValue));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public Card getNextCard() {
        Card card = cards.get(0);
        cards.remove(0);
        return card;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
}
