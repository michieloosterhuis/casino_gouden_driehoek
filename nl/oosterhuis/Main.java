package nl.oosterhuis;

import nl.oosterhuis.hangman.HangmanGame;
import nl.oosterhuis.slotmachines.SlotMachineGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HangmanGame hangmanGame = new HangmanGame(scanner);
        hangmanGame.playGame();
    }
}