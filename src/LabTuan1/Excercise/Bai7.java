package LabTuan1.Excercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai7 {
    private double mathGrade;
    private double chemistryGrade;
    private double biologyGrade;
    private double physicGrade;
    private double csGrade;
    private final Scanner scanner;

    public Bai7(Scanner scanner) {
        this.scanner = scanner;
    }

    public void execBai7() {
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Input bio grade : ");
        biologyGrade = scanner.nextDouble();
        grades.add(biologyGrade);

        System.out.println("Input math grade : ");
        mathGrade = scanner.nextDouble();
        grades.add(mathGrade);

        System.out.println("Input chemistry grade : ");
        chemistryGrade = scanner.nextDouble();
        grades.add(chemistryGrade);

        System.out.println("Input physic grade : ");
        physicGrade = scanner.nextDouble();
        grades.add(physicGrade);

        System.out.println("Input compute science grade : ");
        csGrade = scanner.nextDouble();
        grades.add(csGrade);

        double finalGrade = calculate(grades);
        rating(finalGrade*10);
    }

    private void rating(double finalGrade) {
        if (finalGrade < 40) System.out.println("F rating");
        else if (finalGrade < 60) System.out.println("E rating");
        else if (finalGrade < 70) System.out.println("D rating");
        else if (finalGrade < 80) System.out.println("C rating");
        else if (finalGrade < 90) System.out.println("B rating");
        else System.out.println("A rating");
    }

    private double calculate(ArrayList<Double> grades) {
        double sum = 0.0;
        for (var grade : grades) {
            sum+=grade;
        }
        return sum/grades.size();
    }



}
