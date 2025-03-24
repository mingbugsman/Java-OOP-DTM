package LabTuan5.Bai2;

import java.util.Scanner;

public class HinhVuong implements Hinh{
    private float canh;
    private final Scanner scanner;

    public HinhVuong(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void nhap() {
        System.out.print("Nhap canh : ");
        canh = scanner.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("Canh hinh vuong la : " + canh);
    }

    @Override
    public float dienTich() {
        return canh+canh;
    }
}
