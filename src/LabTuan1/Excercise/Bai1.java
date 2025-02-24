package LabTuan1.Excercise;


import java.util.Scanner;

public class Bai1 {
    private String Id;
    private String username;
    private String DateOfBirth;
    private final Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public Bai1(Scanner scanner) {
        this.scanner = scanner;
    }


    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public String getId() {
        return Id;
    }

    public void execBai1() {
        System.out.print("Input id : ");
        scanner.nextLine();
        Id = scanner.nextLine();
        System.out.print("Input username : ");
        username = scanner.nextLine();
        System.out.print("Input DateOfBirth : ");
        DateOfBirth = scanner.nextLine();

        System.out.println("Id : " + Id);
        System.out.println("username : " + username);
        System.out.println("Date of birth : " + DateOfBirth);
    }
}
