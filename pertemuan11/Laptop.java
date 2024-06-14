package pertemuan11;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Laptop extends JPanel {

    // Konstruktor AntialiasingJava
    public Laptop() {
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

        // Mengatur warna untuk laptop
        Color laptopColor = new Color(169, 169, 169); // Warna abu-abu untuk laptop
        Color screenColor = new Color(0, 0, 0); // Warna hitam untuk layar
        Color outlineColor = Color.BLACK; // Warna outline hitam

        // Menggambar bagian layar laptop
        Rectangle2D.Double screen = new Rectangle2D.Double(100, 100, 300, 200);
        g2d.setColor(laptopColor);
        g2d.fill(screen);
        g2d.setColor(outlineColor);
        g2d.draw(screen);

        // Menggambar layar laptop
        Rectangle2D.Double innerScreen = new Rectangle2D.Double(110, 110, 280, 180);
        g2d.setColor(screenColor);
        g2d.fill(innerScreen);

        // Menggambar bagian keyboard laptop
        Rectangle2D.Double keyboardBase = new Rectangle2D.Double(80, 300, 340, 50);
        g2d.setColor(laptopColor);
        g2d.fill(keyboardBase);
        g2d.setColor(outlineColor);
        g2d.draw(keyboardBase);

        // Menggambar beberapa tombol di keyboard
        g2d.setColor(outlineColor);
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 10; col++) {
                g2d.drawRect(90 + col * 30, 310 + row * 10, 25, 8);
            }
        }

        // Menggambar trackpad
        Rectangle2D.Double trackpad = new Rectangle2D.Double(230, 350, 60, 30);
        g2d.setColor(laptopColor);
        g2d.fill(trackpad);
        g2d.setColor(outlineColor);
        g2d.draw(trackpad);
    }

    // Metode main untuk menjalankan program
    public static void main(String[] args) {
        JFrame frame = new JFrame("Antialiasing Laptop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Laptop());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
