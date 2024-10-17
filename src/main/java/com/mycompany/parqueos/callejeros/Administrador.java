package com.mycompany.parqueos.callejeros;

import java.awt.datatransfer.FlavorListener;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Administrador extends Persona {
    
    //==================== Atributos ====================
    
    private Estacionamiento estacionamiento;
    
    //==================== Metodos ====================
    
    
    public Administrador(String nombre, String apellido, int telefono, String correo, String direccionFisica, String idUsuario,String PIN,Estacionamiento estacionamiento){
        
        super(nombre, apellido, telefono, correo, direccionFisica, idUsuario, PIN);
        this.estacionamiento = estacionamiento; 
    }
    
    public boolean configuracion(String nombre, String inHorario, String fHorario, String pXHora, String tiempMin,
            String costMulta,String inAgreEsp, String fAgreEsp, String inElimEsp,String fElimEsp , JFrame jframe){
        
        int precioXHora,tiempoMinimo,costoMulta,inicioAgregarEspacios,finAgregarEspacios,inicioEliminarEspacios,finEliminarEspacios;
        LocalTime inicioHorario, finHorario;
        
              
        if(estacionamiento != null){
            
            if(!nombre.equals("") && estacionamiento.getNombre() == null){
                estacionamiento.setNombre(nombre);
            }
            
            else if(nombre.equals("") && estacionamiento.getNombre() != null){
                 
            }
            
            else{
                JOptionPane.showMessageDialog(jframe, "Debe insertar el nombre para el parqueo", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            return true;
        }
        
        return false;
    }
    
    public static boolean validarFormatoHora(String timeString, DateTimeFormatter formatter) {
        try {
            // Intenta parsear el String usando el formateador
            LocalTime.parse(timeString, formatter);
            return true;  // Si no lanza excepción, el formato es válido
        } catch (DateTimeParseException e) {
            // Si ocurre una excepción, el formato no es válido
            return false;
        }
    }
    
    
    
}
