package LabTuan2.Excercise.Bai3;

import java.util.Scanner;

public class Bai3 {
    SinhVien sv1;
    SinhVien sv2;
    SinhVien sv3;
    Scanner scanner;
    public Bai3(Scanner scanner) {
        sv1 = new SinhVien(1250080116,"Tran Tuan Minh", 5F, 6.7F);
        sv2 = new SinhVien(1250080116,"Tran Nguyen Tuan Sang", 5F, 6.7F);
        sv3 = new SinhVien();
        this.scanner = scanner;
    }

    public void execBai3() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            displayOptions();
            System.out.print("Nhap lua chon : ");
            int option = scanner.nextInt();
            switch (option) {
                case 1 :
                    inputSinhVien();
                    break;

                case 2 :
                    System.out.println(sv1.toString());
                    System.out.println(sv2.toString());
                    System.out.println(sv3.toString());
                    break;
                case 3 :
                    return;

            }
        }
    }
    private void inputSinhVien() {
        System.out.println("Nhap sinh vien 3 ");

        System.out.print("Nhap id : ");
        sv3.setId(scanner.nextInt());

        System.out.println("Nhap ten : ");
        scanner.nextLine();
        sv3.setName(scanner.nextLine());

        System.out.println("Nhap diem ly thuyet : ");
        sv3.setLT(scanner.nextFloat());

        System.out.println("Nhap diem thuc hanh : ");
        sv3.setTH(scanner.nextFloat());

    }

    private void displayOptions() {
        System.out.println("1. Nhap thong so cho sinh vien thu 3");
        System.out.println("2. Xuat thong tin cua ca 3 sinh vien.");
        System.out.println("0. Thoat ra bai 3.");
    }

}
