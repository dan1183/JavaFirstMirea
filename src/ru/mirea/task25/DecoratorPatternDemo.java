package ru.mirea.task25;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Circle c = new Circle();

        ShapeDecorator cDecorator = new RedShapeDecorator(c);

        Rectangle r = new Rectangle();

        ShapeDecorator rDecorator = new RedShapeDecorator(c);

        cDecorator.draw();
        rDecorator.draw();
    }
}
