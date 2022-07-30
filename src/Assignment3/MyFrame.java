package Assignment3;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Constant{
    public static final int GAME_WIDTH = 500;
    public static final int GAME_HEIGHT = 750;
}

public class MyFrame extends Frame {
    private static final long serialVersionUID = 2022730L;

    //使图片动起来，定义一个重画窗口的线程类
    class PaintThread extends Thread {
        @Override
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 加载窗体
     */
    public void launchFrame() {
        setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
        setLocation(0, 0);
        setVisible(true);
        new PaintThread().start();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.exit(0);
            }
        });
    }


}
