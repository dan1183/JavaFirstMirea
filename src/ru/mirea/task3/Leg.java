package ru.mirea.task3;

public final class Leg {
    private int force;

    public Leg() {
        this.force = 50;
    }

    public Leg(int force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "force=" + force +
                '}';
    }
}
