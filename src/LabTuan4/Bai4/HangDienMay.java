package LabTuan4.Bai4;

public class HangDienMay extends HangHoa{
    private int thoiGianBaoHanh;
    private int dienAp;
    private int congSuat;

    public HangDienMay() {}

    public HangDienMay(String maHang, long donGia, String tenHang, int thoiGianBaoHanh, int dienAp, int congSuat) {
        super(maHang, donGia, tenHang);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }

    @Override
    public void nhap() {
        System.out.println("Nhap thong tin hang dien may");
        super.nhap();
        System.out.print("Nhap thoi gian bao hanh : ");
        thoiGianBaoHanh = scanner.nextInt();
        System.out.print("Nhap dien ap : ");
        dienAp = scanner.nextInt();
        System.out.print("Nhap cong suat : ");
        congSuat = scanner.nextInt();

    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("thoi gian bao hanh : " + thoiGianBaoHanh);
        System.out.println("dien ap : " + dienAp);
        System.out.println("cong suat : " + congSuat);
    }
}
