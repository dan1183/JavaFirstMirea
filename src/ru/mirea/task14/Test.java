package ru.mirea.task14;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        try {
            int ticks = 0;
            Game game = createGame();
            for (ticks = 0; ticks <= 106; ticks++) {
                if (!game.tick()) {
                    break;
                }
            }
            System.out.println(game.whoWin() + " " + ticks);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static Game createGame() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter task number (1 - 4): ");
        int number = Integer.valueOf(in.nextLine());

        System.out.println("Enter the cards of the first player: ");
        String first = in.nextLine();

        System.out.println("Enter the cards of the second player: ");
        String second = in.nextLine();

        String[] firstInputString = first.split(" ");
        String[] secondInputString = second.split(" ");

        if (firstInputString.length != 5 || secondInputString.length != 5) {
            throw new IllegalArgumentException();
        }

        Card[] firstCards = new Card[firstInputString.length];
        Card[] secondCards = new Card[secondInputString.length];

        int index = 0;
        for (var item :
                firstInputString) {
            int forceOfCard = Integer.parseInt(item);
            if (forceOfCard < 0 || forceOfCard > 9) {
                throw new IllegalArgumentException();
            }
            firstCards[index++] = new Card(forceOfCard);
        }

        index = 0;
        for (var item :
                secondInputString) {
            int forceOfCard = Integer.parseInt(item);
            if (forceOfCard < 0 || forceOfCard > 9) {
                throw new IllegalArgumentException();
            }
            secondCards[index++] = new Card(forceOfCard);
        }

        return new Game(number, firstCards, secondCards);
    }
}
