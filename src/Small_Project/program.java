package Small_Project;

import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;

public class program {
    private static int[][] matrix;
    private static int rows = 4;
    private static int cols = 4;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Nhập ma trận");
            System.out.println("2. Biến đổi ảnh (toàn cục) & xuất ảnh");
            System.out.println("3. Biến đổi ảnh (tùy biến) & xuất ảnh");
            System.out.println("4. Hiển thị ma trận hiện tại");
            System.out.println("5. Thoát");
            System.out.print("Chọn thao tác: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                        inputMatrix(scanner);
                    break;
                case 2:
                    transformGlobal(scanner);
                    break;
                case 3:
                    transformCustomRanges(scanner);
                    break;
                case 4:
                    if (matrix != null) {
                        MatrixUtil.printMatrix(matrix);
                    } else {
                        System.out.println("Bạn chưa nhập ma trận.");
                    }
                    break;
                case 5:
                    running = false;
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }
        scanner.close();
    }

    // Nhập ma trận từ bàn phím
    private static void inputMatrix(Scanner scanner) {
        matrix = new int[rows][cols];
        System.out.println("Nhập giá trị ma trận (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Đã nhập ma trận.");
    }

    // Biến đổi ảnh với khoảng giá trị toàn cục và xuất ảnh
    private static void transformGlobal(Scanner scanner) {
        if (matrix == null) {
            System.out.println("Bạn chưa nhập ma trận.");
            return;
        }
        System.out.println("Nhập khoảng ánh xạ toàn cục [Ymin, Ymax]: ");
        int yMin = scanner.nextInt();
        int yMax = scanner.nextInt();

        matrix = MatrixUtil.transformImage(matrix, yMin, yMax);
        System.out.println("Ma trận sau khi biến đổi:");
        MatrixUtil.printMatrix(matrix);

        saveImage("global_transform");
    }

    // Biến đổi ảnh với hai khoảng giá trị tùy biến và xuất ảnh
    private static void transformCustomRanges(Scanner scanner) {
        if (matrix == null) {
            System.out.println("Bạn chưa nhập ma trận.");
            return;
        }
        System.out.println("Nhập khoảng 1: [a, b] ánh xạ về [A, B]");
        int a = scanner.nextInt(), b = scanner.nextInt();
        int A = scanner.nextInt(), B = scanner.nextInt();

        System.out.println("Nhập khoảng 2: [c, d] ánh xạ về [C, D]");
        int c = scanner.nextInt(), d = scanner.nextInt();
        int C = scanner.nextInt(), D = scanner.nextInt();

        matrix = MatrixUtil.transformImage(matrix, a, b, A, B, c, d, C, D);
        System.out.println("Ma trận sau khi biến đổi:");
        MatrixUtil.printMatrix(matrix);

        saveImage("custom_transform");
    }

    // Xuất ma trận thành ảnh PNG (gọi sau mỗi lần biến đổi)
    private static void saveImage(String transformType) {
        String fileName = transformType + "_" + UUID.randomUUID() + ".png";
        try {
            ColorUtil.applyColorMapAndSave(matrix, fileName);
            System.out.println("Đã lưu ảnh thành công: " + fileName);
        } catch (IOException e) {
            System.out.println("Lỗi khi lưu ảnh: " + e.getMessage());
        }
    }
}
