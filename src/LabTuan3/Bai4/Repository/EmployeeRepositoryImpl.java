package LabTuan3.Bai4.Repository;

import LabTuan3.Bai4.Entities.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private final List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getHighestSalaryEmployee() {
        return employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
    }
}
