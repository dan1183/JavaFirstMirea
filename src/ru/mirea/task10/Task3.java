package ru.mirea.task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        List<Integer> res = foo(a, b);
        for (var item : res) {
            System.out.println(item);
        }
    }

    private static List<Integer> foo(int a, int b) {
        List<Integer> res = new ArrayList<>();
        if (a < b) {
            foo(res, a, b);
        } else {
            fooR(res, a, b);
        }
        return res;
    }

    private static void foo(List<Integer> listOfResults, int a, int b) {
        if (a > b) {
            return;
        }
        listOfResults.add(a);
        foo(listOfResults, a + 1, b);
    }

    private static void fooR(List<Integer> listOfResults, int a, int b) {
        if (a < b) {
            return;
        }
        listOfResults.add(a);
        fooR(listOfResults, a - 1, b);
    }
}
