package com.mycompany.parqueos.callejeros;

import java.time.LocalDateTime;

public class Administrador extends Persona {
    
    //==================== Atributos ====================
    
    Estacionamiento estacionamiento;
    
    //==================== Metodos ====================
    
    
    public Administrador(String nombre, String apellido, int telefono, String correo, String direccionFisica, String idUsuario,String PIN,Estacionamiento estacionamiento){
        
        super(nombre, apellido, telefono, correo, direccionFisica, PIN, idUsuario);
        this.estacionamiento = estacionamiento; 
    }
    
    public void configuracion(String nombre, int precioXHora,LocalDateTime tiempoMinimo, int costoMulta,int cantidadEspacios, LocalDateTime[] horario){
        
        if(estacionamiento != null){
            
            if(!nombre.equals("")){
                estacionamiento.setNombre(nombre);
            }
            
            if(precioXHora != 0){
                estacionamiento.setPrecioXHora(precioXHora);
            }
            
            if(costoMulta != 0){
                estacionamiento.setCostoMulta(costoMulta);
            }
            
            if(cantidadEspacios!=0){
                estacionamiento.setCantidadEspacios(cantidadEspacios);
            }
            
            
        }
    }
    
}
