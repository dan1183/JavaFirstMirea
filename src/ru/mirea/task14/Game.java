package ru.mirea.task14;

import ru.mirea.task14.decks.DequeueCardDeck;
import ru.mirea.task14.decks.DoubleListCardDeck;
import ru.mirea.task14.decks.QueueCardDeck;
import ru.mirea.task14.decks.StackCardDeck;

public class Game {
    Player firstPlayer;
    Player secondPlayer;

    public Game(int number, Card[] firstCards, Card[] secondCards) {
        if (firstCards == null || secondCards == null || firstCards.length != secondCards.length) {
            throw new IllegalArgumentException();
        }
        switch (number) {
            case 1 -> {
                firstPlayer = new Player(new StackCardDeck());
                secondPlayer = new Player(new StackCardDeck());
            }
            case 3 -> {
                firstPlayer = new Player(new DequeueCardDeck());
                secondPlayer = new Player(new DequeueCardDeck());
            }
            case 4 -> {
                firstPlayer = new Player(new DoubleListCardDeck());
                secondPlayer = new Player(new DoubleListCardDeck());
            }
            default -> {
                firstPlayer = new Player(new QueueCardDeck());
                secondPlayer = new Player(new QueueCardDeck());
            }
        }
        for (var item : firstCards) {
            firstPlayer.push(item);
        }
        for (var item : secondCards) {
            secondPlayer.push(item);
        }
    }

    boolean tick() {
        if (firstPlayer.empty() || secondPlayer.empty()) {
            return false;
        }
        Card first = firstPlayer.pop();
        Card second = secondPlayer.pop();

        if (first.getForce() == 0) {
            if (second.getForce() == 9) {
                firstPlayer.push(first);
                firstPlayer.push(second);
                return true;
            }
        }

        if (second.getForce() == 0) {
            if (first.getForce() == 9) {
                secondPlayer.push(first);
                secondPlayer.push(second);
                return true;
            }
        }

        if (first.getForce() < second.getForce()) {
            secondPlayer.push(first);
            secondPlayer.push(second);
        } else {
            firstPlayer.push(first);
            firstPlayer.push(second);
        }

        return true;
    }

    String whoWin() {
        if ((firstPlayer.empty() && secondPlayer.empty()) ||
                (!firstPlayer.empty() && !secondPlayer.empty())) {
            return "botva";
        } else if (firstPlayer.empty()) {
            return "second";
        } else {
            return "first";
        }
    }
}
