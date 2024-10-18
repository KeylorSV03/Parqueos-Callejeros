package com.mycompany.parqueos.callejeros;

import java.awt.datatransfer.FlavorListener;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Comparator;
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
        inicioAgregarEspacios = 0;
        finAgregarEspacios = 0;
        inicioEliminarEspacios = 0;
        finEliminarEspacios = 0;
        inicioHorario = estacionamiento.getHorario()[0];
        finHorario = estacionamiento.getHorario()[1];
        
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
            
            if(inHorario.equals("")&& estacionamiento.getHorario()[0] != null){ //Si se dejo en blanco pero ya hay una hora establecida para el inicio del horario
                
            }
            else if(inHorario.equals("") && estacionamiento.getHorario()[0] == null){ //Si se dejo en blanco y no se ha configurado
                JOptionPane.showMessageDialog(jframe, "Debe insertar el inicio del horario", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            else if(!validarFormatoHora(inHorario, formatoHora)){ //Si no tiene el formato solicitado
                JOptionPane.showMessageDialog(jframe, "El inicio del horario no tiene un formato de hora valido", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;  
            }
            
            else {
                inicioHorario = LocalTime.parse(inHorario, formatoHora);
            }
            
            //Validar fin del horario
            
            if(fHorario.equals("")&& estacionamiento.getHorario()[0] != null){ //Si se dejo en blanco pero ya hay una hora establecida para el inicio del horario
                
            }
            else if(fHorario.equals("") && estacionamiento.getHorario()[1] == null){ //Si se dejo en blanco y no se ha configurado
                JOptionPane.showMessageDialog(jframe, "Debe insertar el inicio del horario", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            else if(!validarFormatoHora(fHorario, formatoHora)){ //Si no tiene el formato solicitado
                JOptionPane.showMessageDialog(jframe, "El fin del horario no tiene un formato de hora valido", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;  
            }
            else {
                finHorario = LocalTime.parse(fHorario, formatoHora);
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
            
            
            // --------------------------------------------------------------------------------------------------------
            
            //Validar y agregar espacios del parqueo
            
            if(!inAgreEsp.equals("")){
                inicioAgregarEspacios = Integer.parseInt(inAgreEsp);
            }
            else if(inAgreEsp.equals("") && estacionamiento.getListaEspacios() == null){
                JOptionPane.showMessageDialog(jframe, "Debe deben agregar espacios", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            if(!fAgreEsp.equals("")){
                finAgregarEspacios = Integer.parseInt(fAgreEsp);
            }
            else if(fAgreEsp.equals("") && estacionamiento.getListaEspacios() == null){
                JOptionPane.showMessageDialog(jframe, "Debe deben agregar espacios", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            if(inicioAgregarEspacios > 99999 || finAgregarEspacios > 99999){
                JOptionPane.showMessageDialog(jframe, "Los numeros de espacios pueden ser de maximo 5 digitos", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;
            }

            if(inicioAgregarEspacios > finAgregarEspacios){
                JOptionPane.showMessageDialog(jframe, "En el rango de agregar espacios, el inicio debe ser menor al final", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            //Agregar los espacios
            for(int i = inicioAgregarEspacios; i<= finAgregarEspacios; i++){
                estacionamiento.agregarEspacio(i);
            }
            
            
            //Validar y eliminar espacios
            
            if(!inElimEsp.equals("")){
                inicioEliminarEspacios = Integer.parseInt(inElimEsp);
            }
            else if(!inElimEsp.equals("") && estacionamiento.getListaEspacios() == null){
                JOptionPane.showMessageDialog(jframe, "No se pueden eliminar espacios, ya que no se han agregado", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            if(!fElimEsp.equals("")){
                finAgregarEspacios = Integer.parseInt(fElimEsp);
            }
            else if(!fElimEsp.equals("") && estacionamiento.getListaEspacios() == null){
                JOptionPane.showMessageDialog(jframe, "No se pueden eliminar espacios, ya que no se han agregado", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            

            if(inicioEliminarEspacios > 99999 || finEliminarEspacios > 99999){
                JOptionPane.showMessageDialog(jframe, "Los numeros de espacios pueden ser de maximo 5 digitos", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            if(inicioEliminarEspacios > finEliminarEspacios){
                JOptionPane.showMessageDialog(jframe, "En el rango de eliminar espacios, el inicio debe ser menor al final", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            for(int i = inicioEliminarEspacios; i <= finEliminarEspacios; i++){
                estacionamiento.eliminarEspacio(i);
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
