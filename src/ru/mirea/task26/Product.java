package ru.mirea.task26;

public final class Product {
    private final int price;
    private final String name;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product(Product product) {
        this.name = product.name;
        this.price = product.price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Product clone() {
        return new Product(this);
    }
}
