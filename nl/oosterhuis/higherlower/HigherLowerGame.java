package nl.oosterhuis.higherlower;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerGame {
    private Scanner inputScanner;

    private boolean gameIsRunning;

    private int numberToGuess;
    private int numberOfTurns;

    public HigherLowerGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void playGame() {
        gameIsRunning = true;
        numberToGuess = new Random().nextInt(10);
        numberOfTurns = 0;

        System.out.println("Guess a number between 0 and 10");

        while (gameIsRunning) {
            System.out.println("Make a guess");

            var val = inputScanner.nextInt();
            performGuess(val);
        }
    }

    private void performGuess(int guess) {
        numberOfTurns++;

        if (guess == numberToGuess) {
            gameIsRunning = false;
            System.out.printf("Correct! you guessed the number in %d turns\n", numberOfTurns);
        } else if (guess > numberToGuess) {
            System.out.println("That number is too high");
        } else {
            System.out.println("That number is too low");
        }
    }
}