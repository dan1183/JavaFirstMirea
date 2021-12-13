package ru.mirea.task26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ShoppingCart implements Iterable {
    private ArrayList<Product> products;
    private PaymentMethod paymentMethod;

    public ShoppingCart() {
        products = new ArrayList<>();
        paymentMethod = null;
    }

    public boolean buy(BankAccount bankAccount) {
        if (paymentMethod == null) {
            throw new IllegalArgumentException("paymentMethod");
        }
        return paymentMethod.Pay(new BuyingInformation(products, bankAccount));
    }

    public void addToCart(Product product) {
        products.add(product);
    }

    public void removeFromCart(int index) {
        products.remove(index);
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
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
