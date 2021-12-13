package ru.mirea.task30;

import org.junit.Assert;
import org.junit.Test;


public class TestApp {
    @Test
    public void minus() {
        Vector2 vecA = new Vector2(0, 0);
        Vector2 vecB = new Vector2(1, 1);

        Vector2 vecC = vecA.minus(vecB);
        Vector2 result = new Vector2(-1, -1);
        Assert.assertEquals(vecC, result);
    }

    @Test
    public void plus() {
        Vector2 vecA = new Vector2(0, 0);
        Vector2 vecB = new Vector2(1, 1);

        Vector2 vecC = vecA.plus(vecB);
        Vector2 result = new Vector2(1, 1);
        Assert.assertEquals(vecC, result);
    }

    @Test
    public void multiple() {
        Vector2 vecA = new Vector2(0, 0);
        Vector2 vecB = new Vector2(1, 1);

        Vector2 vecC = vecA.multiple(vecB);
        Vector2 result = new Vector2(0, 0);
        Assert.assertEquals(vecC, result);
    }

    @Test
    public void division() {
        Vector2 vecA = new Vector2(4, 4);
        Vector2 vecB = new Vector2(2, 2);

        Vector2 vecC = vecA.division(vecB);
        Vector2 result = new Vector2(2, 2);
        Assert.assertEquals(vecC, result);
    }

    @Test
    public void moveX() {
        Vector2 vecA = new Vector2(4, 4);
        Vector2 vecC = vecA.moveX(-1);
        Vector2 result = new Vector2(3, 4);
        Assert.assertEquals(vecC, result);
    }

    @Test
    public void moveY() {
        Vector2 vecA = new Vector2(4, 4);
        Vector2 vecC = vecA.moveY(-1);
        Vector2 result = new Vector2(4, 3);
        Assert.assertEquals(vecC, result);
    }

    @Test
    public void moveXY() {
        Vector2 vecA = new Vector2(4, 4);
        Vector2 vecC = vecA.moveXY(-1, -1);
        Vector2 result = new Vector2(3, 3);
        Assert.assertEquals(vecC, result);
    }
}
