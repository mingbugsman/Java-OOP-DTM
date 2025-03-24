package LabTuan5.Bai5;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private int namSinh;
    private final Scanner scanner = new Scanner(System.in);

    public Nguoi() {
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void nhap() {
        System.out.print("nhap ho va ten : ");
        hoTen = scanner.nextLine();
        System.out.print("nhap nam sinh : ");
        namSinh = scanner.nextInt();
    }

    public void xuat() {
        System.out.println("ho va ten : "+ hoTen);
        System.out.println("nhap nam sinh : "+ namSinh);
    }


}
