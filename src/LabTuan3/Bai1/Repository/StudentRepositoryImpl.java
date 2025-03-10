package LabTuan3.Bai1.Repository;

import LabTuan3.Bai1.Entities.Student;
import LabTuan3.Exception.ErrorCode;
import LabTuan3.Exception.OOPException;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    List<Student> studentList;
    public StudentRepositoryImpl() {
        studentList = new ArrayList<>();
    }

    @Override
    public void save(Student student) {
        studentList.add(student);
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public Student getStudentById(String id) {
        return studentList.stream().filter(student -> student.getId().equals(id)).findFirst().orElseThrow(() -> new OOPException(ErrorCode.NOT_FOUND_ID));
    }

    @Override
    public boolean existsById(String id) {
        return studentList.stream().anyMatch(student -> student.getId().equals(id));
    }
}
