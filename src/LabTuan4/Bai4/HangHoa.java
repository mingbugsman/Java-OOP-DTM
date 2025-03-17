package LabTuan4.Bai4;

import java.util.Scanner;

public abstract class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected long donGia;
    public Scanner scanner = new Scanner(System.in);
    public HangHoa() {
    }

    public HangHoa(String maHang, long donGia, String tenHang) {
        this.maHang = maHang;
        this.donGia = donGia;
        this.tenHang = tenHang;
    }

    public void xuat() {
        System.out.println("ma hang : " + maHang);
        System.out.println("ten hang : " + tenHang);
        System.out.println("don gia : " + donGia);
    }
    public void nhap() {
        System.out.print("Nhap ma hang : " );
        maHang = scanner.nextLine();
        System.out.print("Nhap ten hang : ");
        tenHang = scanner.nextLine();
        System.out.print("Nhap don gia : ");
        donGia = scanner.nextLong();
    }
}
