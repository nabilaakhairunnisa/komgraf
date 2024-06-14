package pertemuan07;

import javax.swing.JFrame;

public class MobilRun {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Aplikasi Komputer Grafik Pertama - Nabila");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Mobil panel = new Mobil();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
