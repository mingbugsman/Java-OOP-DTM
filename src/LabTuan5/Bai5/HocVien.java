package LabTuan5.Bai5;

public class HocVien extends Nguoi{
    private float diemToan;
    private float diemAV;
    private float diemLTCB;
    public HocVien() {super();}
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhập điểm Toán: ");
        diemToan = getScanner().nextFloat();

        System.out.print("Nhập điểm Anh Văn: ");
        diemAV = getScanner().nextFloat();

        System.out.print("Nhập điểm Lập Trình Cơ Bản: ");
        diemLTCB = getScanner().nextFloat();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Điểm Toán: " + diemToan);
        System.out.println("Điểm Anh Văn: " + diemAV);
        System.out.println("Điểm Lập Trình Cơ Bản: " + diemLTCB);
    }
}
