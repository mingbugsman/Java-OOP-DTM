package Lab0;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap chieu dai cua hinh vuong : ");
        Square square = new Square(scanner.nextDouble());
        square.display();
    }
}
