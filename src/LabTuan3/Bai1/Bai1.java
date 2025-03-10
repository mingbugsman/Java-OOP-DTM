package LabTuan3.Bai1;


import LabTuan3.Bai1.Infracture.StudentManager;


public class Bai1 {
    private final StudentManager studentManager;
    public Bai1(StudentManager studentManager) {
        this.studentManager = studentManager;
    }

    public void execBai1() {
        while (true) {
            display();
            System.out.print("Enter option : "); int option = studentManager.getScanner().nextInt();
            switch (option) {
                case 1 :
                    studentManager.addStudent();
                    break;
                case 2 :
                    studentManager.getAll();
                    break;
                case 3:
                    studentManager.getAllSortedListByAvgGrade();
                    break;
                case 4:
                    studentManager.updateStudentById();
                    break;
                case 5:
                    studentManager.getTheBestStudents();
                    break;
                case 0 :
                    return;
            }
        }
    }

    private void display() {
        System.out.println("""
                \n
                
                
                1. Them hoc sinh.
                2. In danh sach hoc sinh.
                3. In danh sach theo diem trung binh (giam dan).
                4, Thuc hien cap nhat ten hoc sinh.
                5. Tim tat ca hoc sinh co diem trung binh lon nhat.
                0. Thoat bai 1.
                \n
                
                """);
    }
}
