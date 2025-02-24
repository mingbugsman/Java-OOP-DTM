package LabTuan1.Excercise;

import java.util.Scanner;

public class Bai10 {
    private String chuSo;
    private final Scanner scanner;

    public Bai10(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setChuSo(String chuSo) {
        this.chuSo = chuSo;
    }

    public void execBai10() {
        System.out.print("Input string number : ");
        scanner.nextLine();
        setChuSo(scanner.nextLine());

        System.out.print("total number in string : ");
        System.out.println(countString(chuSo));
    }

    private int countString(String s) {
        int count = 0;
        for (int i = 0 ; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

}
