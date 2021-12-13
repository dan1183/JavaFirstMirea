package ru.mirea.task9;

import javax.swing.*;

public class FootballGUI extends JFrame {
    private JPanel mainPanel;
    private JButton button1;
    private JButton button2;
    private JPanel ButtonPanel;
    private JPanel OutputPanel;
    private JLabel LastScore;
    private JLabel Winner;
    private JLabel Result;

    private int score1;
    private int score2;

    public FootballGUI() {
        setContentPane(mainPanel);
        setSize(430, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        button1.addActionListener(e -> {
            score1++;
            update("Milan");
        });
        button2.addActionListener(e -> {
            score2++;
            update("Madrid");
        });
    }

    public void update(String last) {
        Result.setText("Result: " + score1 + "X" + score2);
        String winner = "DRAW";
        if (score1 > score2) {
            winner = "Milan";
        }
        if (score1 < score2) {
            winner = "Madrid";
        }
        Winner.setText("Winner: " + winner);
        LastScore.setText("“Last Scorer: " + last);
    }

    public static void main(String[] args) {
        var window = new FootballGUI();
    }
}
