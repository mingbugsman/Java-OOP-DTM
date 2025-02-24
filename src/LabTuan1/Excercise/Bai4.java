package LabTuan1.Excercise;

import java.util.Scanner;

public class Bai4 {
    private int namNhuan;
    private final Scanner scanner;

    public Bai4(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public int getNamNhuan() {
        return namNhuan;
    }

    public void setNamNhuan(int namNhuan) {
        this.namNhuan = namNhuan;
    }

    public void execBai4() {
        System.out.print("Nhap nam nhuan de kiem tra : ");
        setNamNhuan(getScanner().nextInt());

        if ((getNamNhuan() % 4 == 0 && getNamNhuan() % 100 != 0) || getNamNhuan() % 400 == 0  ) {
            System.out.println(getNamNhuan() + " la nam nhuan");
        } else {
            System.out.println(getNamNhuan() + " khong la nam nhuan");
        }
    }
}
