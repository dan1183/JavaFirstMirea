package ru.mirea.task6.second;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<IPriceable> list = new ArrayList<>();
        list.add(new SomethingFirst(1));
        list.add(new SomethingSecond(2));

        for (var item : list) {
            System.out.println(item.getPrice());
        }
    }
}
