package LabTuan1.Excercise;

import java.util.Scanner;

public class Bai9 {
    private String chuSo;
    private final Scanner scanner;

    public Bai9(Scanner scanner) {
        this.scanner = scanner;
    }

    public enum OPERATOR {
        SUM,
        ACCUMULATION
    }

    public void execBai9() {
        System.out.println("Input string number : ");
        scanner.nextLine();
         chuSo = scanner.nextLine();

        System.out.println("sum = ");
        System.out.println(calculate(chuSo, OPERATOR.SUM));
        System.out.println("Accumulation : ");
        System.out.println( calculate(chuSo, OPERATOR.ACCUMULATION));
    }

    private double calculate(String chuSo, OPERATOR  operator) {
        double res = 0.0;
        for (int i = 0 ; i < chuSo.length(); i++) {
            if (OPERATOR.SUM == operator) {
                res += chuSo.charAt(i) - '0';
            } else if (OPERATOR.ACCUMULATION == operator) {
                res*= chuSo.charAt(i) - '0';
            }
        }
        return res;
    }
}
