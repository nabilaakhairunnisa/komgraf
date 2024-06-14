package pertemuan08;

import javax.swing.JFrame;

public class TranslasiSegitigaRun {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Translasi Segitiga - Nabila");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TranslasiSegitiga panah = new TranslasiSegitiga();
        frame.getContentPane().add(panah);
        frame.pack();
        frame.setVisible(true);
    }
}
