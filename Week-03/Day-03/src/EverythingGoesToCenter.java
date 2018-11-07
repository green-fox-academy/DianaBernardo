import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class EverythingGoesToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int x= 0;
        int y = 0;

        graphics.setColor(Color.BLACK);

        for (x = 0; x <= WIDTH; x += 20) {
            lineDrawing(graphics, x, 0);
            x += 20;
        }

        for (y = 0; y <= HEIGHT; y += 20) {
            lineDrawing(graphics, 0, y);
            y += 20;
        }


        for (int x2 = WIDTH; x2 >=0; x2 -= 20) {
            lineDrawing(graphics, x2, WIDTH);
            x2 -= 20;
        }

        for (int y2 = HEIGHT; y2 >=0; y2 -= 20) {
            lineDrawing(graphics, HEIGHT, y2);
            y2 -= 20;
        }
    }



    public static void lineDrawing(Graphics graphics, int x, int y) {

        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;


        graphics.drawLine(x, y, centerX, centerY);
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
