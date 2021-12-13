package ru.mirea.task14.decks;

import ru.mirea.task14.Card;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueCardDeck implements CardDeck {
    private final Deque<Card> deque = new ArrayDeque<>();

    @Override
    public Card pop() {
        return deque.pollLast();
    }

    @Override
    public void push(Card card) {
        deque.push(card);
    }

    @Override
    public int size() {
        return deque.size();
    }

    @Override
    public boolean empty() {
        return deque.isEmpty();
    }
}
