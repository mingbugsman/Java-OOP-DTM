package LabTuan4.Bai3.Extends;

import LabTuan4.Bai3.Shape;

public class Rectangle extends Shape {
    private double w = 1.0;
    private double h = 1.0;

    public Rectangle() {
    }
    public Rectangle(double w, double h ) {
        this.w = w;
        this.h = h;
    }
    public Rectangle(String color, boolean filled, double w, double h) {
        super(color, filled);
        this.w = w;
        this.h = h;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getPerimeter() {
        return 2*(w+h);
    }

    public double getArea() {
        return w*h;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "w=" + w +
                ", h=" + h +
                ", color=" +getColor() +
                ", perimeter=" + getPerimeter()*1f +'\'' +
                ", area=" + getArea()*1f +
                '}';
    }
}
