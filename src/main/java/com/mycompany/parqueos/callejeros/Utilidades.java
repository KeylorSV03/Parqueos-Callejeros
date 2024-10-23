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
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//==================== Clase ==================== \\.

/**
 * Esta clase incluye metodos para manejar componentes de la IU
 * 
 */
public class Utilidades {
    
    public Utilidades(){
        
    }
    
    /**
     * centra el componente
     * @param componente 
     */
    void centrarComponente(Component componente) {
        if (componente instanceof JButton) {
            ((JButton) componente).setAlignmentX(Component.CENTER_ALIGNMENT);
        } else if (componente instanceof JLabel) {
            ((JLabel) componente).setHorizontalAlignment(SwingConstants.CENTER);
        } else if (componente instanceof JPanel) {
            ((JPanel) componente).setLayout(new BoxLayout((JPanel) componente, BoxLayout.Y_AXIS));
            ((JPanel) componente).setAlignmentX(Component.CENTER_ALIGNMENT);
        } else if (componente instanceof JPasswordField) {
            ((JPasswordField) componente).setAlignmentX(Component.CENTER_ALIGNMENT);
        }
    }
    
    /**
     * Carga una imagen a un JPanel
     * @param panel JPanel en el cual se desea insertar una imagen
     * @param ruta Ruta de la imagen la cual se va a insertar
     */
    void cargarImagenPanel(JPanel panel,String ruta){
        JPanelImage mImagen = new JPanelImage(panel,ruta);
        panel.add(mImagen).repaint();
        panel.setOpaque(false);
        panel.setBorder(null);
        panel.setBackground(new Color(0, 0, 0, 0));
    }
    
    /**
     * Limita la cantidad de caracteres que se pueden ingresar en un JTextField
     * @param textField En cual text Field se quiere limitar los caracteres
     * @param maxCaracteres A cuantos caracteres se quiere limitar el text Field
     */
    public void limitarCaracteres(JTextField textField, int maxCaracteres) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (textField.getText().length() >= maxCaracteres) {
                    e.consume(); // Evita que se ingrese más texto
                }
            }
        });
    }
    
    
    /**
     * Limita la cantidad de caracteres que se pueden ingresar en un JPasswordField
     * @param passwordField En cual password field se desea limitar los caracteres
     * @param maxCaracteres A cuantos caracteres se quiere limitar el password field
     */
    public void limitarCaracteres(JPasswordField passwordField, int maxCaracteres) {
    passwordField.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            if (passwordField.getPassword().length >= maxCaracteres) {
                e.consume(); // Evita que se ingrese más texto
            }
        }
    });
    }
    
    /**
     * Hace que en un JTextField solo se puedan insertar numeros
     * @param textField EN cual textField se desea que solo se pueden ingresar numeros 
     */
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
    

    /**
     * Agrega y redimensiona una imagen a un JButton, usa un redimensionado suave para no perder mucha calidad
     * @param boton Boton en el cual se desea insertar la imagen
     * @param ruta La ruta de la imagen que se desea insertar 
     */
    public void cambiarImagenBoton(JButton boton, String ruta) {
        // Cargar la imagen desde los recursos
        ImageIcon icon = new ImageIcon(getClass().getResource(ruta));
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
   
    /**
     * cambia el dato 
     * @param mensaje
     * @return 
     */
    public String cambiarDato (String mensaje){
        
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
