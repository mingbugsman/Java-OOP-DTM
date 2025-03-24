package LabTuan5.Bai3;


import LabTuan5.Bai3.Extends.Circle;
import LabTuan5.Bai3.Extends.Rectangle;
import LabTuan5.Bai3.Extends.Square;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter color : ");
        String color = scanner.nextLine();;
        System.out.print("Enter radius : ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle("red", true, radius);
        System.out.println(circle);

        System.out.print("Enter height : ");
        double h = scanner.nextDouble();
        System.out.print("Enter width : ");
        double w = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(w, h);
        System.out.println(rectangle);

        System.out.print("Enter side : ");
        double side = scanner.nextDouble();
        Square sq = new Square(side);
        sq.setColor(color);
        System.out.println(color);

    }
}
