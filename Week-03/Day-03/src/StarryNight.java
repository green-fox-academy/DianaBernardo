import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        graphics.fillRect(0,0,WIDTH, HEIGHT);

        for (int i = 0; i < 40; i++) {
            int range = Math.abs(320 - 0) + 1;
            int range2 = Math.abs(20-0) + 1;
            int x = (int) ((Math.random() * range) + 1);
            int y = (int) ((Math.random() * range) + 1);
            int w = (int) ((Math.random() * range2) + 1);

            int range3 = Math.abs(255-0);
            int rgb = (int) ((Math.random() * range3) + 1);
            Color greyColors = new Color (rgb, rgb, rgb);

            graphics.setColor(greyColors);
            graphics.drawRect(x, y, w, w);
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
