package com.mycompany.parqueos.callejeros;

public class Administrador extends Persona {
    
    //==================== Atributos ====================
    
    Estacionamiento estacionamiento;
    
    //==================== Metodos ====================
    
    
    public Administrador(String nombre, String apellido, int telefono, String correo, String direccionFisica, String idUsuario,String PIN,Estacionamiento estacionamiento){
        
        super(nombre, apellido, telefono, correo, direccionFisica, PIN, idUsuario);
        this.estacionamiento = estacionamiento; 
    }
    
}
