package ru.mirea.task8.shapes;

import java.awt.*;

public class Rectangle extends Shape {
    protected Double width;
    protected Double length;

    public Rectangle() {
        super();
        this.colorGUI = randomColor();
        this.width = randInt(10, 40);
        this.length = randInt(10, 40);
    }

    public Rectangle(Double width, Double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(Double with, Double length, String color, Boolean filled) {
        super(color, filled);
        this.width = with;
        this.length = length;
    }

    public Double getWidth() {
        return this.width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return this.length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public Double getArea() {
        return this.length * this.width;
    }

    @Override
    public Double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    public void draw(Graphics g) {
        g.setColor(this.colorGUI);
        g.fillRect(randInt(20, 450).intValue(), randInt(20, 450).intValue(),
                this.length.intValue(), this.width.intValue());
    }
}
