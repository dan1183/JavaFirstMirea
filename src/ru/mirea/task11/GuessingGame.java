package ru.mirea.task11;

import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame extends JFrame {

    private JPanel mainPanel;
    private JButton button1;
    private JTextField textField1;
    private JLabel textLabel;
    private int secretNum;
    private int attempt;

    public GuessingGame() {
        setContentPane(mainPanel);
        setSize(430, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        play();
    }

    public void play(){
        reset();
        button1.addActionListener(e -> {
            String s = textField1.getText();
            inputCheck(Integer.parseInt(s));
            if(attempt == 3){
                gameOver();
            }
        });
    }

    public void reset(){
        setSecretNum(0, 20);
        System.out.println(getSecretNum());
        textLabel.setText("Угадай число");
        attempt = 0;
    }

    public void gameOver(){
        textLabel.setText("Игра окончена! ответ был " + secretNum);
    }

    private void inputCheck(int input){
        if (input > secretNum){
            textLabel.setText("Слишком большое");
            attempt++;
        }
        else if (input < secretNum){
            textLabel.setText("Слишком маленькое");
            attempt++;
        }
        else {
            textLabel.setText("В точку! Поздравляю с победой!");
        }
    }

    public void setSecretNum(int min, int max) {
        this.secretNum = ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public int getSecretNum() {
        return secretNum;
    }

    public static void main(String[] args) {
        var window = new GuessingGame();
    }
}
