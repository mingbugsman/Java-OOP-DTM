package LabTuan2.Excercise.Bai5;

import java.util.Scanner;

public class Product {
    public String productName;
    public double price;
    public double discount;

    public Product(String productName, double price, double discount) {
        this.productName = productName;
        this.price = price;
        this.discount = discount;
    }

    public Product() {
    }

    private void getThueNhapKhau() {
        System.out.println("Thue nhap khau la : "+ this.price * 0.1);
    }

    private void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("input product name : ");
        this.productName = input.nextLine();
        System.out.print("input price : ");
        this.price = input.nextDouble();
        System.out.print("input discount : ");
        this.discount = input.nextDouble();
    }

    private void output() {
        System.out.print("product name : " + this.productName);
        System.out.print("price : " + this.price);
        System.out.print("discount : " + this.discount);
    }

    public void execProduct() {
        input();
        output();
    }


}
