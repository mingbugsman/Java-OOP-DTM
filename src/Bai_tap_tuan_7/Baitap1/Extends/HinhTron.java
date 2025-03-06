package Bai_tap_tuan_7.Baitap1.Extends;

import Bai_tap_tuan_7.Baitap1.ParentClass.HinhHoc;

public class HinhTron extends HinhHoc {
    public float banKinh;

    public HinhTron() {
        name = "Hinh tron";
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void nhapBanKinh() {
        System.out.println("Nhap ban kinh : ");
        this.banKinh = scanner.nextFloat();
    }


    public void tinhDienTich() {
        dienTich = banKinh*banKinh*PI;
        inDienTich();
    }


    public void tinhChuVi() {
        chuVi =  banKinh*super.PI;
        inChuVi();
    }



}
