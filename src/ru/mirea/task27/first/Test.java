package ru.mirea.task27.first;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, String> namesMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the second name:");
            String secondName = in.nextLine();
            System.out.println("Enter the name:");
            String name = in.nextLine();
            namesMap.remove(name);
            namesMap.put(name, secondName);
        }
        namesMap.forEach((String key, String value) -> {
            System.out.println(value + " " + key);
        });
    }
}
