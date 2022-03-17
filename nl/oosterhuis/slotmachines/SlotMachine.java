package nl.oosterhuis.slotmachines;

import java.util.ArrayList;

public abstract class SlotMachine {

    // instance variables
    private int numberOfReels;
    private String name;
    private ReelDeck reelDeck;

    // constructor
    public SlotMachine(int numberOfReels, String name) {
        this.numberOfReels = numberOfReels;
        this.name = name;
        ArrayList<Reel> reels = new ArrayList<>();
        for (int i = 0; i < numberOfReels; i++) {
            reels.add(new Reel());
        }
        this.reelDeck = new ReelDeck(reels);
    }

    // methods
    public void renderIntro() {
        System.out.println("Hartelijk welkom in Casino De Gouden Driehoek! Je speelt op de: " + name);
    }

    public int roll() {
        System.out.println("Je hebt aan de hendel getrokken.");
        return 0;
    }

    public String render() {
        System.out.println("De uitslag is bekend.");
        return "";
    }

    public abstract int getRollPrice();

    public abstract int calculatePayout();

    public abstract String renderWinningConditions();

}
