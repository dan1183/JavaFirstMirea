package ru.mirea.task2;

public final class Ball {
    private final double radius;
    private final double pressure;

    public Ball(double radius, double pressure) {
        this.radius = radius;
        this.pressure = pressure;
    }

    public double getPressure() {
        return pressure;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", pressure=" + pressure +
                '}';
    }
}
