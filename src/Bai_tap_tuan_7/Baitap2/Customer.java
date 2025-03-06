package Bai_tap_tuan_7.Baitap2;

public class Customer extends Person{
    private float balance;
    public Customer(String name, String address, float balance) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("ten la " + getName() + "\n" + "dia chi la " + getAddress() + "\n" + "banlance is " + balance);

    }
}
