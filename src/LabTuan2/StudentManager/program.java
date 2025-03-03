package LabTuan2.StudentManager;

import java.util.List;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager(scanner);
        while (true) {
            display();
            System.out.println("Nhap option : ");
            switch (scanner.nextInt()) {
                case 1 :
                    if (studentManager.addStudent(studentManager.createStudent())) {
                        System.out.println("Hoan tat them");
                    }
                    System.out.println("Loi khi them");
                    break;

                case 2 :
                    List<Student> res = studentManager.getAll();
                    for (var student : res) {
                        System.out.println(student.toString());
                    }
                    break;

                case 3 :
                    System.out.print("Nhap id : ");
                    scanner.nextLine();
                    System.out.println(studentManager.getStudent(scanner.nextLine()).toString());
                    break;
                case 0 :
                    return;
            }
        }
    }

    public static void display() {
        System.out.println("""
                1. Them student
                2. Xuat ra danh sach
                3. Lay Student bang id
                0. Exit
                """);
    }
}
