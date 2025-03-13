package Bai_tap_tuan_8.Baitap1.Abstract;

public abstract class HinhHoc {
    public final float PI = 3.14f;
    public String ten;
    public float ChuVi;
    public float DienTich;
    public float TheTich;

    public HinhHoc() {};
    public abstract void xuatTen();
    public abstract void inChuVi();
    public abstract void inDienTich();
    public abstract void inTheTich();
}
