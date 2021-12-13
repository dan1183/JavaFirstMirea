package ru.mirea.task5.furniture;

public class TableShop extends Shop {
    @Override
    public Furniture buy() {
        return new Table();
    }
}
