package LabTuan1.Excercise;

import java.util.Scanner;

public class Bai6 {
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private final Scanner scanner;

    public Bai6(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    public void ExecBai6() {
        System.out.println("Check triangle ");
        System.out.println("Nhap canh 1 : ");
        firstSide = scanner.nextDouble();
        System.out.println("Nhap canh 2 : ");
        secondSide = scanner.nextDouble();
        System.out.println("Nhap canh 3 : ");
        thirdSide = scanner.nextDouble();

        if (!checkValidTriangle(firstSide, secondSide, thirdSide)) {
            System.out.println("Not a triangle");
        } else {
            System.out.println("yes it is !!!");
        }
    }

    private boolean checkValidTriangle(double f, double s, double t) {
        return (f + s > t && f + t > s && s + t > f );
    }
}
