package LabTuan4.Bai2;

public abstract class Person {
    private String name;
    private String address;


    public Person(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "name= " + name  +
                ", address= " + address;
    }
}
