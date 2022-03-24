package nl.oosterhuis.slotmachines;

import java.util.Random;

public class Reel {

    // instance variables
    private Symbol symbol;

    // constructor
    public Reel() {
        roll();
    }

    // getters
    public Symbol getSymbol() {
        return symbol;
    }

    // methods
    public void roll() {
        Random random = new Random();
        int pick = random.nextInt(Symbol.values().length);
        this.symbol = Symbol.values()[pick];
    }

    public String render() {
        return Character.toString(symbol.icon);
    }
}
