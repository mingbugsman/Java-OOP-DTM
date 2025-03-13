package Bai_tap_tuan_8.Baitap1.Enities;

import Bai_tap_tuan_8.Baitap1.ExtendedClasses.HinhTron;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieuCao;

    HinhTru() {
        ten = "Hinh Tru";
    }

    public void nhapChieuCao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu cao : ");
        chieuCao = scanner.nextFloat();
    }

    @Override
    public void inChuVi() {
        System.out.println("Chu vi la " + ChuVi);
    }

    public void tinhChuVi() {
        ChuVi = chieuCao*PI*banKinh*banKinh;
    }
}
