package LAB1;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void display() {
        System.out.println("Square - Side: " + length);
        System.out.println("Area: " + getArea() + ", Perimeter: " + getPerimeter());
    }

}
