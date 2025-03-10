package LabTuan3.Bai4.Manager;

import LabTuan3.Bai4.Entities.Employee;
import LabTuan3.Bai4.Repository.EmployeeRepository;


import java.util.Scanner;

public class EmployeeManager {
    private final EmployeeRepository employeeRepository;
    private final Scanner scanner;

    public EmployeeManager(EmployeeRepository employeeRepository, Scanner scanner) {
        this.employeeRepository = employeeRepository;
        this.scanner = scanner;
    }

    public void inputEmployees() {
        System.out.print("Nhập số lượng nhân viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên " + (i + 1) + ":");
            Employee employee = new Employee();
            employee.inputEmployee(scanner);
            employeeRepository.addEmployee(employee);
        }
    }


    public void displayAllEmployees() {
        System.out.println("Danh sách nhân viên:");
        for (Employee employee : employeeRepository.getAllEmployees()) {
            employee.displayEmployee();
        }
    }


    public void updateEmployeeName() {
        System.out.print("Nhập mã nhân viên cần đổi tên: ");
        String id = scanner.nextLine();

        for (Employee emp : employeeRepository.getAllEmployees()) {
            if (emp.getId().equals(id)) {
                System.out.print("Nhập họ tên mới: ");
                emp.setName(scanner.nextLine());
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên.");
    }


    public void displayHighestSalaryEmployee() {
        Employee highest = employeeRepository.getHighestSalaryEmployee();
        if (highest != null) {
            System.out.println("Nhân viên có hệ số lương cao nhất:");
            highest.displayEmployee();
        } else {
            System.out.println("Danh sách nhân viên trống.");
        }
    }
}
