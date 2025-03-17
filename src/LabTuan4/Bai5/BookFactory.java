package LabTuan4.Bai5;

import java.util.Scanner;

public class BookFactory {
    public static Sach createBook() {
        Sach sach = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("===========================");
        System.out.print("Nhap ma sach : ");
        String bookId = scanner.nextLine();
        System.out.print("Nhap ten sach : ");
        String bookName = scanner.nextLine();
        System.out.print("Nhap ten tac gia : ");
        String author = scanner.nextLine();
        System.out.print("Nhap gia tien : ");
        double cost = scanner.nextDouble();
        System.out.println("==========================");
        scanner.nextLine();

        System.out.println("=========================");
        System.out.print("""
                0. Sach Van Hoc
                1. Sach Giao Khoa
                """);
        System.out.println("==========================");
        System.out.print("Nhap loai sach : ");
        int type = scanner.nextInt();
        TypeBook typeBook = TypeBook.fromInteger(type);
        switch (typeBook) {
            case TypeBook.SACHGIAOKHOA -> {
                System.out.print("Nhap so lan xuat ban : ");
                int edition = scanner.nextInt();
                sach = new SachGiaoKhoa(bookId, bookName, cost, author, edition);
            }

            case SACHVANHOC -> {
                scanner.nextLine();
                System.out.print("Nhap nha xuat ban : ");
                String publisher = scanner.nextLine();
                sach = new SachVanHoc(bookId, bookName, cost, author, publisher);
            }
            case null -> {
                System.out.println("Khong ton tai loai sach");
                return null;
            }
        }
        return sach;
    }
}
