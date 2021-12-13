package ru.mirea.task2;

import java.util.Scanner;

public class TestDog {

    public void run() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of dogs:");
        int numberOfDogs = in.nextInt();
        Dog[] dogs = new Dog[numberOfDogs];
        for (int i = 0; i < numberOfDogs; i++) {
            System.out.println("Dog #" + i + ":");
            dogs[i] = createDog();
        }

        System.out.println("Dogs:");
        for (int i = 0; i < numberOfDogs; i++) {
            System.out.println(dogs[i]);
        }
    }

    private Dog createDog() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter dog name:");
        String name = in.nextLine();
        System.out.println("Enter dog age:");
        int age = in.nextInt();
        in.close();
        return new Dog(name, age);
    }
}
