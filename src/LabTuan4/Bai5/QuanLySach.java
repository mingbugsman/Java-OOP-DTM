package LabTuan4.Bai5;

import java.util.ArrayList;
import java.util.List;

public class QuanLySach {
    List<Sach> list = new ArrayList<>();

    QuanLySach() {

    }
    public void themSach() {
        Sach sach = BookFactory.createBook();
        if (sach == null) {
            System.out.println("Nhap sai loai sach");
            return;
        }
        list.add(sach);
        System.out.println("Da hoan tat nhap sach");
    }
    public void xuatThongTinSach() {
        if (list.isEmpty()) {
            System.out.println("Empty list");
            return;
        }

        System.out.println("========================================");
        System.out.println("Danh sach la : ");
        for (var sach : list) {
            sach.display();
        }
        System.out.println("========================================");
    }

    public void xuatThongTinSachCoGiaLonNhat() {
        double maxCost = findMaxCost();
        if (maxCost == 0.0) {
            System.out.println("Khong ton tai sach co gia lon nhat");
            return;
        }

        System.out.println("========================================");
        System.out.println("Danh sach : ");
        list.stream().filter(sach -> sach.getCost() == maxCost).forEach(Sach::display);
        System.out.println("========================================");
    }

    private double findMaxCost() {
        return list.stream().mapToDouble(Sach::getCost).max().orElse(0.0);
    }

}
