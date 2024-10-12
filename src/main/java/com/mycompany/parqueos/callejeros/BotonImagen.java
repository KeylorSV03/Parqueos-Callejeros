
package com.mycompany.parqueos.callejeros;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class BotonImagen {
    
    public void BotonImagen(JButton Boton,String nombreArchivo) {
        // Cargar la imagen desde los recursos
        ImageIcon icono = new ImageIcon(getClass().getResource(nombreArchivo));
        
        
        Boton.setIcon(icono);
        Boton.setText(""); 
        Boton.setFocusPainted(false); 
        Boton.setContentAreaFilled(false); 
        Boton.setBorderPainted(false); 
        Boton.setRolloverIcon(icono); // Un efecto al pasar el mouse
    }
}
