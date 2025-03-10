package LabTuan3.Bai1.Entities;

public class Student {
    private String id;
    private String name;
    private double avgGrade;


    public Student() {
        id = "";
        name = "";
        avgGrade = 0.0f;
    }

    public Student(String id, double avgGrade, String name) {
        this.id = id;
        this.avgGrade = avgGrade;
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public double setAvgGrade(double avgGrade) {
       return this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", avgGrade=" +(float) avgGrade +
                '}';
    }
}
