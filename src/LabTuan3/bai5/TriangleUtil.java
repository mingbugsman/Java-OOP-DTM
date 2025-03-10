package LabTuan3.bai5;

import LabTuan3.Exception.ErrorCode;

public class TriangleUtil {
    public static boolean checkValidationTriangle(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a);
    }
    public static String checkTriangleType(int a, int b, int c) {

        if (!checkValidationTriangle(a, b, c)) {
            System.out.println("ERROR : ");
            System.out.println("Code : " + ErrorCode.NOT_A_TRIANGLE.getCode());
            System.out.println("MESSAGE : " + ErrorCode.NOT_A_TRIANGLE.getMessage());
        }


        if (a == b && b == c) {
            return "Tam giác đều";
        }


        if (a == b || a == c || b == c) {
            return "Tam giác cân";
        }


        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "Tam giác vuông";
        }

        return "Tam giác thường";
    }
    public static double getPerimeter(Triangle triangle) {
        return triangle.geta() + triangle.getb() + triangle.getc();
    }

    public static double getArea(Triangle triangle) {
        int a = triangle.geta();
        int b = triangle.getb();
        int c = triangle.getc();
        double s = getPerimeter(triangle) / 2; // Nửa chu vi
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}
