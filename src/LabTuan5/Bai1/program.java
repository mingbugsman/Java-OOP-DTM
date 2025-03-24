package LabTuan5.Bai1;

public class program {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new QuanLy();
        nhanVien1.nhap();
        System.out.println("Luong nhan vien quan ly la : " + nhanVien1.tinhLuong());

        NhanVien nhanVien2 = new NghienCuu();
        nhanVien2.nhap();
        System.out.println("Luong nhan vien nghien cu la : " + nhanVien2.tinhLuong());

        NhanVien nhanVien3 = new PhucVu();
        nhanVien3.nhap();
        System.out.println("Luong nhan vien phuc vu la : " + nhanVien3.tinhLuong());
    }


}
