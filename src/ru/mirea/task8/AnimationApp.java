package ru.mirea.task8;

import javax.swing.*;
import java.util.Objects;

public class AnimationApp extends JFrame {
    private final JLabel frame;
    private int frameNum = 0;

    private AnimationApp() {
        setSize(1200, 1200);
        frame = new JLabel("", new ImageIcon(
                Objects.requireNonNull(getClass().getResource((++frameNum) + ".png"))),
                SwingConstants.CENTER);
        getContentPane().add(frame);
        Timer timer = new Timer(500, e -> tick());
        timer.start();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void tick() {
        frame.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource((++frameNum) + ".png"))));
        frameNum = frameNum % 12;
    }

    public static void main(String[] args) {
        AnimationApp app = new AnimationApp();
    }
}