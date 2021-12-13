package ru.mirea.task2;

import java.util.Scanner;

public class TestShape {
    public void run() {
        Shape shape = createShape();
        System.out.println(shape);
    }

    private Shape createShape() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of points:");
        int numberOfPoints = in.nextInt();

        IntVector2[] points = new IntVector2[numberOfPoints];

        for (int i = 0; i < numberOfPoints; i++) {
            int x = 0;
            int y = 0;

            System.out.println("Enter the X coordinate of point #" + i );
            System.out.println("Enter the Y coordinate of point #" + i );
            points[i] = new IntVector2(x, y);
        }
        in.close();
        return new Shape(points);
    }
}
