package LabTuan4.Bai2;

public class Student extends Person{
    private String program;
    private int year;
    private double fee;


    public Student(String address, String name, String program, double fee, int year) {
        super(address, name);
        this.program = program;
        this.fee = fee;
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                '}';
    }
}
