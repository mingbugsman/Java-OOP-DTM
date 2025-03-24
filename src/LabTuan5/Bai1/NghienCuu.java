package LabTuan5.Bai1;

import java.util.Scanner;

public class NghienCuu extends NhanVien{
    private String chuyenMon;
    private double phuCapDocHai;

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("chuyen mon : ");
        chuyenMon = scanner.nextLine();
        System.out.println("phu cap chuc vu : ");
        phuCapDocHai = scanner.nextDouble();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("chuyen mon : " + chuyenMon);
        System.out.println("phu cap doc hai : "+ phuCapDocHai);
    }
    @Override
    public double tinhLuong() {
        return phuCapDocHai+luongCoBan;
    }
}
