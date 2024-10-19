package com.mycompany.parqueos.callejeros;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Inspector extends  Persona implements Serializable{
    
    //==================== Atributos ====================

    private List<Multa> listaMultas;
    private Estacionamiento estacionamiento;
    
    //==================== Metodos ====================
    
    // ------------------- Constructores -------------------
    
    public Inspector(String nombre, String apellido, int telefono, String correo, String direccionFisica, String idUsuario,String PIN,Estacionamiento estacionamiento){
        
        super(nombre, apellido, telefono, correo, direccionFisica, idUsuario, PIN);
        this.listaMultas = new ArrayList();
    }
}
