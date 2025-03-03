package LabTuan2.Excercise.Bai4;

public class Car {
    private String ownerName;
    private String brand;
    private int XiLang;
    private double price;
    private double tax;


    public Car(String ownerName, String brand, int xiLang, double price) {
        this.ownerName = ownerName;
        this.brand = brand;
        this.XiLang = xiLang;
        this.price = price;
        setTax();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getXiLang() {
        return XiLang;
    }

    public void setXiLang(int XiLang) {
        this.XiLang = XiLang;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getTax() {
        return tax;
    }

    public void setTax() {
        this.tax = TaxHelper.calculateTax(getPrice(), getXiLang());
    }

    @Override
    public String toString() {
        return "Car{" +
                "ownerName='" + ownerName + '\'' +
                ", brand='" + brand + '\'' +
                ", XiLang=" + XiLang +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }
}

