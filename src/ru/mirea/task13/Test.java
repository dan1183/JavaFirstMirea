package ru.mirea.task13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }

        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list2.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(list2.get(i));
        }

        MyArrayList<Integer> list3 = new MyArrayList<>();
        for (int i = 0; i < 10; i++) {
            list3.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(list3.get(i));
        }
    }
}
