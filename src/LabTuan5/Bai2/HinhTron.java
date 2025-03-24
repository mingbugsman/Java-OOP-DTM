package LabTuan5.Bai2;

import java.util.Scanner;

public class HinhTron implements Hinh {
    private float banKinh;
    private final Scanner scanner;

    public HinhTron(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void nhap() {
        System.out.print("Nhap ban kinh "); banKinh = scanner.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("Nhap ban kinh: " + banKinh);
    }

    @Override
    public float dienTich() {
        return PI*banKinh*banKinh;
    }
}
