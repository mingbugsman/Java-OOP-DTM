package LabTuan1.Excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bai11 {
    private int num;
    private final Scanner scanner;

    public Bai11(Scanner scanner) {
        this.scanner = scanner;
    }

    public void execBai11() {
        System.out.println("Input number : ");
        num = scanner.nextInt();
        System.out.println("Reverse number is " + reverseNumber(num));
    }
    public int reverseNumber(int num) {
        StringBuilder buf = new StringBuilder(String.valueOf(num));
        return Integer.parseInt(buf.reverse().toString());
    }
}
