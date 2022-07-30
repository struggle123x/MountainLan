package Assignment3;

import javax.swing.*;

public class MyHeroBullets extends Thread {

    private boolean islive = true;
    private int x;
    private int y;
    private int atk;
    private ImageIcon image;
    private int speed;
    private boolean suspend = false;

    public MyHeroBullets(int x, int y, int atk, ImageIcon image, int speed) {
        super();
        this.x = x;
        this.y = y;
        this.atk = atk;
        this.image = image;
        this.speed = speed;
    }

    public void run() {
        while (islive) {
            while (suspend) {
                //暂停功能
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            y -= speed;
        }
    }

    public boolean isIslive() {
        return islive;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAtk() {
        return atk;
    }

    public ImageIcon getImage() {
        return image;
    }

    public int getSpeed() {
        return speed;
    }

    public void setIslive(boolean islive) {
        this.islive = islive;
    }

    public boolean isSuspend() {
        return suspend;
    }

    public void setSuspend(boolean suspend) {
        this.suspend = suspend;
    }
}
