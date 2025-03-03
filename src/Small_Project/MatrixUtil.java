package Small_Project;

import java.util.Arrays;

public class MatrixUtil {
    public static void printMatrix(int[][] matrix) {
        for (var rows : matrix) {
            for (var x : rows) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    public static int findMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }
    public static int findMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num < min) {
                    min = num;
                }
            }
        }
        return min;
    }
    public static int[][] transformImage(int[][] matrix, int yMin, int yMax) {
        int xMin = findMin(matrix);
        int xMax = findMax(matrix);
        for (int i = 0 ; i < 4; i++) {
            for (int j = 0 ; j < 4 ; j++) {
                matrix[i][j] = lerp(matrix[i][j], xMax, xMin, yMax, yMin);
            }
        }
        return matrix;
    }


    // Hàm biến đổi độ tương phản với khoảng giá trị tùy biến
    public static int[][] transformImage(int[][] input, int a, int b, int A, int B, int c, int d, int C, int D) {
            int[][] output = new int[4][4];

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    int x = input[i][j];

                    if (x >= a && x <= b) {
                        output[i][j] = (((B - A) * (x - a))/ (b-a)) + A;
                    } else if (x >= c && x <= d) {
                        output[i][j] = (((D - C) * (x - c))/ (d-c)) + C;
                    } else {
                        output[i][j] = x; // Giữ nguyên nếu ngoài khoảng quy định
                    }
                }
            }
            return output;
    }
    public static int lerp(int x, int xMax, int xMin, int yMax, int yMin) {
        if (xMax == xMin) return yMin; // Tránh chia cho 0
        return yMin + ((yMax - yMin) * (x - xMin)) / (xMax - xMin);
    }
}
