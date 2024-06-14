package pertemuan04;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.JPanel;

public class LatGaris extends JPanel {
   
    public LatGaris() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.WHITE);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        //segitiga siku-siku
        Point2D.Double titik1 = new Point2D.Double(40, 10);
        Point2D.Double titik2 = new Point2D.Double(40, 110);
        Line2D.Double garis1 = new Line2D.Double(titik1, titik2); 
        g2.draw(garis1); //garis  lurus
        g2.drawLine(40, 110, 140, 110); //garis bawah
        g2.drawLine(40, 10, 140, 110); //garis miring
        
        //segitiga sama kaki
        g2.drawLine(160, 110, 260, 110); //sisi bawah
        g2.drawLine(210, 10, 260, 110); //sisi kiri
        g2.drawLine(210, 10, 160, 110);//sisi kanan
        
        //Quad Curve
        g2.setColor(Color.BLUE);
        QuadCurve2D kurva1 = new QuadCurve2D.Double();
        kurva1.setCurve(10,150,60,250,110,150);
        g2.fill(kurva1);
        
        //Cubic Curve
        g2.setColor(Color.ORANGE);
        CubicCurve2D kurva2 = new CubicCurve2D.Double();
        kurva2.setCurve(110,150,170,250,
                220,100,270,200);
        g2.fill(kurva2);
        
        //rectangle
        g2.setColor(Color.PINK);
        g2.fill(new Rectangle2D.Double(280,100,100,100));
        
        //round rectangle
        g2.setColor(Color.MAGENTA);
        g2.fill(new RoundRectangle2D.Double(10,220,100,100,30,30));
        
        //elipse
        g2.setColor(Color.cyan);
        Ellipse2D lingkaran = new Ellipse2D.Double(130,200,100,100);
        g2.fill(lingkaran);
        
        //oval
        g2.setColor(Color.lightGray);
        Ellipse2D oval = new Ellipse2D.Double(240,240,100,50);
        g2.fill(oval);
        
        //busur
        g2.setColor(Color.GREEN);
        Arc2D busur = new Arc2D.Double(350,240,100,100,95,135,Arc2D.PIE);
        g2.fill(busur);
    }
}


