package pertemuan04;

import javax.swing.JFrame;

public class LatGarisRun {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Latihan Membuat Garis - Nabila");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LatGaris panel = new LatGaris();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
