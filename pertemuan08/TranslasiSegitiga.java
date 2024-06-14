package pertemuan08;

import java.awt.*;
import javax.swing.JPanel;

public class TranslasiSegitiga extends JPanel {
       
    public TranslasiSegitiga() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.WHITE);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.PINK);
       
        // Menggambar segitiga
        int[] xPoints = { 10, 60, 110 }; // Koordinat x untuk titik-titik segitiga
        int[] yPoints = { 250, 150, 250 }; // Koordinat y untuk titik-titik segitiga
        int nPoints = 3; // Jumlah titik
        
        g2.setColor(Color.RED);
        g2.fillPolygon(xPoints, yPoints, nPoints);
        
        // Menggambar segitiga yang diterjemahkan
        g2.translate(150, 0); // Menggeser posisi
        g2.rotate(Math.toRadians(30), 60, 200); // Memutar segitiga sebesar 30 derajat
        
        g2.setColor(Color.BLUE);
        g2.fillPolygon(xPoints, yPoints, nPoints);
    }
}
