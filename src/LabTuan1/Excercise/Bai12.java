package LabTuan1.Excercise;

import java.util.Scanner;

public class Bai12 {
    private int number;
    private final Scanner scanner;

    public Bai12(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void execBai12() {
        System.out.println("Input number to check palindrome");
        setNumber(scanner.nextInt());

        if (checkPalindrome(number)) {
            System.out.println(number + " is palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
    private boolean checkPalindrome(int n) {
        int reverse = 0;
        int temp = Math.abs(n);
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }


        return (reverse == Math.abs(n));
    }
}
