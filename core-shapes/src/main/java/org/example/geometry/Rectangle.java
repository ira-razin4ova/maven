package org.example.geometry;

public class Rectangle implements Shape{

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) throw new IllegalArgumentException("Радиус должен быть > 0");
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width + height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width * height);
    }

    public double getDiagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
