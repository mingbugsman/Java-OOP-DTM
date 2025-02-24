package LabTuan1.Excercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai13 {
    private String s;
    private final Scanner scanner;

    public Bai13(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void execBai13() {
        System.out.print("Input String : ");
        scanner.nextLine();
        setS(scanner.nextLine());

        System.out.println("count length string : " + s.length());
    }
}
