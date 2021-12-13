package ru.mirea.task3;

import java.util.Scanner;

public class HumanTest {
    public static void main(String[] args) {
        HumanTest humanTest = new HumanTest();

        Human human = humanTest.createHuman();
        System.out.println(human);
    }

    private Human createHuman() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of iq points:");
        int iq = in.nextInt();

        System.out.println("Enter value of left hand force:");
        int leftHandForce = in.nextInt();
        System.out.println("Enter value of right hand force:");
        int rightHandForce = in.nextInt();

        System.out.println("Enter value of left leg force:");
        int leftLegForce = in.nextInt();
        System.out.println("Enter value of right leg force:");
        int rightLegForce = in.nextInt();

        Human human = new Human();
        human.setHead(new Head(iq));

        human.setLeftHand(new Hand(leftHandForce));
        human.setRightHand(new Hand(rightHandForce));

        human.setLeftLeg(new Leg(leftLegForce));
        human.setRightLeg(new Leg(rightLegForce));
        in.close();
        return human;
    }
}
