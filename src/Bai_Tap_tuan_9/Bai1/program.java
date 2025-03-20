package Bai_Tap_tuan_9.Bai1;

public class program {
    public static void main(String[] args) {
        IEmployee employee = new PartTimeEmployee("Tran Tuan Minh", 75000, 5);
        System.out.println(employee.calculateSalary());

        IEmployee employee1 = new FullTimeEmployee("Tran Tuan Minh", 80000);
        System.out.println("Fulltime employee salary : " + employee1.calculateSalary());
    }
}
