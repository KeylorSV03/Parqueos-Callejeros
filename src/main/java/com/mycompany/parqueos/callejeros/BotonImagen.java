package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import javax.swing.ImageIcon;
import javax.swing.JButton;

//==================== Clase ==================== \\.

public class BotonImagen { // Se encarga de poner imagen al boton
    
    // Constructor
    /**
     * Ajusta una imagen a un boton 
     * @param Boton a modificar
     * @param nombreArchivo imagen 
     */
    public void BotonImagen(JButton Boton,String nombreArchivo) {
        // Cargar la imagen desde los recursos:
        ImageIcon icono = new ImageIcon(getClass().getResource(nombreArchivo));
        
        // Confi del boton:
        Boton.setIcon(icono);
        Boton.setText(""); 
        Boton.setFocusPainted(false); 
        Boton.setContentAreaFilled(false); 
        Boton.setBorderPainted(false); 
    }
}
