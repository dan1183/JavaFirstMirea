package ru.mirea.task3;

public final class Human {
    private Head head;
    private Hand leftHand;
    private Hand rightHand;
    private Leg leftLeg;
    private Leg rightLeg;

    public Human() {
        this.head = new Head();
        this.leftHand = new Hand();
        this.rightHand = new Hand();
        this.leftLeg = new Leg();
        this.rightLeg = new Leg();
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
    }

    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    public Head getHead() {
        return head;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", leftHand=" + leftHand +
                ", rightHand=" + rightHand +
                ", leftLeg=" + leftLeg +
                ", rightLeg=" + rightLeg +
                '}';
    }
}
