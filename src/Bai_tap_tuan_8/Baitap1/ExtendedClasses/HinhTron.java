package Bai_tap_tuan_8.Baitap1.ExtendedClasses;

import Bai_tap_tuan_8.Baitap1.Abstract.HinhHoc;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float banKinh;

    public HinhTron() {
        ten = "Hình Tròn";
    }

    public void nhapBanKinh() {
        Scanner scanner = new Scanner(System.in);
        banKinh = scanner.nextFloat();
    }

    @Override
    public void xuatTen() {
        System.out.println("ten : " + ten);
    }

    @Override
    public void inChuVi() {
        System.out.println("Chu vi la " + ChuVi);
    }

    @Override
    public void inDienTich() {
        System.out.println("Dien tich la " + DienTich);
    }

    @Override
    public void inTheTich() {
        System.out.println("Khong the tinh the tich");
    }

    public void tinhChuVi() {
        ChuVi = banKinh*PI;
    }

    public void tinhDienTich() {
        DienTich = banKinh*banKinh*PI;
    }
}
