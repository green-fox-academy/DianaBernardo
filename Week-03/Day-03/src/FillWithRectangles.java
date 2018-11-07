import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.util.Random;



public class FillWithRectangles {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.

        for (int i = 0; i < 4; i++) {
            int range = Math.abs(320 - 0) + 1;
            int x = (int) ((Math.random() * range) + 1);
            int y = (int) ((Math.random() * range) + 1);
            int w = (int) ((Math.random() * range) + 1);
            int z = (int) ((Math.random() * range) + 1);

            int rangecolor = Math.abs(255 - 0) + 1;
            int r = (int) ((Math.random() * rangecolor) + 1);
            int g = (int) ((Math.random() * rangecolor) + 1);
            int b = (int) ((Math.random() * rangecolor) + 1);

            Color randomColor = new Color (r, g, b);

            graphics.setColor(randomColor);
            graphics.drawRect(x, y, w, z);
        }


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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
