package ru.mirea.task22;

public class MagicChairFabric implements ChairFabric {

    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}
