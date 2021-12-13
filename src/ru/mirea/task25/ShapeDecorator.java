package ru.mirea.task25;

public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    protected ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        if (shape != null) {
            shape.draw();
        }
    }
}
