package LabTuan3.Bai4.Entities;

import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private double baseSalary;
    private double salaryCoefficient;
    private double salary;

    // Constructor mặc định
    public Employee() {}

    // Constructor có tham số
    public Employee(String id, String name, double baseSalary, double salaryCoefficient) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.salaryCoefficient = salaryCoefficient;
        calculateSalary();
    }

    // Constructor sao chép
    public Employee(Employee other) {
        this.id = other.id;
        this.name = other.name;
        this.baseSalary = other.baseSalary;
        this.salaryCoefficient = other.salaryCoefficient;
        this.salary = other.salary;
    }

    // Getters và Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; calculateSalary(); }

    public double getSalaryCoefficient() { return salaryCoefficient; }
    public void setSalaryCoefficient(double salaryCoefficient) { this.salaryCoefficient = salaryCoefficient; calculateSalary(); }

    public double getSalary() { return salary; }


    public void calculateSalary() {
        this.salary = baseSalary * salaryCoefficient;
    }


    public void inputEmployee(Scanner scanner) {

        System.out.print("Nhập mã nhân viên: ");
        this.id = scanner.nextLine();


        System.out.print("Nhập họ tên: ");
        this.name = scanner.nextLine();

        System.out.print("Nhập lương cơ bản: ");
        this.baseSalary = scanner.nextDouble();

        System.out.print("Nhập hệ số lương: ");
        this.salaryCoefficient = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng mới
        calculateSalary();
    }

    public void displayEmployee() {
        System.out.printf("ID: %s - Tên: %s - Lương cơ bản: %.2f - Hệ số lương: %.2f - Lương: %.2f\n",
                id, name, baseSalary, salaryCoefficient, salary);
    }
}
