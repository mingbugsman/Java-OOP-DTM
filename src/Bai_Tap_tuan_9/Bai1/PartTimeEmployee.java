package Bai_Tap_tuan_9.Bai1;

public class PartTimeEmployee extends Employee{
    private int workingHour;

    public PartTimeEmployee(String name, int paymentPerHour, int workingHour) {
        super(name, paymentPerHour);
        this.workingHour = workingHour;
    }

    @Override
    public int calculateSalary() {
        return workingHour*super.getPaymentPerHour();
    }
}
