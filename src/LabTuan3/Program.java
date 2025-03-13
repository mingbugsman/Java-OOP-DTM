package LabTuan3;


import LabTuan3.Bai1.Infracture.StudentManager;
import LabTuan3.Bai1.Repository.StudentRepository;
import LabTuan3.Bai1.Repository.StudentRepositoryImpl;
import LabTuan3.Bai1.Bai1;
import LabTuan3.Bai2.Bai2;
import LabTuan3.Bai3.Bai3;
import LabTuan3.Bai4.Bai4;
import LabTuan3.Bai4.Manager.EmployeeManager;
import LabTuan3.Bai4.Repository.EmployeeRepository;
import LabTuan3.Bai4.Repository.EmployeeRepositoryImpl;
import LabTuan3.bai5.Bai5;


import java.util.Scanner;

public class Program {
    private static Scanner scanner;
    private static Bai1 bai1;
    private static Bai2 bai2;
    private static Bai3 bai3;
    private static Bai4 bai4;
    private static Bai5 bai5;
    public static void main(String[] args) {
        initialDependencies();
        while (true) {
            display();
            System.out.print("Enter option : ");
            int option = scanner.nextInt();
            switch (option) {
                case 1 :
                    bai1.execBai1();
                    break;
                case 2:
                    bai2.execBai2();
                    break;
                case 3 :
                    bai3.execBai3();
                    break;
                case 4 :
                    bai4.execBai4();
                    break;
                case 5 :
                    bai5.execBai5();
                    break;

                case 0 :
                    return;
            }
        }
    }

    public static void display() {
        System.out.println("""
                
                
                1. Lam bai 1.
                2. Lam bai 2.
                3. Lam bai 3.
                4. Lam bai 4.
                5. Lam bai 5.
                0. Dung chuong trinh
                
                """);
    }
    public static void initialDependencies() {

        scanner = new Scanner(System.in);
        StudentRepository studentRepository = new StudentRepositoryImpl();
        StudentManager studentManager = new StudentManager(studentRepository, scanner);
        bai1 = new Bai1(studentManager);

        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        EmployeeManager employeeManager = new EmployeeManager(employeeRepository, scanner);



        bai2 = new Bai2(scanner);
        bai3 = new Bai3(scanner);
        bai4 = new Bai4(scanner, employeeManager);
        bai5 = new Bai5(scanner);

    }
}
