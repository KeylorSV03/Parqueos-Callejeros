package com.mycompany.parqueos.callejeros;
import java.util.ArrayList;
import java.util.List;
public class Usuario extends Persona{
    
    //==================== Atributos ====================

    private int numeroTarjeta;
    private List<Espacio> historialEspacios;
    private List<Vehiculo> listaVehiculos;
    private Estacionamiento estacionamiento;

    //==================== Metodos ====================
    
    public Usuario(String nombre, String apellido, int telefono, String correo, String direccionFisica,
            String idUsuario,String PIN,Estacionamiento estacionamiento){
        
        super(nombre, apellido, telefono, correo, direccionFisica, idUsuario, PIN);
        this.listaVehiculos = new ArrayList();
        this.historialEspacios = new ArrayList();
        this.numeroTarjeta = 0;
        this.estacionamiento = estacionamiento;
    }
    
    public List<Vehiculo> getListaVehiculos (){
        return listaVehiculos;
    }
    
    public void agregarVehiculo(String placa, String marca, String modelo){
        Vehiculo nuevoVehiculo = new Vehiculo(placa, marca, modelo);
        listaVehiculos.add(nuevoVehiculo);
    }
    
    public void eliminarVehiculo(Vehiculo vehiculo){
        listaVehiculos.remove(vehiculo);
    }
    
    
    public Vehiculo buscarVehiculo(int indice){
        if (listaVehiculos == null){
            return null;
        }
        int contador = 0;
        for (Vehiculo vehiculo: listaVehiculos){
            if (contador == indice){
                return vehiculo;
            }
            contador++;
        }
        return null;
    }
    
    public boolean buscarVehiculoXP(String placa){
        if (listaVehiculos == null){
            return false;
        }
        for (Vehiculo vehiculo: listaVehiculos){
            if (vehiculo.getPlaca().equals(placa)){
                return true;
            } 
        }
        return false;
    }
    
    public Vehiculo buscarVehiculoReturn(String placa){
        if (listaVehiculos == null){
            return null;
        }
        for (Vehiculo vehiculo: listaVehiculos){
            if (vehiculo.getPlaca().equals(placa)){
                return vehiculo;
            } 
        }
        return null;
    }
    
    
    public void aparcar(String placa){
        
        Vehiculo vehiculo = buscarVehiculoReturn(placa);
        
        for(Espacio espacio : estacionamiento.getListaEspacios()){
            if(espacio.getVehiculo() == null){
                
            }
        }
        
    }

}
