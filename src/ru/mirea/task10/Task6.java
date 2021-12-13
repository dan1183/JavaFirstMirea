package ru.mirea.task10;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(foo(n, 2) + "");
    }

    public static boolean foo(int n, int i) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % i == 0) {
            return false;
        } else if (i < n / 2) {
            return foo(n, i + 1);
        } else {
            return true;
        }
    }
}
