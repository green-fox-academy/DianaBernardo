import sun.plugin2.util.ColorUtil;

import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;


import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class RainbowBoxes {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        Color[] colors;
        colors = new Color[7];
        colors[0] = new Color(148, 0, 211);
        colors[1] = new Color(75, 0, 130);
        colors[2] = new Color(0, 0, 255);
        colors[3] = new Color(0, 255, 0);
        colors[4] = new Color(255, 255, 0);
        colors[5] = new Color(255, 127, 0);
        colors[6] = new Color(255, 0, 0);



            for (int j = 0; j < colors.length; j++) {
                Color colorToUse = colors[j];
            int range = Math.abs(320 - 0) + 1;
            int size = (int) ((Math.random() * range) + 1);


            squareDrawing(graphics, size, colorToUse);
        }
        }


    public static void squareDrawing(Graphics graphics, int size, Color colorToUse) {

        graphics.setColor(colorToUse);
        graphics.drawRect((WIDTH / 2) - (size / 2), (HEIGHT / 2) - (size / 2), size, size);
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
