package LabTuan2;

import LabTuan2.Excercise.Bai1.Bai1;
import LabTuan2.Excercise.Bai2.Bai2;
import LabTuan2.Excercise.Bai3.Bai3;
import LabTuan2.Excercise.Bai4.Bai4;
import LabTuan2.Excercise.Bai5.Bai5;
import LabTuan2.Excercise.Bai5.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayExercises();
            System.out.print("Nhap lua chon : ");
            switch (scanner.nextInt()) {
                case 1 :
                    Bai1 bai1 = new Bai1(scanner);
                    bai1.execBai1();
                    break;
                case 2 :
                    Bai2 bai2 = new Bai2(scanner);
                    bai2.execBai2();
                    break;
                case 3 :
                    Bai3 bai3 = new Bai3(scanner);
                    bai3.execBai3();
                    break;
                case 4 :
                    Bai4 bai4 = new Bai4(scanner);
                    bai4.execBai4();
                    break;
                case 5 :
                    Bai5 bai5 = new Bai5(scanner);
                    bai5.execBai5();
                    break;
                case 6 :
                    Product product = new Product();
                    product.execProduct();
                    break;

                case 0 :
                    return;
            }
        }
    }
    public static void displayExercises() {
        System.out.println("""
                1. Bai 1
                2. Bai 2
                3. Bai 3
                4. Bai 4
                5. Bai 5
                6. Bai 5/ Sanpham
                0. exit
                """);

    }
}

// xay dung mot chuong trinh quan ly sinh vien
// gom ho ten, dia chi ,sdt, mssv
// hay xay dung thuoc tinh
// getter,setter cho cac thuoc tinh
// viet ham khoi tao doi tuong tham so hoac khong tham so
// viet toString de ke thua
// xay dung mot class main nhap vao n sinh vien, uu tien su dung mang, list
// xuat danh sach theo thu tu tang dan theo ma sinh vien