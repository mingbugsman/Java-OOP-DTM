package Bai_tap_tuan_7.Baitap1.Extends;

public class HinhTru extends HinhTron {
    public float chieuCao;

    public HinhTru() {
        name = "Hinh tru";
    }

    public void nhapChieuCao() {
        System.out.println("Nhap chieu cao : ");
        chieuCao = scanner.nextFloat();
    }

    public void tinhTheTich() {
        theTich = chieuCao* PI* banKinh*banKinh ;
        inTheTich();
    }

}
