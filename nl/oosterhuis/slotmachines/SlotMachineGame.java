package nl.oosterhuis.slotmachines;

import java.util.Scanner;

public class SlotMachineGame {
    private final Scanner inputScanner;

    public SlotMachineGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void playGame() {
        int numberOfTokens = 100;
        System.out.println("\n$$$ Hartelijk welkom in Casino De Gouden Driehoek! $$$");

        SlotMachine pennyMachine = new Penny();
        SlotMachine highRollerMachine = new HighRoller();
        SlotMachine fiveReelerMachine = new FiveReeler();

        boolean isPlaying = true;
        while (isPlaying) {

            System.out.println("\nJe hebt " + numberOfTokens + " tokens");

            // select a slotmachine
            SlotMachine currentSlotMachine = null;
            while (currentSlotMachine == null) {

                System.out.println("\nKies één van de volgende fruitautomaten:");
                System.out.println("1) Penny      (1 token)");
                System.out.println("2) HighRoller (10 tokens)");
                System.out.println("3) FiveReeler (5 tokens)");

                String machineType = inputScanner.nextLine();

                switch (machineType) {
                    case "1":
                        if (pennyMachine.getRollPrice() <= numberOfTokens) {
                            currentSlotMachine = pennyMachine;
                        } else {
                            System.out.println("\nJe hebt niet voldoende tokens voor deze fruitautomaat.");
                        }
                        break;
                    case "2":
                        if (highRollerMachine.getRollPrice() <= numberOfTokens) {
                            currentSlotMachine = highRollerMachine;
                        } else {
                            System.out.println("\nJe hebt niet voldoende tokens voor deze fruitautomaat.");
                        }
                        break;
                    case "3":
                        if (fiveReelerMachine.getRollPrice() <= numberOfTokens) {
                            currentSlotMachine = fiveReelerMachine;
                        } else {
                            System.out.println("\nJe hebt niet voldoende tokens voor deze fruitautomaat.");
                        }
                        break;
                    default:
                        System.out.println("\nOngeldige invoer.");
                }
            }

            // game loop for a slotmachine
            int rounds = 0;
            boolean continuePlayingThisGame = true;
            while (continuePlayingThisGame) {
                if (rounds == 0) currentSlotMachine.renderIntro();
                rounds += 1;
                numberOfTokens -= currentSlotMachine.getRollPrice();
                System.out.println("\nJe hebt " + numberOfTokens + " tokens");
                currentSlotMachine.roll();
                System.out.println(currentSlotMachine.render());
                int tokensWon = currentSlotMachine.calculatePayout();
                numberOfTokens += tokensWon;
                if (tokensWon > 0) {
                    System.out.println("Gefeliciteerd!!! Je hebt " + tokensWon + " tokens gewonnen!");
                } else {
                    System.out.println("Helaas, je hebt niets gewonnen...");
                }

                if (numberOfTokens < currentSlotMachine.getRollPrice()) {
                    System.out.println("\nJe hebt onvoldoende tokens om door te spelen op deze fruitautomaat.");
                    continuePlayingThisGame = false;
                } else {
                    System.out.println("\nWil je blijven doorspelen op deze fruitautomaat? [y/n] ");
                    String choice = inputScanner.nextLine();
                    if (choice.equals("n")) {
                        continuePlayingThisGame = false;

                        System.out.println("\nWil je in het Casino blijven? [y/n] ");
                        choice = inputScanner.nextLine();
                        if (choice.equals("n")) {
                            isPlaying = false;
                        }
                    }
                }
            }
        }
    }
}