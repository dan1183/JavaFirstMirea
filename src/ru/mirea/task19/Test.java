package ru.mirea.task19;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        try {
            RectangularTriangle triangle = new RectangularTriangle(a, b, c);
        } catch (TriangleBadAnglesException exception) {
            System.out.println(exception.toString());
        }
    }
}
