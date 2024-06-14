package pertemuan07;

import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class MerahPutih extends JPanel {
       
    public MerahPutih() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.WHITE);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.PINK);
       
        float dash[] = {10.0f};
        BasicStroke dashed = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, 
        BasicStroke.JOIN_ROUND, 10.0f, dash, 0.0f); 
        
        g2.setStroke ( dashed);
        g2.setColor(new Color(161, 57, 16));
        g2.fill(new Rectangle2D.Double (10, 150, 100, 100)); 
        g2.fill(new RoundRectangle2D.Double (120, 150, 100, 100, 30, 30));

        Ellipse2D lingkaran = new Ellipse2D.Double (10, 270, 100, 100);
        g2.draw(lingkaran);
        
        Ellipse2D oval = new Ellipse2D.Double (130, 270,100, 50);
        g2.draw(oval);
        
        GradientPaint merahPutih = new GradientPaint (3, 3, new Color (161, 57, 16), 
                7, 3, Color.white, true); 
        g2.setPaint (merahPutih);
        
        Arc2D busur = new Arc2D.Double (300, 270, 100, 60, 95, 135, Arc2D.PIE);
        g2.fill(busur);
    }
}
