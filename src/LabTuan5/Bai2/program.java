package LabTuan5.Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng hình: ");
        List<Hinh> ds = new ArrayList<>();
        int i = 0;
        while (isRunning) {
            System.out.println("Chọn loại hình cần nhập \n1: Hình Vuông\n2: Hình Chữ Nhật \n3: Hình Tròn\n4: In danh sach\n0: thoat chuong trinh ");
            System.out.print("nhap lua chon : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                     ds.add( new HinhVuong(scanner));
                    break;
                case 2:
                    ds.add( new HinhChuNhat(scanner));
                    break;
                case 3:
                    ds.add( new HinhTron(scanner));
                    break;
                case 4:
                    inDs(ds);
                    continue;
                case 0 :
                    isRunning = false;
                default:
                    System.out.println("Lựa chọn không hợp lệ, nhập lại.");
                    continue;
            }
            ds.get(i).nhap();
            i++;
        }

    }
    public static void inDs(List<Hinh> ds) {
        System.out.println("\nThông tin các hình và diện tích:");
        System.out.println("-----------------------");
        for (Hinh hinh : ds) {
            hinh.xuat();
            System.out.println("Diện tích: " + hinh.dienTich());
            System.out.println("-----------------------");
        }
    }
}
