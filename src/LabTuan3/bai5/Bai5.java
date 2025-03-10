package LabTuan3.bai5;

import java.util.Scanner;

public class Bai5 {
    private final Scanner scanner;
    private Triangle triangle;
    public Bai5(Scanner scanner) {
        this.scanner = scanner;
    }

    public void execBai5() {
        while (true) {
            display();
            System.out.print("nhap lua chon : ");
            int option = scanner.nextInt();
            switch (option) {
                case 1 :
                    triangle = enterTriangle();
                    break;
                case 2 :
                    System.out.println(triangle.getName());
                    break;
                case 3 :
                    if (checkTriangleIsNull() &&
                            TriangleUtil.checkValidationTriangle(triangle.geta(), triangle.getb(), triangle.getc())) {
                        System.out.println("Chu vi la " + TriangleUtil.getPerimeter(triangle));;
                    }
                    break;
                case 4 :
                    if (checkTriangleIsNull() &&
                            TriangleUtil.checkValidationTriangle(triangle.geta(), triangle.getb(), triangle.getc())) {
                        System.out.println("Dien tich la : "+ TriangleUtil.getArea(triangle));;
                    }
                    break;

                case 0 :


            }
        }
    }
    private Triangle enterTriangle() {
        System.out.println("Enter triangle ");
        System.out.println("Nhap canh a : ");
        int a = scanner.nextInt();
        System.out.println("Nhap canh b : ");
        int b = scanner.nextInt();
        System.out.println("Nhap canh c : ");
        int c = scanner.nextInt();
        return new Triangle(a,b,c);
    }

    public void display() {
        System.out.println("""
                
                1. Nhap tam giac.
                2. Kiem tra loai tam giac.
                3. Tinh chu vi cua tam giac.
                4. Tinh dien tich.
                0. De thoat bai 5.
                """);
    }
    private boolean checkTriangleIsNull() {
        return triangle != null;
    }
}
