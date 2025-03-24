package LabTuan5.Bai2;

import java.util.Scanner;

public class HinhChuNhat implements Hinh{
    private float dai, rong;
    private final Scanner scanner;


    public HinhChuNhat(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void nhap() {
        System.out.print("Nhap chieu dai "); dai = scanner.nextFloat();
        System.out.print("Nhap chieu rong : "); rong = scanner.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("chieu dai: "+ dai); ;
        System.out.println("chieu rong: " + rong);
    }

    @Override
    public float dienTich() {
        return dai*rong;
    }
}
