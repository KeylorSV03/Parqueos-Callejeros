package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
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
}
