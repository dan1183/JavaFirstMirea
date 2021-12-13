package ru.mirea.task14.decks;

import ru.mirea.task14.Card;

public interface CardDeck {
    Card pop();

    void push(Card card);

    int size();

    boolean empty();
}
