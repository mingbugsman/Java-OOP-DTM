package LabTuan1.Excercise;

import java.util.Scanner;

public class Bai2 {
    private double h;
    private double w;
    private final Scanner scanner;

    public Bai2(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public double getH() {
        return h;
    }

    public double getW() {
        return w;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setW(double w) {
        this.w = w;
    }
    public void execBai2() {
        System.out.println("Input height : ");
        double h = getScanner().nextDouble();
        System.out.println("Input width : ");
        double w = getScanner().nextDouble();

        double res = h*w;
        System.out.println("result is : " + res);
    }

}
