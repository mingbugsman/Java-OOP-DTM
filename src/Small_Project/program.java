package Small_Project;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class program {
    public static void main(String[] args) throws IOException {
        int w = 4;
        int h = 4;
        System.out.println("width : " + w);
        System.out.println("height : " + h);
        int[][] matrix = {
                {10,20,30,30},
                {10, 20, 20, 200},
                {40, 50, 150, 180},
                {40, 50, 150, 180}
        };


        ColorUtil.applyColorMapAndSave(matrix,"output" + UUID.randomUUID() + ".png");

    }
}
