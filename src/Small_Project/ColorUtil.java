package Small_Project;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class ColorUtil {
    // Hàm nội suy tuyến tính giữa 2 giá trị
    private static int lerp(int a, int b, double t) {
        return (int) (a + t * (b - a));
    }

    // Hàm ánh xạ giá trị chuẩn hóa t [0,1] sang màu RGB theo colormap tùy chỉnh
    private static int getColorFromColormap(double t) {
        // Nếu t nằm giữa 0 và 0.5, nội suy giữa Xanh Dương (0,0,255) và Xanh Lá (0,255,0)
        if (t <= 0.5) {
            double tNorm = t / 0.5;  // chuẩn hóa lại thành [0,1]
            int red = lerp(0, 0, tNorm);           // luôn 0
            int green = lerp(0, 255, tNorm);         // từ 0 đến 255
            int blue = lerp(255, 0, tNorm);          // từ 255 xuống 0
            return (red << 16) | (green << 8) | blue;
        } else { // Nếu t nằm giữa 0.5 và 1, nội suy giữa Xanh Lá (0,255,0) và Đỏ (255,0,0)
            double tNorm = (t - 0.5) / 0.5;  // chuẩn hóa lại thành [0,1]
            int red = lerp(0, 255, tNorm);          // từ 0 đến 255
            int green = lerp(255, 0, tNorm);         // từ 255 -> 0
            int blue = lerp(0, 0, tNorm);            // luôn 0
            return (red << 16) | (green << 8) | blue;
        }
    }
    // Ví dụ áp dụng cho từng pixel của mảng digital number
    public static void applyColorMapAndSave(int[][] matrix, String outputPath) throws IOException, IOException {
        int h = matrix.length;
        int w = matrix[0].length;

        // find max and min in matrix
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < min) min = value;
                if (value > max) max = value;
            }
        }

        BufferedImage img = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                int value = matrix[y][x];
                // Chuẩn hóa về [0,1]
                double t = (double)(value - min) / (max - min);
                int rgb = getColorFromColormap(t);
                img.setRGB(x, y, rgb);
            }
        }

        // Lưu ảnh
        File imagesDir = new File("images");
        if (!imagesDir.exists()) {
            boolean created = imagesDir.mkdir();
            if (!created) {
                System.out.println("khong the tao thu muc images");
                return;
            }
        }
        File outputFile = new File(imagesDir, outputPath);
        ImageIO.write(img, "png", outputFile);
    }
}
