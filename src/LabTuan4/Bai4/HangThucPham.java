package LabTuan4.Bai4;

public class HangThucPham extends HangHoa {
    private String ngaySanXuat;
    private String ngayHetHan;

    public HangThucPham() {
    }

    public HangThucPham(String maHang, long donGia, String tenHang, String ngaySanXuat, String ngayHetHan) {
        super(maHang, donGia, tenHang);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public void nhap() {
        System.out.println("Nhap thong tin hang thuc pham");
        super.nhap();
        System.out.print("ngay san xuat : ");
        scanner.nextLine();
        ngaySanXuat = scanner.nextLine();
        System.out.print("ngay het han : ");
        ngayHetHan = scanner.nextLine();


    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("ngay san xuat : " + ngaySanXuat);
        System.out.println("ngay het han : " + ngayHetHan);
    }
}
