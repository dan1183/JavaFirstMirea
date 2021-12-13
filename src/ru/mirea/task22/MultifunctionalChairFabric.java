package ru.mirea.task22;

public class MultifunctionalChairFabric implements ChairFabric {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}
