package pertemuan11;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Spongebob extends JPanel {

    // Konstruktor Spongebob
    public Spongebob() {
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

        // Mengatur warna untuk SpongeBob
        Color bodyColor = new Color(255, 255, 0); // Warna kuning untuk tubuh
        Color outlineColor = Color.BLACK; // Warna outline hitam
        Color eyeColor = Color.WHITE; // Warna putih untuk mata
        Color pupilColor = Color.BLUE; // Warna biru untuk pupil
        Color mouthColor = Color.RED; // Warna merah untuk mulut
        Color tieColor = Color.RED; // Warna merah untuk dasi
        Color pantsColor = new Color(139, 69, 19); // Warna cokelat untuk celana
        Color shoeColor = Color.BLACK; // Warna hitam untuk sepatu

        // Menggambar tubuh SpongeBob
        Rectangle2D.Double body = new Rectangle2D.Double(150, 100, 200, 300);
        g2d.setColor(bodyColor);
        g2d.fill(body);
        g2d.setColor(outlineColor);
        g2d.draw(body);

        // Menggambar celana
        Rectangle2D.Double pants = new Rectangle2D.Double(150, 300, 200, 100);
        g2d.setColor(pantsColor);
        g2d.fill(pants);
        g2d.setColor(outlineColor);
        g2d.draw(pants);

        // Menggambar mata
        Ellipse2D.Double leftEye = new Ellipse2D.Double(190, 150, 40, 40);
        Ellipse2D.Double rightEye = new Ellipse2D.Double(270, 150, 40, 40);
        g2d.setColor(eyeColor);
        g2d.fill(leftEye);
        g2d.fill(rightEye);
        g2d.setColor(outlineColor);
        g2d.draw(leftEye);
        g2d.draw(rightEye);

        // Menggambar pupil
        Ellipse2D.Double leftPupil = new Ellipse2D.Double(205, 165, 10, 10);
        Ellipse2D.Double rightPupil = new Ellipse2D.Double(285, 165, 10, 10);
        g2d.setColor(pupilColor);
        g2d.fill(leftPupil);
        g2d.fill(rightPupil);
        g2d.setColor(outlineColor);
        g2d.draw(leftPupil);
        g2d.draw(rightPupil);

        // Menggambar mulut
        g2d.setColor(mouthColor);
        g2d.drawArc(200, 230, 100, 50, 0, -180);

        // Menggambar dasi
        Polygon tie = new Polygon();
        tie.addPoint(250, 300);
        tie.addPoint(240, 350);
        tie.addPoint(260, 350);
        g2d.setColor(tieColor);
        g2d.fill(tie);
        g2d.setColor(outlineColor);
        g2d.draw(tie);

        // Menggambar kaki
        Line2D.Double leftLeg = new Line2D.Double(200, 400, 200, 450);
        Line2D.Double rightLeg = new Line2D.Double(300, 400, 300, 450);
        g2d.setColor(outlineColor);
        g2d.draw(leftLeg);
        g2d.draw(rightLeg);

        // Menggambar sepatu
        Ellipse2D.Double leftShoe = new Ellipse2D.Double(190, 450, 20, 10);
        Ellipse2D.Double rightShoe = new Ellipse2D.Double(290, 450, 20, 10);
        g2d.setColor(shoeColor);
        g2d.fill(leftShoe);
        g2d.fill(rightShoe);
        g2d.setColor(outlineColor);
        g2d.draw(leftShoe);
        g2d.draw(rightShoe);

        // Menggambar lengan
        Line2D.Double leftArm = new Line2D.Double(150, 200, 100, 250);
        Line2D.Double rightArm = new Line2D.Double(350, 200, 400, 250);
        g2d.setColor(outlineColor);
        g2d.draw(leftArm);
        g2d.draw(rightArm);

        // Menggambar tangan
        Ellipse2D.Double leftHand = new Ellipse2D.Double(90, 240, 20, 20);
        Ellipse2D.Double rightHand = new Ellipse2D.Double(390, 240, 20, 20);
        g2d.setColor(bodyColor);
        g2d.fill(leftHand);
        g2d.fill(rightHand);
        g2d.setColor(outlineColor);
        g2d.draw(leftHand);
        g2d.draw(rightHand);
    }

    // Metode main untuk menjalankan program
    public static void main(String[] args) {
        JFrame frame = new JFrame("Spongebob");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Spongebob());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
