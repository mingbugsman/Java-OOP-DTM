package LabTuan3.Bai3;

public class PointUtil {
    public static void add(Point p1, Point p2) {
        float x = p1.getX() + p2.getY();
        float y = p1.getY() + p2.getY();
        System.out.println("res : {" + x + ", " + y + "}" );
    }
    public static void getSymmetricPoint(Point point) {
        System.out.println("res : {" + point.getX() + ", " + -point.getY() + "}" );
    }


}
