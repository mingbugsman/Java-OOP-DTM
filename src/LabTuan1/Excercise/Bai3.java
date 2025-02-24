package LabTuan1.Excercise;

import java.util.Scanner;

public class Bai3 {
    private double F;
    private final Scanner scanner;

    public Bai3(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setF(double f) {
        F = f;
    }

    public double getF() {
        return F;
    }

    public void execBai3() {
        System.out.println("input F : ");
        setF(getScanner().nextDouble());

        double res = (F - 32) / 1.8;
        System.out.println("oC : " + res);
    }
}
