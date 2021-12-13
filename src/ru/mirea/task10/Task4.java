package ru.mirea.task10;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int s = in.nextInt();
        System.out.println(foo(k, s, 0, 0) + "");
    }

    private static int foo(int k, int s, int sum, int len) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int result = 0;
        if (len == 0) {
            for (int i = 1; i < 10; ++i) {
                result += foo(k, s, sum + i, len + 1);
            }
        } else {
            for (int i = 1; i < 10; ++i) {
                result += foo(k, s, sum + i, len + 1);
            }
        }
        return result;
    }
}
