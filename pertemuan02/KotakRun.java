package pertemuan02;

import javax.swing.JFrame;

public class KotakRun {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Aplikasi Komputer Grafik Pertama - Nabila");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Kotak panel = new Kotak();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
