package GUI;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

public class Desktop extends JDesktopPane {

    BufferedImage bufferedImage;

    public Desktop() {
        try {
            this.bufferedImage = ImageIO.read(getClass().getResourceAsStream("/assets/fondo.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Desktop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(this.bufferedImage, 90, 180, null);
    } // paintComponent
    
} // class
