package LabTuan2.Excercise.Bai2;

import java.util.Scanner;

public class Rectangle {
    private double w;
    private double h;
    private final Scanner scanner;

    public Rectangle(Scanner scanner) {
        this.scanner = scanner;
    }

    public double getW() {
        return w;
    }

    public double getH() {
        return h;
    }

    public void setW(double w) {
        this.w = w;
    }

    public void setH(double h) {
        this.h = h;
    }

    private double getArea() {
        return w*h;
    }
    private double getPerimeter() {
        return 2*(w+h);
    }

    public void execRectangle() {
        while (true) {
            displayExercises();
            int option = scanner.nextInt();
            switch (option) {
                case 1 :
                    System.out.println("Dien tich la " + getArea());
                    break;
                case 2 :
                    System.out.println("Chu vi la " + getPerimeter() );
                    break;

                case 3:
                    System.out.println(this);
                    break;
                case 0 :
                    return;
            }
        }
    }
    private void displayExercises(){
        System.out.println("1. lay dien tich.");
        System.out.println("2. lay chu vi.");
        System.out.println("3. lay thong tin thuoc tinh hinh hoc.");
        System.out.println("0. De thoat bai 2.");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "w=" + w +
                ", h=" + h +
                '}';
    }
}
