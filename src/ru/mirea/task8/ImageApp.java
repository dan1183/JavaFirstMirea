package ru.mirea.task8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Scanner;

public class ImageApp extends JFrame {
    public ImageApp() {
        super("Shapes");
        System.out.println("Enter the path to the image (src/ru/mirea/task8/12.png): ");
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        showImage(path);
        pack();
        setSize(1200, 1200);
        setVisible(true);
    }

    public void showImage(String path) {
        try {
            BufferedImage img = ImageIO.read(new File(path));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            add(label);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        var windows = new ImageApp();
    }
}