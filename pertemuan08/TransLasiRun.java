package pertemuan08;

import javax.swing.JFrame;

public class TransLasiRun {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Translasi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TransLasi tr = new TransLasi();
        frame.getContentPane().add(tr);
        frame.pack();
        frame.setVisible(true);
    }
}
