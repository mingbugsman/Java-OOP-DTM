package LabTuan4.Bai1;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI*getRadius()*getRadius()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius= " + getRadius() +
                ", height= " + height +
                '}';
    }
}
