package Bai_tap_tuan_8.Baitap2;

public class Employee extends Person {

    private float salary;

    public Employee(String name, String address,float salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("ten la " + getName() + "\n" + "dia chi la " + getAddress() + "\n" + "luong la " + salary);
    }
}
