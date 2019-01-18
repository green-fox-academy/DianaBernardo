import java.awt.*;
import java.util.HashMap;

import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class YellowBoard {

    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        int size = HEIGHT;
        int initialX = 0;
        int initialY = 0;
        rectangles(initialX, initialY, size, graphics);
        }

        public static void drawRectangle(int x, int y, int size, Graphics graphics) {
        graphics.drawRect(x, y, size, size);
        }

        public static void rectangles(int x, int y, int size, Graphics graphics) {
        drawRectangle(x, y, size, graphics);
        graphics.setColor(Color.BLACK);
        if (size == HEIGHT) {
            size = WIDTH / 3;
            rectangles(x + size / 3, y, size / 3, graphics);
            rectangles(x, y + size / 3, size / 3, graphics);
            rectangles(x + 2 * (size / 3), y + size / 3, size / 3, graphics);
            rectangles(x + size / 3, y + 2 * (size / 3), size / 3, graphics);
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