package pertemuan07;

import java.awt.*;
import java.awt.geom.GeneralPath;
import javax.swing.JPanel;

public class Mobil extends JPanel {
       
    public Mobil() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.WHITE);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.GREEN);
        
        GeneralPath gp = new GeneralPath();
        gp.moveTo(60,120);
        gp.lineTo(80,120);
        gp.quadTo(90,140,100,120);
        gp.lineTo (160,120);
        gp.quadTo(170,140,180,120);
        gp.lineTo(200,120);
        gp.curveTo(195,100, 200,80,160,80);
        gp.lineTo(110,80);
        gp.lineTo(90,100);
        gp.lineTo(60,100);
        gp.lineTo(60,120);
        g2.fill(gp);
    }
}
