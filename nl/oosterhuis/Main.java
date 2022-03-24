package nl.oosterhuis;

import nl.oosterhuis.slotmachines.SlotMachineGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SlotMachineGame slotMachineGame = new SlotMachineGame(scanner);
        slotMachineGame.playGame();
    }
}