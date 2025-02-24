package LabTuan1.Excercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai14 {
    private String fullName;
    private final Scanner scanner;

    public Bai14(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void execBai14() {
        System.out.print("Input your name: ");
        scanner.nextLine();
        setFullName(scanner.nextLine().trim()); // Read input properly

        displaySpecificFieldName(fullName);
    }

    private void specialCase_1(String name) {
        System.out.println("Chỉ có tên là: " + name);
    }

    private void specialCase_2(String[] name) {
        System.out.println("Họ là: " + name[0]);
        System.out.println("Tên là: " + name[1]);
    }

    private void displaySpecificFieldName(String name) {
        String[] listString = name.split("\\s+");

        if (listString.length == 1) {
            specialCase_1(name);
            return;
        } else if (listString.length == 2) {
            specialCase_2(listString);
            return;
        }

        // Handle full name case (First Name - Middle Name(s) - Last Name)
        String firstName = listString[0];
        String lastName = listString[listString.length - 1];
        StringBuilder middleName = new StringBuilder();

        for (int i = 1; i < listString.length - 1; i++) {
            middleName.append(listString[i]).append(" ");
        }

        System.out.println("Họ là: " + firstName);
        System.out.println("Tên đệm là: " + middleName.toString().trim());
        System.out.println("Tên là: " + lastName);
    }
}
