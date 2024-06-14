package pertemuan11;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Contoh extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        this.setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi Komputer Grafik");
        Contoh panel = new Contoh();
        frame.setSize(730, 730); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }

}
