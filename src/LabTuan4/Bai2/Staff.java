package LabTuan4.Bai2;

public class Staff extends Person{
    private String school;
    private double pay;

    public Staff(String address, String name, String school, double pay) {
        super(address, name);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "school='" + school + '\'' +
                ", pay=" + pay +
                '}';
    }

}
