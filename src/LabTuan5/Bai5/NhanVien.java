package LabTuan5.Bai5;

import java.util.Date;

public class NhanVien extends Nguoi {
    private double luong;
    private Date ngayLamViec;
    private PhongBanKhoa phongBanKhoa;

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap luong: ");
        luong = getScanner().nextDouble();

        System.out.print("Nhap ngay lam viec (yyyy-MM-dd): ");
        String ngay = getScanner().next();
        try {
            ngayLamViec = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(ngay);
        } catch (Exception e) {
            System.out.println("Loi dinh dang ngay thang");
        }

        phongBanKhoa = new PhongBanKhoa();
        getScanner().nextLine(); // Loai bo ky tu xuong dong

        System.out.print("Nhap ma phong khoa ban: ");
        phongBanKhoa.setMaPhongKhoaBan(
                getScanner().nextLine());

        System.out.print("Nhap ten phong khoa ban: ");
        phongBanKhoa.setTenPhongKhoaBan(
                getScanner().nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Luong: " + luong);
        System.out.println("Ngay lam viec: " + ngayLamViec);
        System.out.println("Ma phong khoa ban: " + phongBanKhoa.getMaPhongKhoaBan());
        System.out.println("Ten phong khoa ban: " + phongBanKhoa.getTenPhongKhoaBan());
    }
}
