package LabTuan2.Excercise.Bai5;

import LabTuan2.Excercise.Bai5.BookManager.Manager.LibraryManager;

import java.util.Scanner;

public class Bai5 {
    private final LibraryManager libraryManager;
    private final Scanner scanner;
    public Bai5(Scanner scanner) {
        this.scanner = scanner;
        libraryManager = new LibraryManager(scanner);
    }
    public void execBai5() {
        while (true) {
            displayMethod();
            System.out.println("Nhap lua chon");
            int option = scanner.nextInt();
            switch (option) {
                case 1 :
                    libraryManager.getAllBooks();
                    break;
                case 2 :
                    libraryManager.getBook();
                    break;
                case 3 :
                    libraryManager.addBook();
                    break;
                case 4 :
                    libraryManager.updateBook();
                    break;
                case 5 :
                    libraryManager.removeBook();
                    break;
                case 6 :
                    libraryManager.getStudents();
                    break;
                case 7 :
                    libraryManager.getStudent();
                    break;
                case 8 :
                    libraryManager.addStudent();
                    break;
                case 9 :
                    libraryManager.updateStudent();
                    break;
                case 10 :
                    libraryManager.removeStudent();
                    break;
                default:
                    System.out.println("Sai lua chon");
            }
        }
    }
    public void displayMethod() {
        System.out.println("""
                1. Xem danh sach sach
                2. Xem cuon sach cu the bang id
                3. Them sach
                4. Cap nhap sach
                5. Xoa sach
                
                6. Xem danh sach hoc sinh
                7. Xem hoc sinh bang id
                8. Them hoc sinh
                9. Cap nhat hoc sinh
                10. Xoa hoc sinh
                
                0. De thoat bai 5
                """);
    }
}
