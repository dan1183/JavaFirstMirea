package ru.mirea.task30;

import java.util.Objects;

public class Vector2 {
    private int x;
    private int y;

    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vector2(Vector2 other) {
        this.x = other.x;
        this.y = other.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Vector2 minus(Vector2 other) {
        Vector2 newVec = new Vector2(this);
        newVec.x -= other.x;
        newVec.y -= other.y;
        return newVec;
    }

    public Vector2 plus(Vector2 other) {
        Vector2 newVec = new Vector2(this);
        newVec.x += other.x;
        newVec.y += other.y;
        return newVec;
    }

    public Vector2 multiple(Vector2 other) {
        Vector2 newVec = new Vector2(this);
        newVec.x *= other.x;
        newVec.y *= other.y;
        return newVec;
    }

    public Vector2 division(Vector2 other) {
        Vector2 newVec = new Vector2(this);
        newVec.x /= other.x;
        newVec.y /= other.y;
        return newVec;
    }

    public Vector2 moveX(int x) {
        Vector2 newVec = new Vector2(this);
        newVec.x += x;
        return newVec;
    }

    public Vector2 moveY(int y) {
        Vector2 newVec = new Vector2(this);
        newVec.y += y;
        return newVec;
    }

    public Vector2 moveXY(int x, int y) {
        Vector2 newVec = new Vector2(this);
        newVec.x += x;
        newVec.y += y;
        return newVec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector2 vector2 = (Vector2) o;
        return x == vector2.x && y == vector2.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}