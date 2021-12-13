package ru.mirea.task24;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ip = in.nextLine();
        System.out.println(IPHelper.isValid(ip));
    }
}
