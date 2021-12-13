package ru.mirea.task2;

public final class IntVector2 {
    private int x;
    private int y;

    public IntVector2() {
        this.x = 0;
        this.y = 0;
    }

    public IntVector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public IntVector2(IntVector2 other) {
        this.x = other.x;
        this.y = other.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "IntVector2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
