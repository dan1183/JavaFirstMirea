package ru.mirea.task26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class BuyingInformation implements Iterable {
    private BankAccount bankAccount;
    private final List<Product> products;

    public BuyingInformation(List<Product> products, BankAccount bankAccount) {
        if (products == null || bankAccount == null) {
            throw new IllegalArgumentException();
        }
        this.products = new ArrayList<>(products);
        this.bankAccount = bankAccount;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getAllPrice() {
        int result = 0;
        for (var item : products) {
            result += item.getPrice();
        }
        return result;
    }

    @Override
    public Iterator iterator() {
        return products.iterator();
    }

    @Override
    public void forEach(Consumer action) {
        products.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return products.spliterator();
    }
}
