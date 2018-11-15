import java.awt.*;
import java.util.HashMap;

import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class YellowBoard {

    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        int size = WIDTH / 3;
        rectangles(5, size, 0, size, graphics);

    }

    public static void rectangles(int n, int x, int y, int size, Graphics graphics) {

        if (n == 0) {
        }
        else {
            size = WIDTH / 3;
            graphics.setColor(Color.BLACK);
            graphics.drawRect(x, y, size, size);
            graphics.drawRect(size + x/3,   y/3, size/3, size/3);
            //rectangles(n-1, x + size/3, y+size/3, size/3, graphics);
        }
    }


    // Don't touch the code below
    static int WIDTH = 321;
    static int HEIGHT = 321;

    public static void main(String[] args) {


        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}