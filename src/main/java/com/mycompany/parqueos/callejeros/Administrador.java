package com.mycompany.parqueos.callejeros;

import java.awt.datatransfer.FlavorListener;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
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
   
    // ==================================================================================================================
    
    public boolean configuracion(String nombre, String inHorario, String fHorario, String pXHora, String tiempMin,
            String costMulta,String inAgreEsp, String fAgreEsp, String inElimEsp,String fElimEsp , JFrame jframe){
        
        int precioXHora,tiempoMinimo,costoMulta,inicioAgregarEspacios,finAgregarEspacios,inicioEliminarEspacios,finEliminarEspacios;
        LocalTime inicioHorario, finHorario;
        
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm").withResolverStyle(ResolverStyle.STRICT);
              
        if(estacionamiento != null){
            
            // Validar nombre del parqueo
            if(!nombre.equals("")){ // Se cambiara el nombre
                estacionamiento.setNombre(nombre);
            }
            
            else if(nombre.equals("") && estacionamiento.getNombre() != null){ //Ya tiene nombre y no se recibio un cambio
                 
            }
            
            else{
                JOptionPane.showMessageDialog(jframe, "Debe insertar el nombre para el parqueo", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            // --------------------------------------------------------------------------------------------------------
            
            //Validar horario

            //Validar inicio del horario
            if(validarFormatoHora(inHorario, formatoHora)){ //Si tiene formato solicitado se convierte a dato clase hora
                
                inicioHorario = LocalTime.parse(inHorario, formatoHora);
            }
            else{
                JOptionPane.showMessageDialog(jframe, "Inicio del horario no tiene un formato de hora valido", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            //Validar fin del horario
            if(validarFormatoHora(fHorario, formatoHora)){ //Si tiene formato solicitado se convierte a dato clase hora
                finHorario = LocalTime.parse(fHorario, formatoHora);
            }
            else{
                JOptionPane.showMessageDialog(jframe, "Fin del horario no tiene un formato de hora valido", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            

            //Validar que el inicio del horario sea antes del final
            if(inicioHorario.isBefore(finHorario)){
                
                LocalTime[] horario = {inicioHorario, finHorario};
                estacionamiento.setHorario(horario);
            }
            else{
                JOptionPane.showMessageDialog(jframe, "El inicio del horario debe ser antes del final", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            // --------------------------------------------------------------------------------------------------------
            
            //Validar precio por hora
            
            if(!pXHora.equals("")){
                precioXHora = Integer.parseInt(pXHora);
                if(precioXHora % 2 == 0){
                   estacionamiento.setPrecioXHora(precioXHora); 
                }
                else{
                    JOptionPane.showMessageDialog(jframe, "El precio por hora debe ser un entero par", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                    return false;
                }
                
            }
            else if(pXHora.equals("" ) && estacionamiento.getPrecioXHora() != 0){
                
            }
            else{
                JOptionPane.showMessageDialog(jframe, "Debe insertar el precio por hora", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            // --------------------------------------------------------------------------------------------------------
            
            //Validar Tiempo min
            
            if(!tiempMin.equals("")){
                tiempoMinimo = Integer.parseInt(tiempMin);
            }
            else if(tiempMin.equals("") && estacionamiento.getTiempoMinimo() != 0){
                
            }
            else{
                JOptionPane.showMessageDialog(jframe, "Debe insertar el tiempo minimo que se puede comprar", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            // --------------------------------------------------------------------------------------------------------
            
            //Validar Costo Multa
            
            if(!costMulta.equals("")){
                costoMulta = Integer.parseInt(costMulta);
                estacionamiento.setCostoMulta(costoMulta);
            }
            else if(costMulta.equals("") && estacionamiento.getCostoMulta() != 0){
                
            }
            else{
                JOptionPane.showMessageDialog(jframe, "Debe insertar el precio de las multas", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
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
