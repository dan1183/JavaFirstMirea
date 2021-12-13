package ru.mirea.task6.second;

public abstract class SomethingBase implements IPriceable {
    protected int price;

    protected SomethingBase(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
