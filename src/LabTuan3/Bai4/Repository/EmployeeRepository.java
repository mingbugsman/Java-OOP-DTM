package LabTuan3.Bai4.Repository;

import LabTuan3.Bai4.Entities.Employee;

import java.util.List;

public interface EmployeeRepository {
    void addEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getHighestSalaryEmployee();
}
