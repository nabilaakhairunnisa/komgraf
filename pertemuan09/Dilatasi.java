package pertemuan09;

import java.awt.*;
import java.awt.geom.AffineTransform;
import javax.swing.JPanel;

public class Dilatasi extends JPanel {
    
    private double scaleX = 1.0, scaleY = 1.0; // Faktor untuk dilatasi
    private double shearX = 0.0, shearY = 0.0; // Faktor untuk shear
       
    public Dilatasi() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.WHITE);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.PINK);

        // Setup transformation
        AffineTransform transform = new AffineTransform();
        transform.scale(scaleX, scaleY); // Apply dilation
        transform.shear(shearX, shearY); // Apply shear

        // Apply the transformation to the Graphics2D object
        g2.setTransform(transform);

        // Draw a rectangle (initially a square) before transformation
        g2.fillRect(100, 100, 100, 100); 

        // Reset transformation to draw the original square for reference
        g2.setTransform(new AffineTransform());
        g2.setColor(Color.RED);
        g2.drawRect(100, 100, 100, 100); // Original square outline
    }

    // Methods to update the transformation factors
    public void setScale(double scaleX, double scaleY) {
        this.scaleX = scaleX;
        this.scaleY = scaleY;
        repaint();
    }

    public void setShear(double shearX, double shearY) {
        this.shearX = shearX;
        this.shearY = shearY;
        repaint();
    }
}
