package ru.mirea.task18;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of users: ");
        int numberOfUsers = in.nextInt();

        try {
            Shop shop = createShop(numberOfUsers);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static Shop createShop(int numberOfUsers) {
        Scanner in = new Scanner(System.in);
        Shop shop = new Shop();

        for (int i = 0; i < numberOfUsers; i++) {
            String inn = in.nextLine();
            String fullName = in.nextLine();
            User user = new User(inn, fullName);
            shop.add(user);
        }

        return shop;
    }
}
