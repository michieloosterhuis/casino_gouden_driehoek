package nl.oosterhuis;
import nl.oosterhuis.slotmachines.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SlotMachine slotMachine = new FiveReeler();

        List<Reel> reels = new ArrayList<>();
        reels.add(new Reel());
        reels.add(new Reel());
        reels.add(new Reel());
        ReelDeck reelDeck = new ReelDeck(reels);
        System.out.println(reelDeck.render());
    }
}