package LabTuan4.Bai1;

public class bai1 {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Dien tich hinh tron la : " + circle.getArea());
        System.out.println("mau cua hinh tron la :  "+ circle.getColor());


        circle.setRadius(7);
        circle.setColor("Yellow");
        System.out.println("Sau khi sua ban kinh, dien tich hinh tron la : " + circle.getArea());
        System.out.println("mau cua hinh tron la :  "+ circle.getColor());



        Cylinder c = new Cylinder(6,"blue", 5.5);
        System.out.println("Dien tich hinh tron la : " + c.getArea());
        System.out.println("The tich hinh tron la : " + c.getVolume());
        System.out.println("mau cua hinh tru la :  "+ c.getColor());
    }
}
