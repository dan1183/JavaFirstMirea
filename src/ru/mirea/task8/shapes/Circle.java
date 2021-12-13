package ru.mirea.task8.shapes;

import java.awt.*;

public class Circle extends Shape {
    protected Double radius;

    public Circle(){
        super();
        this.colorGUI = randomColor();
        this.radius = randInt(10, 40);
    }

    public Circle(Double radius){
        super();
        this.radius = radius;
    }

    public Circle(Double radius, String color, Boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public Double getRadius(){
        return this.radius;
    }

    public void setRadius(Double radius){
        this.radius = radius;
    }

    @Override
    public Double getArea(){
        return 3.14 * this.radius * this.radius;
    }

    @Override
    public Double getPerimeter(){
        return 3.14 * 2 * this.radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.colorGUI);
        g.fillOval(randInt(20, 450).intValue(), randInt(20, 450).intValue(),
                this.radius.intValue()*2, this.radius.intValue()*2);
    }
}