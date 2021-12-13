package ru.mirea.task25;

public class RedShapeDecorator extends ShapeDecorator {

    protected RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        if (shape != null) {
            shape.draw();
        }
        System.out.println("Red shape decorator called");
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("Set red border!!");
    }
}
