package LabTuan4.Bai5;


import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLySach quanLySach = new QuanLySach();
        while (true) {
            System.out.println("1. Them sach : ");
            System.out.println("2. Xuat thong tin toan bo sach : ");
            System.out.println("3. Tim sach co gia tien lon nhat");
            System.out.println("0.Thoat chuong trinh");
            int option;
            System.out.print("Nhap lua chon : "); option = scanner.nextInt();
            switch (option) {
                case 1 :
                    System.out.println("Them sach");
                    quanLySach.themSach();
                    break;
                case 2 :
                    System.out.println("Xuan thong tin toan bo sach ");
                    quanLySach.xuatThongTinSach();
                    break;
                case 3 :
                    System.out.println("Tim sach co gia tien lon nhat ");
                    quanLySach.xuatThongTinSachCoGiaLonNhat();
                    break;
                case 0:
                    return;
            }
        }
    }
}
