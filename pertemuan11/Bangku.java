package pertemuan11;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Bangku extends JPanel {

    // Konstruktor Bangku
    public Bangku() {
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

        // Mengatur warna untuk bangku
        Color seatColor = new Color(139, 69, 19); // Warna cokelat untuk dudukan dan sandaran
        Color legColor = Color.BLACK; // Warna hitam untuk kaki bangku
        Color outlineColor = Color.BLACK; // Warna outline hitam

        // Menggambar dudukan bangku
        Rectangle2D.Double seat = new Rectangle2D.Double(150, 200, 200, 40);
        g2d.setColor(seatColor);
        g2d.fill(seat);
        g2d.setColor(outlineColor);
        g2d.draw(seat);

        // Menggambar sandaran bangku
        Rectangle2D.Double backrest = new Rectangle2D.Double(150, 160, 200, 40);
        g2d.setColor(seatColor);
        g2d.fill(backrest);
        g2d.setColor(outlineColor);
        g2d.draw(backrest);

        // Menggambar kaki bangku
        g2d.setColor(legColor);
        g2d.drawLine(150, 240, 150, 300); // Kaki kiri depan
        g2d.drawLine(350, 240, 350, 300); // Kaki kanan depan
        g2d.drawLine(150, 200, 150, 260); // Kaki kiri belakang
        g2d.drawLine(350, 200, 350, 260); // Kaki kanan belakang
    }

    // Metode main untuk menjalankan program
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bangku");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Bangku());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
