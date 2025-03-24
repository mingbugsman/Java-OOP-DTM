package LabTuan5.Bai3.Extends;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }
    public double getSide() {
        return getW();
    }


    @Override
    public String toString() {
        return "Square{side= " +
                getSide() +
                ", color=" + getColor() +
                ", perimeter=" + getPerimeter()*1f +'\'' +
                ", area=" + getArea()*1f +
                "}";
    }
}

