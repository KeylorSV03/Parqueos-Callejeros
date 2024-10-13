package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
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
}
