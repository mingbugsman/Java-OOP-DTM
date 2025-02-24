package LabTuan1.Excercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai15 {
    private String date;
    private final Scanner scanner;

    public Bai15(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void execBai15() {
        while (true) {
            System.out.println("Press 1 to exec Bai 15");
            System.out.println("Press 0 to break");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 :
                    System.out.println("""
                            Input with format day/month/year or day - month - year\s
                            Day : two character. Example : 12, 03, 21,...\s
                            Month : two character same Day\s
                            Year : length > 1 \
                            Example format : 20/12/1211 | 01/01/1929 | 01 - 02 - 2021\s""");
                    System.out.print("Input : ");
                    setDate(scanner.nextLine());

                    execLogic(whiteSpace(date));
                    break;

                case 2 :
                    return;
            }
        }

    }

    private void execLogic(String date ) {
        ArrayList<String> getSpecificFieldOnDate = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        for (int i = 0 ; i < date.length() ; i++) {
            if (date.charAt(i) != '/' && date.charAt(i) != '-') {
                temp.append(date.charAt(i));
            } else {
                getSpecificFieldOnDate.add(temp.toString());
                temp = new StringBuilder();
            }
        }
        getSpecificFieldOnDate.add(temp.toString());

        if (!(getSpecificFieldOnDate.size() ==3)) {
            System.out.println("Wrong format");
        } else {
            System.out.println("Day : " + getSpecificFieldOnDate.getFirst());
            System.out.println("Month : " + getSpecificFieldOnDate.get(1));
            System.out.println("Year : " + getSpecificFieldOnDate.get(2));
        }
    }

    private String whiteSpace(String date) {
        StringBuilder s = new StringBuilder();
        for (int i = 0 ; i < date.length() ;i++) {
            if (date.charAt(i) != ' ') {
                s.append(date.charAt(i));
            }
        }
        return s.toString();
    }
}
