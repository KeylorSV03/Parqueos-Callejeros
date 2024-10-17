package com.mycompany.parqueos.callejeros;
import java.util.ArrayList;
import java.util.List;
public class Usuario extends Persona{
    
    //==================== Atributos ====================

    private int numeroTarjeta;
    private List<Espacio> historialEspacios;
    private List<Vehiculo> listaVehiculos;

    //==================== Metodos ====================
    
    public Usuario(String nombre, String apellido, int telefono, String correo, String direccionFisica, String idUsuario,String PIN){
        
        super(nombre, apellido, telefono, correo, direccionFisica, idUsuario, PIN);
        this.listaVehiculos = new ArrayList();
        this.historialEspacios = new ArrayList();
        this.numeroTarjeta = 0;
    }
    
    public void aparcar(Vehiculo vehiculo){
        
    }

}
