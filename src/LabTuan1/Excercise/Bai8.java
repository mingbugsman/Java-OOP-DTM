package LabTuan1.Excercise;

import java.util.Scanner;

public class Bai8 {
    private String chuSo;
    private final Scanner scanner;

    public Bai8(Scanner scanner) {
        this.scanner = scanner;
    }

    public void execBai8() {
        System.out.println("Input string number : ");
        scanner.nextLine();
        chuSo = scanner.nextLine();

        System.out.println("first number in string is : "  + getResult(chuSo,0));
        System.out.println("last number in string is : " + getResult(chuSo, chuSo.length() -1));
    }

    private Character getResult(String chuSo, int idx) {
        if (chuSo == null) {
            return '0';
        }
        return chuSo.charAt(idx);
    }
}
