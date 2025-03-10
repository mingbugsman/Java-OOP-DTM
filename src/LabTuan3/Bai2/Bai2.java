package LabTuan3.Bai2;

import LabTuan3.Exception.ErrorCode;

import java.util.Scanner;

public class Bai2 {
    private Fraction f1;
    private Fraction f2;
    private final Scanner scanner;
    public Bai2(Scanner scanner) {
        this.scanner = scanner;
    }
    public void execBai2() {
        while (true) {
            display();
            System.out.print("Nhap lua chon : "); int option = scanner.nextInt();
            switch (option) {
                case 1 :
                     if (checkFirstFraction()) {
                        int UCLN1 = FractionUtil.getGCD(f1.getNumerator(), f1.getDenominator());
                        System.out.println("Uoc chung lon nhat cua phan so thu nhat " + UCLN1);

                     }

                    if (f2 != null) {
                        int UCLN2 = FractionUtil.getGCD(f2.getNumerator(), f2.getDenominator());
                        System.out.println("Uoc chung lon nhat cua phan so thu hai " + UCLN2);
                    }

                    break;
                case 2:
                    enterFraction();
                    break;
                case 3:
                    if (checkFirstFraction()) {
                        System.out.println("phan so thu nhat : " + f1.toString());
                    }
                    if (f2 != null) {
                        System.out.println("phan so thu hai : " + f2);
                    }

                    break;
                case 4:
                    if (checkFirstFraction()) {
                        FractionUtil.simplify(f1);
                        System.out.println("Sau khi toi gian phan so thu 1 : " + f1.toString());
                    }
    ;
                    if (f2 != null) {
                        FractionUtil.simplify(f2);
                        System.out.println("Sau khi toi gian phan so thu 2 : " + f2.toString());
                    }
                    break;
                case 5:
                    if (checkFraction()){
                        FractionUtil.addFraction(f1, f2);
                    }

                    break;
                case 6:
                    if (checkFraction()) {
                        FractionUtil.subtract(f1, f2);
                    }

                    break;
                case 7:
                    if (checkFraction()) {
                        FractionUtil.divide(f1, f2);
                    }
                    break;
                case 8:
                    if (checkFraction()) {
                        FractionUtil.multiply(f1, f2);
                    }
                    break;
                case 0 :
                    return;
            }
        }
    }

    private void display() {
        System.out.println("""
                
                1. Lấy ước chung lớn nhất.
                2. Nhập phân số.
                3. Xuất phân số.
                4. Rút gọn phân số.
                5. Cộng phân số.
                6. Trừ phân số.
                7. Chia phân số.
                8. Nhân phân số.
                0. Thoat bai 2.
                
                """);
    }

    private void enterFraction() {
        System.out.println("First fraction ");
        System.out.print("num of first fraction : ");
        int num1 = scanner.nextInt();
        System.out.print("dem of first fraction : ");
        int dem1 = scanner.nextInt();

        f1 = new Fraction(num1, dem1);

        System.out.println("Second fraction : ");
        System.out.print("num of second fraction : ");
        int num2 = scanner.nextInt();
        System.out.print("num of second fraction : ");
        int dem2 = scanner.nextInt();

        f2 = new Fraction(num2, dem2);

    }

    private boolean checkFraction() {
        if (f1 == null || f2 == null) {
            System.out.println(" ERROR : ");
            System.out.println(" CODE : "+ ErrorCode.FRACTION_INPUT_ERROR.getCode());
            System.out.println(" MESSAGE : "+ErrorCode.FRACTION_INPUT_ERROR.getMessage());
            return false;
        }
        return true;
    }

    private boolean checkFirstFraction() {
        if (f1 == null) {
            System.out.println("chua nhap phan so ");
            return false;
        }
        return true;
    }
}
