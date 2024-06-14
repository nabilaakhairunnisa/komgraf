package uts;

import java.awt.*;
import javax.swing.JPanel;

public class UTS extends JPanel {
       
    public UTS() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.WHITE);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        
        int Xa = 10;
        int Ya = 10;
        
        int Xb = 200;
        int Yb = 10;
        
        int Xc = 10;
        int Yc = 100;
        
        int Xd = 200;
       
        g2.drawLine(Xa, Ya, Xb, Yb);
    }
}
