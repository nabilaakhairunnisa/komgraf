package pertemuan02;

import java.awt.*;
import javax.swing.JPanel;

public class Kotak extends JPanel {
    
    public Kotak() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.ORANGE);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(10, 10, 100, 100);
        g2.drawString("Kotak Pertama - Nabila", 10, 130);
    }
    
}
