package ru.mirea.task14;

import ru.mirea.task14.decks.CardDeck;

public class Player {
    private final CardDeck deck;

    public Player(CardDeck deck) {
        this.deck = deck;
    }

    public Card pop() {
        return deck.pop();
    }

    public void push(Card card) {
        deck.push(card);
    }

    public boolean empty() {
        return deck.empty();
    }
}
