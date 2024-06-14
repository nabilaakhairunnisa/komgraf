package pertemuan11;

import java.awt.*;
import javax.swing.*;

public class SolarSystem extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Konversi ke Graphics2D untuk kontrol yang lebih baik
        Graphics2D g2d = (Graphics2D) g;

        // Mengaktifkan anti-aliasing
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Mengatur warna latar belakang menjadi hitam
        this.setBackground(Color.BLACK);

        // Menggambar bintang-bintang
        drawStars(g2d);

        // Menggambar Matahari di pusat dengan warna gradasi
        int centerX = getWidth() / 2; 
        int centerY = getHeight() / 2;
        drawGradientCircle(g2d, centerX, centerY, 140, Color.YELLOW , new Color(255, 165, 0)); 

        // Menggambar orbit dan planet secara statis
        int[] orbits = {95, 120, 140, 170, 190, 230, 270, 320}; // Jari-jari orbit
        int[] planetSizes = {20, 25, 25, 24, 37, 35, 30, 31}; // Diameter planet
        String[] planetNames = {"Merkurius", "Venus", "Bumi", "Mars", "Jupiter", "Saturnus", "Uranus", "Neptunus"}; // Nama-nama planet
 
        for (int i = 0; i < orbits.length; i++) {
            int orbitRadius = orbits[i];
            int planetDiameter = planetSizes[i];

            // Menghitung posisi planet secara statis
            double angle = Math.toRadians(45 + i * 45); // Sudut tetap untuk posisi statis
            int planetX = centerX + (int) (Math.cos(angle) * orbitRadius) - planetDiameter / 2;
            int planetY = centerY + (int) (Math.sin(angle) * orbitRadius) - planetDiameter / 2;

            // Menggambar orbit
            drawOrbit(g2d, centerX, centerY, orbitRadius);

            // Menggambar planet dengan gradasi warna
            drawGradientPlanet(g2d, i, planetX, planetY, planetDiameter, planetDiameter, planetNames[i]);
        }
    }

    // Fungsi untuk menggambar bintang
    private void drawStars(Graphics g) {
        g.setColor(Color.WHITE);
        int numStars = 200; // Jumlah bintang
        for (int i = 0; i < numStars; i++) {
            int x = (int) (Math.random() * getWidth());
            int y = (int) (Math.random() * getHeight());
            g.fillOval(x, y, 2, 2); // Menggambar bintang kecil
        }
    }

    // Fungsi untuk menggambar orbit
    private void drawOrbit(Graphics2D g2d, int centerX, int centerY, int radius) {
        g2d.setColor(Color.WHITE);
        g2d.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
    }

    // Fungsi untuk menggambar planet dengan gradasi warna
    private void drawGradientPlanet(Graphics2D g2d, int index, int x, int y, int width, int height, String name) {
        Color[] colors = getPlanetColors(index);
        GradientPaint gradient = new GradientPaint(x, y, colors[0], x + width, y + height, colors[1]);
        g2d.setPaint(gradient);
        g2d.fillOval(x, y, width, height);

        // Menggambar cincin untuk Saturnus
        if (index == 5) {
            drawSaturnRings(g2d, x, y, width, height);
        }

        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Arial", Font.PLAIN, 12));
        g2d.drawString(name, x + width / 2 - g2d.getFontMetrics().stringWidth(name) / 2, y + height + 15); // Menambahkan nama planet
    }

    // Fungsi untuk mendapatkan warna planet berdasarkan indeks
    private Color[] getPlanetColors(int index) {
        switch (index) {
            case 0:
                return new Color[]{Color.GRAY, Color.DARK_GRAY}; // Merkurius
            case 1:
                return new Color[]{Color.ORANGE, Color.YELLOW}; // Venus
            case 2:
                return new Color[]{Color.BLUE, new Color(0, 128, 0)}; // Bumi (biru ke hijau)
            case 3:
                return new Color[]{Color.RED, Color.PINK}; // Mars
            case 4:
                return new Color[]{Color.ORANGE, Color.RED}; // Jupiter
            case 5:
                return new Color[]{Color.YELLOW, Color.LIGHT_GRAY}; // Saturnus
            case 6:
                return new Color[]{Color.CYAN, Color.BLUE}; // Uranus
            case 7:
                return new Color[]{Color.BLUE, new Color(0, 0, 139)}; // Neptunus (biru ke biru tua)
            default:
                return new Color[]{Color.WHITE, Color.LIGHT_GRAY};
        }
    }

    // Fungsi untuk menggambar cincin Saturnus
    private void drawSaturnRings(Graphics2D g2d, int x, int y, int width, int height) {
        int ringWidth = width + 10;
        int ringHeight = height / 2;
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.drawOval(x - (ringWidth - width) / 2, y + height / 4 - ringHeight / 2, ringWidth, ringHeight);
        g2d.drawOval(x - (ringWidth - width) / 2, y + height / 4 - ringHeight / 4, ringWidth, ringHeight / 2);
    }

    // Fungsi untuk menggambar lingkaran gradasi (Matahari)
    private void drawGradientCircle(Graphics2D g2d, int x, int y, int d, Color c1, Color c2) {
        GradientPaint gradient = new GradientPaint(x - d / 2, y, c1, x + d / 2, y, c2);
        g2d.setPaint(gradient);
        g2d.fillOval(x - d / 2, y - d / 2, d, d);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistem Tata Surya");
        SolarSystem panel = new SolarSystem();
        frame.setSize(730, 730); // Lebar, tinggi
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}
