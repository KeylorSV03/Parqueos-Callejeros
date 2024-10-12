package com.mycompany.parqueos.callejeros;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class BotonImagen extends JButton {
    
    public BotonImagen(JButton Boton,String nombreArchivo) {
        // Cargar la imagen desde los recursos
        ImageIcon icono = new ImageIcon(getClass().getResource(nombreArchivo));
        
        
        this.setIcon(icono);
        this.setText(""); // Si no deseas texto en el botón, puedes dejarlo vacío o poner algo aquí
        this.setFocusPainted(false); // Opcional: quita el borde del foco
        this.setContentAreaFilled(false); // Opcional: quita el fondo del botón
        this.setBorderPainted(false); // Opcional: quita el borde del botón
        this.setRolloverIcon(icono); // Si deseas un efecto al pasar el mouse, puedes configurar una imagen diferente aquí
    }
}
