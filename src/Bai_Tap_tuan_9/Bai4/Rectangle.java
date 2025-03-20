package Bai_Tap_tuan_9.Bai4;

public class Rectangle extends Shape {
    private double w;
    private double h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }


    public boolean isSquare() {
        return w == h;
    }

    @Override
    public double getPerimeter() {
        return 2*(w+h);
    }

    @Override
    public double getArea() {
        return w*h;
    }
}
