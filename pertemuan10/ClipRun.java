package pertemuan10;

import javax.swing.JFrame;

public class ClipRun {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Aplikasi Clipping Photo - Nabila");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ClippingPhoto panel = new ClippingPhoto();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}