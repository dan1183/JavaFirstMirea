package ru.mirea.task14.decks;

import ru.mirea.task14.Card;

import java.util.Stack;

public class StackCardDeck implements CardDeck {
    private Stack<Card> stack = new Stack<>();

    @Override
    public Card pop() {
        return stack.pop();
    }

    @Override
    public void push(Card card) {
        Stack<Card> newStack = new Stack<>();
        newStack.push(card);
        for (var item :
                stack) {
            newStack.push(item);
        }
        stack = newStack;
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean empty() {
        return stack.isEmpty();
    }
}
