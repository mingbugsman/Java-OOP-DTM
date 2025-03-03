package LabTuan2.Excercise.Bai5.BookManager.Manager;

import LabTuan2.Excercise.Bai5.BookManager.Book;
import LabTuan2.Excercise.Bai5.BookManager.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentManager implements IStudentManager{
    private final List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    @Override
    public boolean existsStudent(String stId) {
        Student foundStudent = students.stream().filter(student -> Objects.equals(student.getStID(), stId)).findFirst().orElse(null);
        return foundStudent != null;

    }

    @Override
    public boolean addStudent(Student requestAdding) {
        if (existsStudent(requestAdding.getStID())) {
            return false;
        }
        students.add(requestAdding);
        return true;
    }

    @Override
    public boolean removeStudent(String stId ) {
        if (!existsStudent(stId)) {
            return false;
        }
        Student foundStudent = getStudent(stId);
        students.remove(foundStudent);
        return true;
    }

    @Override
    public boolean updateStudent(String stID,Student student) {
        if (!existsStudent(stID)) {
            return false;
        }
        Student foundSt = getStudent(student.getStID());
        foundSt.setStClass(student.getStClass());
        foundSt.setStName(student.getStName());
        return true;
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public Student getStudent(String stId) {
        return students.stream().filter(student -> Objects.equals(student.getStID(), stId)).findFirst().orElse(null);

    }
}
