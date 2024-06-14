package pertemuan11;

import java.awt.*;
import javax.swing.*;

public class TataSurya extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        this.setBackground(Color.BLACK);

        drawStars(g2d);
        drawOrbits(g2d);

        //Mengaktifkan Antialiasing
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        drawPlanets(g2d);
    }

    private void drawStars(Graphics2D g2d) {
        g2d.setColor(Color.WHITE);
        int numStars = 200;
        for (int i = 0; i < numStars; i++) {
            int x = (int) (Math.random() * getWidth());
            int y = (int) (Math.random() * getHeight());
            g2d.fillOval(x, y, 2, 2);
        }
    }

    private void drawOrbits(Graphics2D g2d) {
        int diameterOrbits[] = {240, 300, 360, 420, 480, 540, 600, 660};
        int xyOrbits[] = {230, 200, 170, 140, 110, 80, 50, 20};

        for (int i = 0; i < diameterOrbits.length; i++) {
            g2d.drawOval(xyOrbits[i], xyOrbits[i], diameterOrbits[i],
                    diameterOrbits[i]);
        }
    }

    private void drawPlanets(Graphics2D g2d) {

        // Titik-titik koordinat untuk planet
        int[] x1 = {260, 450, 390, 490, 240, 540, 270, 60, 60};
        int[] y1 = {260, 390, 480, 240, 150, 450, 600, 210, 510};
        int[] x2 = {440, 470, 415, 515, 264, 577, 305, 90, 91};
        int[] y2 = {440, 410, 505, 265, 177, 487, 635, 240, 541};

        // Diameter planet-planet
        int[] d = {180, 20, 25, 25, 24, 37, 35, 30, 31};

        // Nama-nama planet
        String[] planetNames = {"", "Merkurius", "Venus", "Bumi", "Mars",
            "Jupiter", "Saturnus", "Uranus", "Neptunus"};

        // Warna 1 planet-planet
        Color[] c1 = new Color[]{Color.YELLOW, Color.RED, Color.ORANGE,
            Color.BLUE, Color.RED, Color.ORANGE, Color.YELLOW, Color.CYAN,
            Color.BLUE
        };

        // Warna 2 planet-planet
        Color[] c2 = new Color[]{new Color(255, 165, 0), Color.BLACK,
            Color.YELLOW, new Color(0, 128, 0), Color.PINK, Color.RED,
            Color.LIGHT_GRAY, Color.BLUE, new Color(0, 0, 139),};

        for (int i = 0; i < x1.length; i++) {
            // Menggambar planet
            GradientPaint gradient = new GradientPaint(x1[i], y1[i], c1[i],
                    x2[i], y2[i], c2[i]);
            g2d.setPaint(gradient);
            g2d.fillOval(x1[i], y1[i], d[i], d[i]);

            // Menggambar nama-nama planet
            Font theFont = new Font("Calibri", Font.PLAIN, 15);
            g2d.setFont(theFont);
            g2d.setColor(Color.WHITE);
            g2d.drawString(String.valueOf(planetNames[i]), x2[i], y2[i]);
        }

        // Menggambar cincin saturnus
        g2d.drawOval(260, 615, 58, 5);
    }

    public void drawGridLine(Graphics2D g2d) {
        for (int i = 0; i < getWidth(); i = i + 30) {
            g2d.drawLine(i, 0, i, getHeight());
            g2d.drawLine(0, i, getWidth(), i);

            Font theFont = new Font("Calibri", Font.PLAIN, 15);
            g2d.setFont(theFont);
            g2d.setColor(Color.WHITE);
            g2d.drawString(String.valueOf(i), i, 10);
            g2d.drawString(String.valueOf(i), 1, i);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistem Tata Surya");
        TataSurya panel = new TataSurya();
        frame.setSize(730, 730); // Lebar, tinggi
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}
