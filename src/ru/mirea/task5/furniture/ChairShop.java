package ru.mirea.task5.furniture;

public class ChairShop extends Shop {
    @Override
    public Furniture buy() {
        return new Chair();
    }
}
