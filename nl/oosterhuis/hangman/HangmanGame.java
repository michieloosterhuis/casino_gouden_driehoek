package nl.oosterhuis.hangman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {

    Scanner inputScanner;
    String[] words = new String[] {"palmboom", "banaan"};

    public HangmanGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void playGame() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        ArrayList<String> letters = new ArrayList<>();
        System.out.println("\nWelkom bij het spel Hangman.");
        String word = words[new Random().nextInt(words.length)];
        System.out.println("(het woord is: " + word + " ;-)");
        String wordWithGuessedLetters = "*".repeat(word.length());
        boolean wordIsGuessed = false;

        int round = 1;
        while (round <= 8 && !wordIsGuessed) {
            System.out.println("\nRonde " + round);

            String currentLetter = "";

            while (currentLetter.length() != 1 || !alphabet.contains(currentLetter) || letters.contains(currentLetter)) {
                System.out.println("Vul een letter in: ");
                currentLetter = inputScanner.nextLine();
            }

            letters.add(currentLetter);

            if (currentLetter.contains(currentLetter)) {
                StringBuilder stringBuilder = new StringBuilder(wordWithGuessedLetters);
                for (int index = word.indexOf(currentLetter); index >= 0; index = word.indexOf(currentLetter, index + 1)) {
                    stringBuilder.replace(index, index + 1, currentLetter);
                }
                wordWithGuessedLetters = stringBuilder.toString();
            }

            System.out.println(wordWithGuessedLetters);

            if (!wordWithGuessedLetters.contains("*")) {
                wordIsGuessed = true;
            } else {
                System.out.println("Weet je het woord al?");
                String guess = inputScanner.nextLine();
                if (guess.equals(word)) {
                    wordIsGuessed = true;
                } else {
                    round += 1;
                }
            }
        }

        if (wordIsGuessed) {
            System.out.println("\nGefeliciteerd! Je hebt het woord geraden in ronde " + round);
        } else {
            System.out.println("\nHelaas, je hebt verloren...");
        }

        System.out.println("Wil je het nog eens proberen? [y/n]");
        String answer = inputScanner.nextLine();
        if (answer.equals("y")) {
            playGame();
        } else {
            System.out.println("Je hebt het spel verlaten.");
        }
    }
}
