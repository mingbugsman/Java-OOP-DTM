package Lab0;

public class Rectangle  {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter() {
        return 2*(length + width);
    }
    public double getArea(){
        return length * width;
    }

    public void display() {
        System.out.println("Rectangle - Width: " + width + ", Length: " + length);
        System.out.println("Area: " + getArea() + ", Perimeter: " + getPerimeter());
    }
}
