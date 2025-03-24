package LabTuan5.Bai1;

import java.util.Scanner;

public class QuanLy extends NhanVien{
   private String chuyenMon;
   private double phuCapChucVu;

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("chuyen mon : ");
        chuyenMon = scanner.nextLine();
        System.out.print("phu cap chuc vu : ");
        phuCapChucVu = scanner.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("chuyen mon : " + chuyenMon);
        System.out.println("phu cap chuc vu : "+ phuCapChucVu);
    }
    @Override
    public double tinhLuong() {
        return luongCoBan+phuCapChucVu;
    }
}
