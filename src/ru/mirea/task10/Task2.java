package ru.mirea.task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> res = foo(n);
        for (var item : res) {
            System.out.println(item);
        }
    }

    private static List<Integer> foo(int n) {
        List<Integer> res = new ArrayList<>();
        foo(res, 1, n);
        return res;
    }

    private static void foo(List<Integer> listOfResults, int current, int n) {
        if (current > n) {
            return;
        }
        listOfResults.add(current);
        foo(listOfResults, current + 1, n);
    }
}
