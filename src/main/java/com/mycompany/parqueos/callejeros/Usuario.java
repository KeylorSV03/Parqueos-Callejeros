package com.mycompany.parqueos.callejeros;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Usuario extends Persona{
    
    //==================== Atributos ====================

    private int numeroTarjeta;
    private List<Espacio> historialEspacios;
    private List<Vehiculo> listaVehiculos;
    private Estacionamiento estacionamiento;
    private int tiempoGuardado;

    //==================== Metodos ====================
    
    public Usuario(String nombre, String apellido, int telefono, String correo, String direccionFisica,
            String idUsuario,String PIN,Estacionamiento estacionamiento){
        
        super(nombre, apellido, telefono, correo, direccionFisica, idUsuario, PIN);
        this.listaVehiculos = new ArrayList();
        this.historialEspacios = new ArrayList();
        this.numeroTarjeta = 0;
        this.tiempoGuardado = 0;
        this.estacionamiento = estacionamiento;
    }
    
    public List<Vehiculo> getListaVehiculos (){
        return listaVehiculos;
    }
    
    public int getTiempoGuardado(){
        return tiempoGuardado;
    }
    
    public void agregarTiempoGuardado(int tiempo){
        tiempoGuardado += tiempo;
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
    
    
    public void aparcar(Vehiculo vehiculo, int tiempo, int numeroEspacio, JFrame jframe){
        
        
        if(vehiculo.getEspacio() != null){
            JOptionPane.showMessageDialog(jframe, "Este vehiculo ya esta en otro espacio ", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        for(Espacio espacio : estacionamiento.getListaEspacios()){

            if(espacio.getNumeroEspacio() == numeroEspacio){
                
                if(espacio.getOcupado() == false){
                    espacio.setVehiculo(vehiculo);
                    espacio.setOcupado(true);
                    espacio.setInicioParqueo(LocalTime.now());
                    vehiculo.setEspacio(espacio);
                    espacio.setTiempo(tiempo);
                    JOptionPane.showMessageDialog(jframe, "Vehiculo aparcado en el espacio " + espacio.getNumeroEspacio());
                    return;
                }
               
                else{
                    JOptionPane.showMessageDialog(jframe, "El espacio no esta disponible", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                    return;
                }
             
            }
            
        }
        JOptionPane.showMessageDialog(jframe, "No existe el espacio", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
        return;
    }

}
