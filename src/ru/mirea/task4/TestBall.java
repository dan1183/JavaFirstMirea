package ru.mirea.task4;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        TestBall test = new TestBall();
        Ball ball = test.createBall();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x coord to move: ");
        double x = in.nextDouble();
        System.out.println("Enter y coord to move: ");
        double y = in.nextDouble();

        ball.move(x,y);
        System.out.println(ball);
    }

    private Ball createBall() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x coord of ball: ");
        double x = in.nextDouble();
        System.out.println("Enter y coord of ball: ");
        double y = in.nextDouble();
        return new Ball(x, y);
    }
}
