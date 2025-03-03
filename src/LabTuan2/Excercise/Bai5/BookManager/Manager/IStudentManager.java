package LabTuan2.Excercise.Bai5.BookManager.Manager;

import LabTuan2.Excercise.Bai5.BookManager.Student;

import java.util.List;

public interface IStudentManager {
    boolean existsStudent(String stId);
    boolean addStudent(Student requestAdding);
    boolean removeStudent(String stID);
    boolean updateStudent(String stID,Student student);
    List<Student> getStudents();
    Student getStudent(String stId);

}
