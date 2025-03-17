package LabTuan4.Bai2;


import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ");
        System.out.print("Enter name : ");
        String name = scanner.nextLine();
        System.out.print("Enter address : ");
        String address = scanner.nextLine();
        System.out.print("Enter program : ");
        String program = scanner.next();
        System.out.print("Enter fee : ");
        double fee = scanner.nextDouble();
        System.out.print("Enter year : ");
        int year = scanner.nextInt();

        Person student = new Student(address, name, program, fee, year);
        System.out.println(student);


        System.out.println("Enter information staff ");
        System.out.print("Enter name : ");
        scanner.nextLine();
        String nameStaff = scanner.nextLine();
        System.out.print("Enter address : ");
        String addressStaff = scanner.nextLine();
        System.out.print("Enter school : ");
        String school = scanner.next();
        System.out.print("Enter pay : ");
        double pay = scanner.nextDouble();
        Person staff = new Staff(addressStaff, nameStaff, school, pay);
        System.out.println(staff);
    }
}
