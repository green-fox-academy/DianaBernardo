import javax.swing.*;
import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class LinePlay {
    public static void main(Graphics graphics) {

        int x = 0;
        int y = 0;


        graphics.setColor(Color.MAGENTA);

            for (int i = 0; i <= HEIGHT; i += 12) {
                graphics.drawLine(WIDTH, y, x, 0);
                x += 20;
                y += 20;
            }

        graphics.setColor(Color.GREEN);

            int w = HEIGHT;
            int z = WIDTH;

        for(int j=0; j<=HEIGHT; j+=12){
            graphics.drawLine(0, w, z, HEIGHT);
            w -= 20;
            z -= 20;
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
            main(graphics);
        }
    }
}