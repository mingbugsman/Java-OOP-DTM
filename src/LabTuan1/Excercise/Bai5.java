package LabTuan1.Excercise;

import java.util.Scanner;

public class Bai5 {
    private double first;
    private double second;
    private double third;
    private final Scanner scanner;

    public Bai5(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public double getThird() {
        return third;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public void setThird(double third) {
        this.third = third;
    }
    public void execBai5() {
        System.out.print("First : ");
        setFirst(getScanner().nextDouble());
        System.out.println("Second : ");
        setSecond(getScanner().nextDouble());
        System.out.println("Third : ");
        setThird(getScanner().nextDouble());

        double min = first;
        if (min > second)
            min = second;

        if (min > third) {
            min = third;
        }

        System.out.println("số thứ 2 : " + min);
    }
}
