package pertemuan05;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kipas extends JPanel {

    public Kipas() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Membuat gradien
        GradientPaint gradient = new GradientPaint(0, 0,
                Color.BLUE,
                getWidth(),
                getHeight(),
                Color.WHITE);
        g2.setPaint(gradient);
        g2.fillRect(0, 0, getWidth(), getHeight());

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2));
        QuadCurve2D kurva = new QuadCurve2D.Double();
        kurva.setCurve(100, 400, 60, 60, 400, 100);
        g2.draw(kurva);

        g2.drawLine(100, 400, 350, 350);
        g2.drawLine(400, 100, 350, 350);

        QuadCurve2D kurva2 = new QuadCurve2D.Double();
        kurva2.setCurve(250, 370, 250, 250, 370, 250);
        g2.draw(kurva2);

        g2.drawLine(350, 350, 155, 155);
        g2.drawLine(350, 350, 290, 100);
        g2.drawLine(350, 350, 100, 290);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Aplikasi Komputer Grafik Pertama - Nabila");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Kipas panel = new Kipas();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
