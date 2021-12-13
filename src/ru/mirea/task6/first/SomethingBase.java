package ru.mirea.task6.first;

public abstract class SomethingBase implements INameable {
    protected String name;

    protected SomethingBase(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
