package pertemuan07;

import java.awt.*;
import javax.swing.JPanel;

public class Panah extends JPanel {
       
    public Panah() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.WHITE);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.PINK);
       
        Polygon panah = new Polygon();
        panah.addPoint(50, 100); 
        panah.addPoint(100, 100);
        panah.addPoint(100, 75);
        panah.addPoint (150, 125);
        panah.addPoint(100, 175); 
        panah.addPoint(100, 150);
        panah.addPoint(50, 150);
        g2.fill(panah);
    }
}
