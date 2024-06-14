package pertemuan07;

import javax.swing.JFrame;

public class MerahPutihRun {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Aplikasi Merah Putih - Nabila");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MerahPutih panel = new MerahPutih();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
