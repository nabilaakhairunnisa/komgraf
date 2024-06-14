package uts;

import uts.UTS;
import javax.swing.JFrame;

public class RunUTS {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Menggambar Polygon - Nabila");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        UTS panah = new UTS();
        frame.getContentPane().add(panah);
        frame.pack();
        frame.setVisible(true);
    }
}
