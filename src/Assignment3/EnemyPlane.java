package Assignment3;

import javax.swing.*;

public class EnemyPlane extends Thread {
    private int blood;
    private int x, y;
    private ImageIcon image;
    private int speed;
    private boolean islive;
    private int sore;
    private boolean suspend = false;

    public EnemyPlane(int blood, int x, int y, ImageIcon image, int speed, int sore) {
        super();
        this.blood = blood;
        this.x = x;
        this.y = y;
        this.image = image;
        this.speed = speed;
        this.islive = true;
        this.sore = sore;
    }

    public void run() {
        while (blood >= 0 && islive) {
            while (suspend) {
                //暂停功能
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            y += speed;
        }
    }

    public int getBlood() {
        return blood;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ImageIcon getImage() {
        return image;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isIslive() {
        return islive;
    }

    public void setIslive(boolean islive) {
        this.islive = islive;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getSore() {
        return sore;
    }

    public boolean isSuspend() {
        return suspend;
    }

    public void setSuspend(boolean suspend) {
        this.suspend = suspend;
    }
}
