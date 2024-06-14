package pertemuan11;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class RumahSpongebob extends JPanel {

    // Konstruktor RumahSpongebob
    public RumahSpongebob() {
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

        // Menggambar rumah SpongeBob (rumah nanas)

        // Mengatur warna untuk rumah nanas
        Color pineappleColor = new Color(255, 165, 0); // Warna oranye untuk nanas
        Color outlineColor = Color.BLACK; // Warna outline hitam
        Color doorColor = new Color(139, 69, 19); // Warna cokelat untuk pintu
        Color windowColor = new Color(135, 206, 250); // Warna biru untuk jendela

        // Menggambar bagian utama rumah (bentuk nanas)
        Ellipse2D.Double houseBody = new Ellipse2D.Double(150, 100, 200, 300);
        g2d.setColor(pineappleColor);
        g2d.fill(houseBody);
        g2d.setColor(outlineColor);
        g2d.draw(houseBody);

        // Menggambar pintu
        Rectangle2D.Double door = new Rectangle2D.Double(230, 300, 40, 100);
        g2d.setColor(doorColor);
        g2d.fill(door);
        g2d.setColor(outlineColor);
        g2d.draw(door);

        // Menggambar jendela
        Ellipse2D.Double window = new Ellipse2D.Double(200, 150, 60, 60);
        g2d.setColor(windowColor);
        g2d.fill(window);
        g2d.setColor(outlineColor);
        g2d.draw(window);

        // Menggambar garis di jendela
        g2d.setColor(outlineColor);
        g2d.drawLine(230, 150, 230, 210);
        g2d.drawLine(200, 180, 260, 180);

        // Menggambar daun di atas rumah nanas
        g2d.setColor(new Color(34, 139, 34)); // Warna hijau daun
        int[] xLeafPoints = {250, 270, 230};
        int[] yLeafPoints = {50, 120, 120};
        Polygon leaf = new Polygon(xLeafPoints, yLeafPoints, xLeafPoints.length);
        g2d.fill(leaf);
        g2d.setColor(outlineColor);
        g2d.draw(leaf);

        int[] xLeafPoints2 = {270, 290, 250};
        int[] yLeafPoints2 = {40, 110, 110};
        Polygon leaf2 = new Polygon(xLeafPoints2, yLeafPoints2, xLeafPoints2.length);
        g2d.fill(leaf2);
        g2d.setColor(outlineColor);
        g2d.draw(leaf2);
    }

    // Metode main untuk menjalankan program
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rumah SpongeBob");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new RumahSpongebob());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
