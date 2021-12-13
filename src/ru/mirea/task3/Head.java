package ru.mirea.task3;

public final class Head {
    private int IQ;

    public Head() {
        IQ = 100;
    }

    public Head(int IQ) {
        this.IQ = IQ;
    }

    @Override
    public String toString() {
        return "Head{" +
                "IQ=" + IQ +
                '}';
    }
}
