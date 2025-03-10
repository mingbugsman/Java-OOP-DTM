package LabTuan3.Bai4;

import LabTuan3.Bai4.Manager.EmployeeManager;

import java.util.Scanner;

public class Bai4 {
    private final Scanner scanner;
    private final EmployeeManager employeeManager;

    public Bai4(Scanner scanner, EmployeeManager employeeManager) {
        this.scanner = scanner;
        this.employeeManager = employeeManager;
    }

    public void execBai4() {
        while (true) {
            displayMenu();
            System.out.print("Chọn chức năng: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới

            switch (option) {
                case 1 -> employeeManager.inputEmployees();
                case 2 -> employeeManager.displayAllEmployees();
                case 3 -> employeeManager.updateEmployeeName();
                case 4 -> employeeManager.displayHighestSalaryEmployee();
                case 0 -> {
                    System.out.println("Thoát chương trình.");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("""
                
                1. Nhập danh sách nhân viên
                2. Xuất danh sách nhân viên
                3. Thay đổi họ tên nhân viên
                4. In nhân viên có hệ số lương cao nhất
                0. Thoát chương trình

                """);
    }
}
