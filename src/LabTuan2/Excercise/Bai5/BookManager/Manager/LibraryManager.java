package LabTuan2.Excercise.Bai5.BookManager.Manager;

import LabTuan2.Excercise.Bai5.BookManager.Book;
import LabTuan2.Excercise.Bai5.BookManager.Student;

import java.util.List;
import java.util.Scanner;

public class LibraryManager {
    private final IStudentManager studentManager;
    private final IManagerBook bookManager;
    private final Scanner scanner;

    public LibraryManager(Scanner scanner) {
        this.bookManager = new BookManager();
        this.studentManager = new StudentManager();
        this.scanner = scanner;

    }
    public boolean addBook() {
        Book request = inputBook();
        return bookManager.addBook(request);
    }
    public boolean updateBook() {
        System.out.println("Update book");
        return bookManager.updateBook(inputId(), inputBook());
    }
    public boolean removeBook() {
        return bookManager.removeBook(inputId());
    }
    public List<Book> getAllBooks() {
        return bookManager.getAll();
    }
    public Book getBook() {
        return bookManager.getBook(inputId());
    }

    public boolean addStudent() {
        Student request = inputStudent();
        return studentManager.addStudent(request);
    }
    public boolean removeStudent() {
        return studentManager.removeStudent(inputId());
    }
    public boolean updateStudent() {
        System.out.println("Update student");
        return studentManager.updateStudent(inputId(),  inputStudent());
    }
    public Student getStudent() {
        return studentManager.getStudent(inputId());
    }
    public List<Student> getStudents() {
        return studentManager.getStudents();
    }

    private Student inputStudent() {
        System.out.println("Nhap thong tin hoc sinh ");
        System.out.print("Nhap id : ");
        scanner.nextLine();
        String id = scanner.nextLine();
        System.out.print("Nhap ten : ");
        String name = scanner.nextLine();
        System.out.print("nhap lop : ");
        String stClass = scanner.nextLine();
        return new Student(id,name, stClass);
    }

    private Book inputBook() {
        System.out.println("Nhap thong tin book : ");
        System.out.print("Nhap book code : ");
        scanner.nextLine();
        String id = scanner.nextLine();
        System.out.print("Nhap ten : ");
        String name = scanner.nextLine();
        System.out.print("nhap lop : ");
        String author = scanner.nextLine();
        return new Book(id,name, author);
    }
    private String inputId() {
        System.out.print("Nhap id : ");
        scanner.nextLine();
        return scanner.nextLine();
    }

}
