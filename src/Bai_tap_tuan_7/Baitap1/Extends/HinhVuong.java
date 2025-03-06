package Bai_tap_tuan_7.Baitap1.Extends;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong() {
        name = "Hinh vuong";
    }
    public void nhapCanh() {
        System.out.println("nhap canh : ");
        chieudai = chieuRong = scanner.nextFloat();
    }
}
