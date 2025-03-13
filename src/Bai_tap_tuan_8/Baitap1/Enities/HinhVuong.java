package Bai_tap_tuan_8.Baitap1.Enities;

import Bai_tap_tuan_8.Baitap1.ExtendedClasses.HinhChuNhat;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public void nhapCanh() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh : ");
        dai = scanner.nextFloat();
        rong = dai;
    }

}
