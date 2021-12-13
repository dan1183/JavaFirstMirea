package ru.mirea.task10;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(foo(n) + "");
    }

    private static int foo(int n) {
        if (n / 10 == 0) {
            return n;
        }
        return foo(n / 10) + n % 10;
    }
}
