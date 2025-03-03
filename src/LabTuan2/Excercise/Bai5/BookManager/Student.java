package LabTuan2.Excercise.Bai5.BookManager;

public class Student {
    private String stID;
    private String stClass;
    private String stName;

    public Student() {}

    public Student(String stName, String stClass, String stID) {
        this.stName = stName;
        this.stClass = stClass;
        this.stID = stID;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public void setStClass(String stClass) {
        this.stClass = stClass;
    }

    public void setStID(String stID) {
        this.stID = stID;
    }

    public String getStID() {
        return stID;
    }

    public String getStName() {
        return stName;
    }

    public String getStClass() {
        return stClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stID='" + stID + '\'' +
                ", stClass='" + stClass + '\'' +
                ", stName='" + stName + '\'' +
                '}';
    }
}
