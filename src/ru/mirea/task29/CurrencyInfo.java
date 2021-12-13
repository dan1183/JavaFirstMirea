package ru.mirea.task29;

import java.io.Serializable;
import java.util.ArrayList;

public class CurrencyInfo implements Serializable {
    private String someString = "SomeString";
    private int someInt = 43;

    public CurrencyInfo() {
    }

    public CurrencyInfo(String someString, int someInt) {
        this.someString = someString;
        this.someInt = someInt;
    }
}
