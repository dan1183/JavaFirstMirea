package ru.mirea.task8;

import ru.mirea.task8.shapes.Circle;
import ru.mirea.task8.shapes.Rectangle;
import ru.mirea.task8.shapes.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class ShapesApp extends JFrame {
    public ShapesApp() {
        super("Shapes");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(640, 480);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        ArrayList<Shape> shapes = new ArrayList<Shape>();

        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int randInt = 1 + r.nextInt(2);
            if (randInt == 1) {
                Rectangle rectangle = new Rectangle();
                shapes.add(rectangle);
            } else {
                Circle circleGUI = new Circle();
                shapes.add(circleGUI);
            }
        }

        for (var shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        var window = new ShapesApp();
    }
}