package Bai_tap_tuan_8.Baitap1.ExtendedClasses;

import Bai_tap_tuan_8.Baitap1.Abstract.HinhHoc;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;

    public HinhChuNhat() {
        ten = "Hinh Chu Nhat";
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
        System.out.println("Hinh Chu nhat khong co the tich   ");
    }
    public void tinhDienTich() {
        DienTich = 2* (dai + rong);
    }
    public void tinhTheTich() {
        TheTich = dai*rong;
    }

    public void nhapDai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap dai :");
        dai = scanner.nextFloat();
    }
    public void nhapRong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap rong : ");
        rong = scanner.nextFloat();
    }
}
