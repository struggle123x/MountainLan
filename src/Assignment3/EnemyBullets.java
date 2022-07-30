package Assignment3;

import javax.swing.*;

public class EnemyBullets {
    private int atk;
    private ImageIcon image;
    private int speed;
    private boolean islive = true;
    private int x, y;
    private boolean suspend = false;

    public EnemyBullets(int atk, ImageIcon image, int speed, int x, int y) {
        super();
        this.atk = atk;
        this.image = image;
        this.speed = speed;
        this.x = x;
        this.y = y;
    }

    public void run() {
        while (islive) {
            while (suspend) {
                //暂停功能
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            y += speed;
        }
    }

    public boolean isIslive() {
        return islive;
    }

    public void setIslive(boolean islive) {
        this.islive = islive;
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isSuspend() {
        return suspend;
    }

    public void setSuspend(boolean suspend) {
        this.suspend = suspend;
    }
}
