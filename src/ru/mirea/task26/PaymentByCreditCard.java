package ru.mirea.task26;

public class PaymentByCreditCard implements PaymentMethod {
    @Override
    public boolean Pay(BuyingInformation info) {
        boolean result = info.getBankAccount().writeOffTheMoney(info.getAllPrice());
        //Do something
        return result;
    }
}
