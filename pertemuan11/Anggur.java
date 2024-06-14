package pertemuan11;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Anggur extends JPanel {

    // Konstruktor Anggur
    public Anggur() {
        // Mengatur ukuran preferensi panel 
        this.setPreferredSize(new Dimension(500, 500));
        // Mengatur warna latar belakang panel menjadi putih
        this.setBackground(Color.WHITE);
    }

    // Metode ini akan dipanggil untuk menggambar komponen
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Memanggil metode superclass untuk memastikan panel digambar dengan benar
        Graphics2D g2d = (Graphics2D) g; // Mengubah tipe objek Graphics menjadi Graphics2D untuk fitur grafis yang lebih canggih

        // Mengaktifkan antialiasing
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Mengatur warna untuk anggur
        Color grapeColor = new Color(128, 0, 128); // Warna ungu anggur
        Color outlineColor = Color.BLACK; // Warna outline hitam

        // Menggambar buah anggur menggunakan Ellipse2D
        int[][] grapes = {
            {200, 200}, {220, 220}, {240, 240}, {260, 260}, {280, 280},
            {220, 180}, {240, 200}, {260, 220}, {280, 240}, {300, 260},
            {240, 160}, {260, 180}, {280, 200}, {300, 220}, {320, 240}
        };
        
        for (int[] grape : grapes) {
            Ellipse2D.Double ellipse = new Ellipse2D.Double(grape[0], grape[1], 40, 40);
            g2d.setColor(grapeColor);
            g2d.fill(ellipse); // Mengisi warna anggur
            g2d.setColor(outlineColor);
            g2d.draw(ellipse); // Menggambar outline anggur
        }

        // Mengatur warna untuk tangkai anggur
        g2d.setColor(new Color(139, 69, 19)); // Warna cokelat tangkai
        g2d.setStroke(new BasicStroke(3));
        g2d.draw(new Line2D.Double(250, 160, 270, 100));
        g2d.draw(new Line2D.Double(270, 100, 290, 120));
        g2d.draw(new Line2D.Double(290, 120, 310, 80));

        // Menggambar beberapa daun di tangkai
        g2d.setColor(new Color(34, 139, 34)); // Warna hijau daun

        // Membuat bentuk daun yang lebih realistis menggunakan Polygon
        int[] xPoints1 = {250, 260, 280, 270, 260, 240};
        int[] yPoints1 = {100, 80, 90, 110, 130, 120};
        Polygon leaf1 = new Polygon(xPoints1, yPoints1, xPoints1.length);

        int[] xPoints2 = {300, 310, 330, 320, 310, 290};
        int[] yPoints2 = {100, 80, 90, 110, 130, 120};
        Polygon leaf2 = new Polygon(xPoints2, yPoints2, xPoints2.length);

        g2d.fill(leaf1);
        g2d.fill(leaf2);

        // Menggambar outline daun
        g2d.setColor(outlineColor);
        g2d.draw(leaf1);
        g2d.draw(leaf2);
    }

    // Metode main untuk menjalankan program
    public static void main(String[] args) {
        JFrame frame = new JFrame("Antialiasing Grapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Anggur());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
