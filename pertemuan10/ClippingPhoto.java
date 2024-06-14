package pertemuan10;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

// Mendefinisikan kelas ClippingPhoto 
// yang merupakan turunan dari JPanel
public class ClippingPhoto extends JPanel {
    
    // Konstruktor ClippingPhoto
    public ClippingPhoto(){
        // Mengatur ukuran preferensi panel menjadi 730x400 piksel
        this.setPreferredSize(new Dimension(730, 400));
        // Mengatur warna latar belakang panel menjadi putih
        this.setBackground(Color.WHITE);
    }
    
    // Override method paintComponent untuk menggambar di panel
    @Override
    public void paintComponent(Graphics g) {
        // Memanggil method superclass untuk memastikan komponen digambar dengan benar
        super.paintComponent(g);
        // Mengkonversi objek Graphics ke Graphics2D untuk fitur grafis yang lebih canggih
        Graphics2D g2 = (Graphics2D) g;
        
        try {
            // Membaca gambar dari file
            BufferedImage img = ImageIO.read(new File ("C:\\Users\\nabil\\input.jpg"));
            // Membuat bentuk elips untuk clipping
            Shape lingkaran = new Ellipse2D.Double(30,30, 250,250);
            // Menerapkan clipping dengan bentuk elips
            g2.clip(lingkaran);
            
            // Mengatur font untuk teks
            Font theFont = new Font ("Calibri", Font.ITALIC, 34);
            // Mengatur font untuk objek g2
            g2.setFont(theFont);
            // Mengatur warna teks menjadi hitam
            g2.setColor(Color.BLACK);
            
            
            // Menggambar gambar yang di-clip pada posisi (10, 10) dengan ukuran 400x300
            g2.drawImage(img, 10, 10, 400, 300, null);
            // Menghapus clipping
            g2.setClip(null);
            // Menggambar teks "Clipping: City" pada posisi (50, 350)
            g2.drawString("Clipping: City", 50, 350);
            
            // Menggambar gambar asli tanpa clipping pada posisi (300, 10) dengan ukuran 400x300
            g2.drawImage(img, 300, 10, 400, 300, null);
            // Menggambar teks "Gambar Asli: City" pada posisi (400, 350)
            g2.drawString("Gambar Asli: City", 400, 350);
        } catch (Exception e) {
            // Menangani pengecualian dengan mencetak stack trace
            e.printStackTrace(); 
        }
    }
}
