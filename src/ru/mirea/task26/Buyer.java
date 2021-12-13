package ru.mirea.task26;

public class Buyer {
    private final ShoppingCart shoppingCart;
    private final BankAccount bankAccount;

    public Buyer(ShoppingCart shoppingCart, BankAccount bankAccount) {
        if (shoppingCart == null || bankAccount == null) {
            throw new IllegalArgumentException();
        }
        this.bankAccount = bankAccount;
        this.shoppingCart = shoppingCart;
    }

    public void addToCart(Product product) {
        shoppingCart.addToCart(product);
    }

    public void removeFromCart(int index) {
        shoppingCart.removeFromCart(index);
    }

    boolean buy() {
        return shoppingCart.buy(bankAccount);
    }

    void depositTheMoney(int amount) {
        bankAccount.depositTheMoney(amount);
    }
}
