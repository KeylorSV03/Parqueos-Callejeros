package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

//==================== Clase ==================== \\.

/**
 * 
 * @author ariel
 */
public class JPanelImage extends JLabel{ // Se encarga de poner imagenes
    
    // Atributos
    private int x, y;
    private final String path;
    
    // Constructor
    public JPanelImage(JPanel panel, String path) {
        this.path = path;
        this.x = panel.getWidth();
        this.y = panel.getHeight();
        this.setSize(x, y);
    }
    
    // Metodos
    @Override
    public void paint(Graphics g) {
        ImageIcon img = new ImageIcon(getClass().getResource(path));
        g.drawImage(img.getImage(), 0, 0, x, y, null);

    }
}
