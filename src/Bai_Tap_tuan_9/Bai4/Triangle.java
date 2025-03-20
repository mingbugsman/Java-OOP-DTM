package Bai_Tap_tuan_9.Bai4;

public class Triangle extends  Shape {

    private double sides;
    private double perimeter;

    public Triangle(double sides) {
        this.sides = sides;
    }

    @Override
    public double getPerimeter() {
        perimeter = sides + sides + sides;
        return perimeter;
    }

    @Override
    public double getArea() {
        return ((Math.pow(3, (double) 1 /2))/4)* Math.pow(sides,2);
    }

}
