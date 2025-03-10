package LabTuan3.Bai3;


import LabTuan3.Exception.ErrorCode;

import java.util.Scanner;

public class Bai3 {
    private Point p1;
    private Point p2;
    private final Scanner scanner;


    public Bai3(Scanner scanner) {
        this.scanner = scanner;
    }

    public void execBai3() {
        while (true) {
            display();
            System.out.print("Nhap lua chon : "); int option = scanner.nextInt();
            switch (option) {
                case 1 :
                    enterPoints();
                    break;
                case 2:
                    if (checkPoint()) {
                        PointUtil.add(p1, p2);
                    }
                    break;
                case 3:
                    if (checkPoint()) {
                        System.out.println("Diem thu nhat : " + p1);
                        System.out.println("Diem thu hai : " + p2);
                    }
                    break;

                case 4:
                    if (checkPoint()) {
                        PointUtil.getSymmetricPoint(p1);
                        PointUtil.getSymmetricPoint(p2);
                    }
                case 0 :
                    return;
            }
        }



    }
    private void enterPoints() {
        System.out.println("First point ");
        System.out.print("num of x point 1 : ");
        int x1 = scanner.nextInt();
        System.out.print("num of y point 1  : ");
        int y1 = scanner.nextInt();

        p1 = new Point(x1, y1);

        System.out.println("Second point : ");
        System.out.print("num of x point 2 : ");
        int x2 = scanner.nextInt();
        System.out.print("num of y point 2 : ");
        int y2 = scanner.nextInt();

        p2 = new Point(x2, y2);

    }
    private void display() {
        System.out.println("""
                
                1. Them hai diem.
                2. Cong hai diem.
                3. Xuất hai diem.
                4. Tinh diem doi xung qua trung hoanh cua 1 diem
                0. Thoat bai 2.
            
                """);
    }

    private boolean checkPoint() {
        if (p1 == null || p2 == null) {
            System.out.println(" ERROR : ");
            System.out.println(" CODE : "+ ErrorCode.FRACTION_INPUT_ERROR.getCode());
            System.out.println(" MESSAGE : "+ErrorCode.FRACTION_INPUT_ERROR.getMessage());
            return false;
        }
        return true;
    }
}
