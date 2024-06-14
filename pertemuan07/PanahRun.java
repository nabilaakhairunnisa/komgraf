package pertemuan07;

import javax.swing.JFrame;

public class PanahRun {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Menggambar Polygon - Nabila");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Panah panah = new Panah();
        frame.getContentPane().add(panah);
        frame.pack();
        frame.setVisible(true);
    }
}
