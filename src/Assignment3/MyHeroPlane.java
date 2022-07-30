package Assignment3;

import javax.swing.*;

public class MyHeroPlane {
    private int Blood;
    private int speed;
    private ImageIcon image;

    public MyHeroPlane(int blood, int speed, ImageIcon image) {
        super();
        Blood = blood;
        this.speed = speed;
        this.image = image;
    }

    public int getBlood() {
        return Blood;
    }

    public int getSpeed() {
        return speed;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setBlood(int blood) {
        Blood = blood;
    }

}
