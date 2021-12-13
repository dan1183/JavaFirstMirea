package ru.mirea.task2;

import java.awt.geom.Point2D;
import java.util.Arrays;

public final class Shape {
    private IntVector2[] points;

    public Shape(IntVector2[] points) {
        this.points = new IntVector2[points.length];
        for (int i = 0; i < points.length; ++i) {
            this.points[i] = new IntVector2(points[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (var item : this.points) {
            builder.append(item);
            builder.append("\n");
        }
        return builder.toString();
    }
}
