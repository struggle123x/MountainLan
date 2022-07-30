package Assignment3;

/**
 * 定义游戏图像类
 */

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class GameImage {
    private GameImage() {
    }

    public static Image getImage(String path) {
        URL u = GameImage.class.getClassLoader().getResource(path);
        BufferedImage img = null;
        try {
            img = ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }
}
