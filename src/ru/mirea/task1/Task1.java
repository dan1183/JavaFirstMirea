package ru.mirea.task1;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

    }

    // 3
    private static int sumFor(int[] data) {
        int result = 0;
        for (int i = 0; i < data.length; i++) {
            result += data[i];
        }
        return result;
    }

    private static int sumWhile(int[] data) {
        int result = 0;
        int index = 0;

        while (index < data.length) {
            result += data[index++];
        }
        return result;
    }

    private static int sumDoWhile(int[] data) {
        int result = 0;
        int index = 0;
        if (data.length == 0) {
            return result;
        }
        do {
            result += data[index++];
        } while (index < data.length);
        return result;
    }

    // 4
    private static void printArgs(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    // 5
    private static void harmonicSeries(int n) {
        for (int i = 1; i < n + 1; i++) {
            System.out.println(1. / i);
        }
    }

    // 6
    private static void print(int[] data) {
        for (var item : data) {
            System.out.println(item);
        }
    }

    private static int[] randomArray(int len) {
        int[] result = new int[len];
        for (int i = 0; i < len; ++i) {
            result[i] = (int) Math.random();
        }
        return result;
    }

    private static int[] randomArray(int len, Random random) {
        int[] result = new int[len];
        for (int i = 0; i < len; ++i) {
            result[i] = random.nextInt();
        }
        return result;
    }

    private static void doRandomArrayByMath(int len) {
        int[] data = randomArray(len);
        print(data);
        Arrays.sort(data);
        print(data);
    }

    private static void doRandomArrayByRandom(int len) {
        Random rand = new Random();
        int[] data = randomArray(len, rand);
        print(data);
        Arrays.sort(data);
        print(data);
    }

    //7
    private static int factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; ++i) {
            result *= i;
        }
        return result;
    }
}
