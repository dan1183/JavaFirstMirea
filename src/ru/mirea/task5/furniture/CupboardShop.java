package ru.mirea.task5.furniture;

public class CupboardShop extends Shop {

    @Override
    public Furniture buy() {
        return new Cupboard();
    }
}
