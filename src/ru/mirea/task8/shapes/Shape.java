package ru.mirea.task8.shapes;

import java.awt.*;

import static java.lang.Math.abs;

public abstract class Shape {
    protected String color;
    protected Color colorGUI;
    protected Boolean filled;

    public Shape(){
        this.color = "White";
        this.filled = true;
    }

    public Shape(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public abstract void draw(Graphics g);

    public Double randInt(int min, int max) {
        max -= min;
        return (Math.random() * ++max) + min;
    }

    public Color randomColor() {
        Color[] colors = new Color[]{new Color(0, 255, 0), new Color(0, 255, 255), new Color(0, 169, 255), new Color(106, 0, 255), new Color(200, 50, 255), new Color(255, 60, 200), new Color(205, 30, 30)};
        return colors[abs(randInt(0, colors.length).intValue()-1)];
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public Boolean isFilled(){
        return this.filled;
    }

    public void setFilled(Boolean filled){
        this.filled = filled;
    }

    public abstract Double getArea();

    public abstract Double getPerimeter();
}
