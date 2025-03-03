package LabTuan2.Excercise.Bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
    private final List<Car> cars;
    private final Scanner scanner;
    public Bai4(Scanner scanner) {
        cars = new ArrayList<>();
        this.scanner = scanner;
    }

    public void execBai4() {
        while (true) {
            displayExercises();
            System.out.println("Nhap lua chon : ");
            int option = scanner.nextInt();
            switch (option) {
                case 1 :
                    System.out.println("Them xe moi : ");
                    addCar();
                    break;
                case 2 :
                    System.out.print("Ten chu xe ");
                    System.out.print("\t\t\t\t\t");
                    System.out.print("Loai xe ");
                    System.out.print("\t\t\t\t\t");
                    System.out.print("Dung tich ");
                    System.out.print("\t\t\t\t\t");
                    System.out.print("Tri gia ");
                    System.out.print("\t\t\t\t\t");
                    System.out.println("Thue phai nop ");
                    System.out.println("==============================================================================");
                    for (var car : cars) {
                        System.out.println(car.getOwnerName() + "\t\t\t\t" + car.getBrand() + "\t\t\t\t" + car.getXiLang() + "\t\t\t\t" + car.getPrice() + "\t\t\t\t" + car.getTax());
                    }
                    break;
                case 0 :
                    return;
            }
        }
    }

    private void addCar() {
        System.out.print("Nhap ten chu xe : ");
        String ownerName = scanner.nextLine();
        System.out.print("Nhap loai xe : ");
        String brand = scanner.nextLine();
        System.out.println("Nhap dung tich xe : ");
        int xiLang = scanner.nextInt();
        System.out.println("Nhap tri gia : ");
        double price = scanner.nextDouble();
        Car car = new Car(ownerName,brand,xiLang,price);
        cars.add(car);

    }

    private void displayExercises() {
        System.out.println("1. Them doi tuong xe.");
        System.out.println("2. Xuat bang ke khai tien cua cac xe");
        System.out.println("0. Thoat bai 4.");
    }
}
