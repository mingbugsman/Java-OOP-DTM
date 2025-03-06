package Bai_tap_tuan_7.Baitap1.Extends;

import Bai_tap_tuan_7.Baitap1.ParentClass.HinhHoc;

public class HinhChuNhat extends HinhHoc {
    public float chieuRong;
    public float chieudai;

    public HinhChuNhat() {
        name = "Hinh Chu Nhat";
    }
    
    
    
    public float getchieudai() {
        return chieudai;
    }


    public float getchieuRong() {
        return chieuRong;
    }

    public void nhapChieuDai() {
        System.out.println("nhap chieu dai : ");
        this.chieudai = scanner.nextFloat();
    }

    public void nhapChieuRong() {
        System.out.println("Nhap chieu rong : ");
        this.chieuRong = scanner.nextFloat();
    }
    


    public void tinhDienTich() {
        dienTich = chieudai*chieuRong;
        inDienTich();
    }


    public void tinhChuVi() {
        chuVi = 2*(chieudai* chieuRong);
        inChuVi();
    }

}
