package LabTuan2.StudentManager;

import java.util.*;

public class StudentManager implements IStudentManager{
    private final List<Student> students;
    private final Scanner scanner;

    public StudentManager(Scanner scanner) {
        this.scanner = scanner;
        this.students = new ArrayList<>();

    }

    @Override
    public List<Student> studentSortById() {
        List<Student> sortedList = students;
        Comparator<Student> compareById = Comparator.comparing(Student::getId);
        sortedList.sort(compareById);
        return sortedList;
    }
    public Student createStudent() {
        Student student = new Student();

        System.out.print("Nhap id : ");
        scanner.nextLine();
        student.setId(scanner.nextLine());

        System.out.print("Nhap ten : ");
        scanner.nextLine();
        student.setName(scanner.nextLine());

        System.out.print("Nhap address : ");
        scanner.nextLine();
        student.setAddress(scanner.nextLine());

        System.out.print("Nhap phone : ");
        scanner.nextLine();
        student.setPhone(scanner.nextLine());

        return student;
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public Student getStudent(String id) {
        return students.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null) ;
    }

    @Override
    public boolean existsById(String id) {
        return students.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null) != null;
    }

    @Override
    public boolean addStudent(Student student) {
        if (existsById(student.getId()))
            return false;
        students.add(student);
        return true;
    }

    @Override
    public boolean removeStudent(String id) {
        if (existsById(id)) {
            return false;
        }

        Student found = getStudent(id);

        students.remove(found);
        return true;
    }

    @Override
    public boolean updateStudent(String id, Student student) {
       if (!existsById(id))
           return false;
       Student foundSt = getStudent(id);
       foundSt.setName(student.getName());
       foundSt.setAddress(student.getAddress());
       foundSt.setPhone(student.getPhone());
       return true;
    }
}
