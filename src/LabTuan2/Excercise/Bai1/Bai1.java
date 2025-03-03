package LabTuan2.Excercise.Bai1;

import java.util.*;

public class Bai1 {
    private final List<Integer> list;
    private final Scanner scanner;

    public Bai1(Scanner scanner) {
        list = new ArrayList<>();
        this.scanner = scanner;
    }
    // a
    private void setList() {
        System.out.print("Nhap so luong phan tu : ");
        int n = scanner.nextInt();
        for (int i = 0 ; i < n; i++) {
            System.out.print("Input x : ");
            int x = scanner.nextInt();
            list.add(x);
        }
    }

    // b
    private void print(List<Integer> list) {
        System.out.print("List : ");
        for (var val : list) {
            System.out.print(val + " ");
        }
    }

    // c
    private int findIndexOfValue() {
        System.out.print("Nhap gia tri x : ");
        int x = scanner.nextInt();
        for (int i = 0 ; i < list.size(); i++) {
            if (list.get(i) == x) {
                return i;
            }
        }
        return -1;
    }

    // d
    private int findMax() {
        Optional<Integer> res=  list.stream()
                .max(Integer::compare);
        return res.orElse(-1);
    }

    // e
    private int findMin() {
        Optional<Integer> res = list.stream().max(Integer::compareTo);
        return res.orElse(-1);
    }

    // f
    private int findIndexMax() {
        int max = findMax();
        for (int i = 0 ; i < list.size(); i++) {
            if (list.get(i) == max) {
                return i;
            }
        }
        return -1;
    }

    // g
    private List<Integer> sort() {
         List<Integer> res = list;
         Collections.sort(res);
         return res;
    }

    // h
    private void addElement(int x) {
        list.add(x);
    }
    private void displayExercises() {
        System.out.println("1. Nhap mang mot chieu cac so nguyen.");
        System.out.println("2. Xuat cac phan tu mang ra cua so xuat chuan.");
        System.out.println("3. Tim vi tri cua mot so nguyen x trong mang.");
        System.out.println("4. Tim gia tri lon nhat trong mang.");
        System.out.println("5. Tim gia tri nho nhat trong mang.");
        System.out.println("6. Tim vi tri phan tu co gia tri lon nhat trong mang.");
        System.out.println("7. Sap xep mang tang dan");
        System.out.println("8, Nhap them phan tu.");
        System.out.println("0. De thoat bai 1.");
    }

    public void execBai1() {
        while (true) {
            displayExercises();
            int option = scanner.nextInt();
            switch (option) {
                case 1 :
                    setList();
                    break;

                case 2:
                    print(list);
                    break;

                case 3:
                    if (findIndexOfValue() == -1) {
                        System.out.println("NOT FOUND");
                        break;
                    };
                    System.out.println("Index of value is " + findIndexOfValue());
                    break;

                case 4 :
                    if (findMax() == -1) {
                        System.out.println("Not Found Max");
                        break;
                    }
                    System.out.println("Max is "+ findMax());
                    break;

                case 5:
                    if (findMin() == -1) {
                        System.out.println("NOT FOUND MIN");
                        break;
                    }
                    System.out.println("MIN IS" + findMin());
                    break;

                case 6:
                    if (findIndexMax() == -1) {
                        System.out.println("NOT FOUND");
                        break;
                    }
                    System.out.println("Index max is " + findIndexMax());
                    break;

                case 7:
                    System.out.println("Mang sau khi sap xe : ");
                    print(sort());
                    break;
                case 0 :
                    return;

            }
        }
    }
}
