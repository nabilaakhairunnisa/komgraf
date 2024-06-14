package pertemuan08;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class TransLasi extends JPanel {
       
    public TransLasi() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.WHITE);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.PINK);
       
        g2.setColor(Color.RED);
        g2.fill(new Rectangle2D.Double(10,150,100,100));
        g2.translate(10, 100);
        g2.rotate(30,30,50);
        g2.fill(new RoundRectangle2D.Double(120,150,100,100,30,30));
    }
}
