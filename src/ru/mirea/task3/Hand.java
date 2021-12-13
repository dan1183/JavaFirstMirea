package ru.mirea.task3;

public final class Hand {
    private int force;

    public Hand() {
        this.force = 50;
    }

    public Hand(int force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "force=" + force +
                '}';
    }
}
