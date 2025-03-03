package LabTuan2.StudentManager;

import java.util.List;

public interface IStudentManager {
    List<Student> studentSortById();
    List<Student> getAll();
    Student getStudent(String id);
    boolean existsById(String id);
    boolean addStudent(Student student);
    boolean removeStudent(String id);
    boolean updateStudent(String id, Student student);

}
