package ru.mirea.task26;

public class BankAccount {
    private int money;

    public BankAccount() {
        this.money = 0;
    }

    public boolean writeOffTheMoney(int amount) {
        if (money - amount < 0) {
            return false;
        } else {
            money -= amount;
            return true;
        }
    }

    public void depositTheMoney(int amount) {
        money += amount;
    }
}
