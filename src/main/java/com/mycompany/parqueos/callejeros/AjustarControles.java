package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//==================== Clase ==================== \\.

public class AjustarControles {
    
    public AjustarControles(){
        
    }
    
    void centrarBoton(JButton boton) {
        boton.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
  
    void centrarLabel(JLabel label){
         label.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
    
    void centrarTextField(JTextField texto){
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
    
    void centrarPassField(JPasswordField texto){
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
    
    void cargarImagenPanel(JPanel panel,String nombreArchivo){
        JPanelImage mImagen = new JPanelImage(panel,nombreArchivo);
        panel.add(mImagen).repaint();
        panel.setOpaque(false);
        panel.setBorder(null);
        panel.setBackground(new Color(0, 0, 0, 0));
    }
    
     // Método para limitar la cantidad de caracteres en un JTextField
    public void limitarCaracteres(JTextField campo, int maxCaracteres) {
        campo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (campo.getText().length() >= maxCaracteres) {
                    e.consume(); // Evita que se ingrese más texto
                }
            }
        });
    }
    
    public void limitarCaracteres(JPasswordField campo, int maxCaracteres) {
    campo.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            if (campo.getPassword().length >= maxCaracteres) {
                e.consume(); // Evita que se ingrese más texto
            }
        }
    });
    }
    
    public void soloNumeros(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                // Permitir solo números (0-9)
                if (!Character.isDigit(c)) {
                    e.consume(); // Consume la tecla y no permite que se ingrese
                }
            }
        });
    }
    
    public Icon BotonImagen(JButton boton, String imagen) {
    // Cargar la imagen desde los recursos
    ImageIcon icon = new ImageIcon(getClass().getResource(imagen));
    
    // Obtener las dimensiones del botón
    int ancho = boton.getWidth();
    int alto = boton.getHeight();
    
    // Si el tamaño del botón aún no está definido, usar las dimensiones de la imagen original
    if (ancho == 0 || alto == 0) {
        ancho = icon.getIconWidth();
        alto = icon.getIconHeight();
    }

    // Escalar la imagen utilizando Image.SCALE_AREA_AVERAGING
    // Esta opción intenta suavizar el escalado para evitar la pérdida de calidad
    Image img = icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_AREA_AVERAGING);
    
    // Crear el ImageIcon con la imagen escalada
    ImageIcon icono = new ImageIcon(img);
    
    // Eliminar el fondo del botón
    boton.setOpaque(false);
    boton.setContentAreaFilled(false); // Hace que el área del contenido no tenga fondo
    boton.setBorderPainted(false); // Elimina el borde del botón
    
    return icono;
    
    }
    
    public void cambiarImagenBoton(JButton boton, String rutaImagen) {
        // Cargar la imagen desde los recursos
        ImageIcon icon = new ImageIcon(getClass().getResource(rutaImagen));
        Image imgOriginal = icon.getImage();
        
        // Obtener las dimensiones del botón
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        
        // Si las dimensiones del botón no están definidas, usar las dimensiones de la imagen original
        if (ancho == 0 || alto == 0) {
            ancho = icon.getIconWidth();
            alto = icon.getIconHeight();
        }

        // Redimensionar la imagen utilizando BufferedImage para mayor control
        BufferedImage imagenRedimensionada = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = imagenRedimensionada.createGraphics();
        
        // Establecer un buen filtro de escalado para obtener la mejor calidad posible
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // Mejorar los bordes
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON); // Suavizar texto si es necesario
        g.drawImage(imgOriginal, 0, 0, ancho, alto, null);
        g.dispose();
        
        // Convertir la imagen redimensionada en un ImageIcon
        ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);
        
        // Cambiar la imagen del botón
        boton.setIcon(iconoRedimensionado);
        
        // Eliminar el fondo y bordes del botón
        boton.setOpaque(false);
        boton.setContentAreaFilled(false);
        boton.setBorderPainted(false);
    }
   
    public String cambiarDato (JButton boton, String mensaje){
        String input = JOptionPane.showInputDialog(mensaje);
        if (input == null){
            return "";
        }
        if (input.length() > 0){
            return input;
        }
        return null;
    } 
}
