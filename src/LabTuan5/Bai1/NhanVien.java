package LabTuan5.Bai1;

import java.util.Scanner;

public abstract class NhanVien {
    protected String maNV;
    protected String tenNV;
    protected String trinhDo;
    protected double luongCoBan;

    public NhanVien() {}
    public NhanVien(String maNV, double luongCoBan, String trinhDo, String tenNV) {
        this.maNV = maNV;
        this.luongCoBan = luongCoBan;
        this.trinhDo = trinhDo;
        this.tenNV = tenNV;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap manv : ");
        maNV = scanner.nextLine();
        System.out.print("Nhap ten nhan vien : ");
        tenNV = scanner.nextLine();
        System.out.print("Nhap trinh do : ");
        trinhDo = scanner.nextLine();
        System.out.print("Nhap luong co ban : ");
        luongCoBan = scanner.nextDouble();
    }

    public void xuat() {
        System.out.println("manv : "+maNV);

        System.out.println("ten nhan vien : "+ tenNV);

        System.out.println("trinh do : "+trinhDo);

        System.out.println("luong co ban : "+luongCoBan);
    }
    public abstract double tinhLuong();

}
