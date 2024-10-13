package com.mycompany.parqueos.callejeros;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Usuario extends Persona{
    
    //==================== Atributos ====================

    private int numeroTarjeta;
    private List<Espacio> historialEspacios;
    private List<Vehiculo> listaVehiculos;

    public Usuario(String nombre, String apellido, int telefono, String correo, String direccionFisica, String PIN, String idUsuario) {
     
        super(nombre, apellido, telefono, correo, direccionFisica, PIN, idUsuario);
        
        // Asignar los valores de los atributos de Usuario
        this.numeroTarjeta = 0; //Se debe cambiar en la configuracion del perfil
        this.historialEspacios = new ArrayList();
        this.listaVehiculos = new ArrayList();
    }

    // ------------------- Setters -------------------
    
    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public void setHistorialEspacios(List<Espacio> historialEspacios) {
        this.historialEspacios = historialEspacios;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    // ------------------- Getters -------------------

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public List<Espacio> getHistorialEspacios() {
        return historialEspacios;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
}
