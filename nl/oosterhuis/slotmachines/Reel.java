package nl.oosterhuis.slotmachines;

import java.util.Random;

public class Reel {

    // instance variables
    private Symbol symbol;

    // constructor
    public Reel() {
        roll();
    }

    // methods
    public void roll() {
        Random random = new Random();
        int pick = random.nextInt(Symbol.values().length);
        Symbol symbol = Symbol.values()[pick];
        this.symbol = symbol;
    }

    public String render() {
        return symbol.toString();
        //return Character.toString(symbol.icon);
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
