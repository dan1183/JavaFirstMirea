package ru.mirea.task6.first;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<INameable> list = new ArrayList<>();
        list.add(new SomethingFirst("first"));
        list.add(new SomethingSecond("second"));

        for (var item : list) {
            System.out.println(item.getName());
        }
    }
}
