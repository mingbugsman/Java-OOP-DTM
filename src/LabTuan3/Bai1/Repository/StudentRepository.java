package LabTuan3.Bai1.Repository;

import LabTuan3.Bai1.Entities.Student;

import java.util.List;

public interface StudentRepository {
    void save(Student student);
    List<Student> getAll();
    Student getStudentById(String id);
    boolean existsById(String id);

}
