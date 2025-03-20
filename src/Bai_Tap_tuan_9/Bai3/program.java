package Bai_Tap_tuan_9.Bai3;

public class program {
    public static void main(String[] args) {
        ResizableCircle obj = new ResizableCircle(5.5);
        System.out.println(obj.getArea());
        System.out.println(obj.resize(50));
        System.out.println(obj.getArea());
    }
}
