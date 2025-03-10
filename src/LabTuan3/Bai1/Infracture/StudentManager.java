package LabTuan3.Bai1.Infracture;

import LabTuan3.Bai1.Entities.Student;
import LabTuan3.Bai1.Repository.StudentRepository;
import LabTuan3.Exception.ErrorCode;
import LabTuan3.Exception.OOPException;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class StudentManager {

    private final StudentRepository studentRepository;
    private final Scanner scanner;

    public StudentManager(StudentRepository studentRepository, Scanner scanner) {
        this.studentRepository = studentRepository;
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void addStudent() {

        String id = UUID.randomUUID().toString();

        System.out.print("Input name : ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.print("Input average grade : ");
        float avgGrade = scanner.nextFloat();

        if (studentRepository.existsById(id)) {
            System.out.println(ErrorCode.STUDENT_IS_ALREADY_EXISTED.getCode());
            System.out.println(ErrorCode.STUDENT_IS_ALREADY_EXISTED.getMessage());
            return;
        }
        Student student = new Student(id, avgGrade, name);
        studentRepository.save(student);


    }

    public void updateStudentById( ) {
        System.out.println("Update information user : ");

        System.out.print("Enter id : ");
        scanner.nextLine();
        String id = scanner.nextLine();

        System.out.print("Enter name : ");
        String name = scanner.nextLine();

        try {
            Student student = studentRepository.getStudentById(id);
            student.setName(name);

        } catch (OOPException e) {
            System.out.println("code : " + e.getErrorCode().getCode());
            System.out.println("message : " + e.getErrorCode().getMessage());
        }
    }

    public void getAll() {
        System.out.println("Danh sach sinh vien");
        var students = studentRepository.getAll();

        if (students.isEmpty()) {
            System.out.println("empty list");
            return;
        }

        for (var student : students) {
            System.out.println(student.toString());
        }
    }
    public void getAllSortedListByAvgGrade() {
        System.out.println("Danh sach sinh vien");

        var res =studentRepository.getAll();

        if (res.isEmpty()) {
            System.out.println("empty list");
            return;
        }

        res.sort(Comparator.comparingDouble(Student::getAvgGrade));
        for (var student : res) {
            System.out.println(student.toString());
        }
    }
    public void getTheBestStudents() {
        System.out.println("Danh sách sinh viên có điểm cao nhất:");

        List<Student> students = studentRepository.getAll();

        if (students.isEmpty()) {
            System.out.println("Không có sinh viên nào.");
            return;
        }


        double maxGrade = students.stream()
                .mapToDouble(Student::getAvgGrade)
                .max()
                .orElse(-1);
        List<Student> bestStudents = students.stream()
                .filter(s -> s.getAvgGrade() == maxGrade)
                .toList();

        if (bestStudents.isEmpty()) {
            System.out.println("Không tìm thấy sinh viên nào.");
        } else {
            bestStudents.forEach(s1 -> System.out.println(s1.getName()));
        }
    }

}

