package Bai_tap_tuan_7.Baitap1.ParentClass;

import java.util.Scanner;

public abstract class HinhHoc {
    public final float PI = 3.14f;
    public String name;
    public float chuVi;
    public float dienTich;
    public float theTich;
    public Scanner scanner = new Scanner(System.in);

    public HinhHoc() {}


    public void xuatTen() {
        System.out.println("ten la : "+ name);
    }

    public void inDienTich() {
        System.out.println("dien tich : " + dienTich);
    }
    public void inChuVi() {
        System.out.println("chu vi :" + chuVi);
    }
    public void inTheTich() {
        System.out.println("the tich : " + theTich);
    }

}
