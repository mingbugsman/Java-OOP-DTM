package Bai_Tap_tuan_9.Bai3;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getPerimeter() {
        return Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
