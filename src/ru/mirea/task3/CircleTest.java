package ru.mirea.task3;

import java.util.Scanner;

public final class CircleTest {
    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        Circle circle = circleTest.createCircle();
        System.out.println(circle);
    }

    private Circle createCircle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = in.nextDouble();
        in.close();
        return new Circle(radius);
    }
}
