package pertemuan09;

import javax.swing.JFrame;
import javax.swing.Timer;

public class DilatasiRun {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Dilatasi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dilatasi dilatasi = new Dilatasi();
        frame.getContentPane().add(dilatasi);
        frame.pack();
        frame.setVisible(true);

        // Example to change dilation and shear after a few seconds
        new Timer(2000, e -> {
            dilatasi.setScale(1.5, 1.5); // Dilate by a factor of 1.5
        }).start();

        new Timer(4000, e -> {
            dilatasi.setShear(0.5, 0.0); // Shear along x-axis by 0.5
        }).start();
    }
}