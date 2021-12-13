package ru.mirea.task22;

public class VictorianChairFabric implements ChairFabric {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
