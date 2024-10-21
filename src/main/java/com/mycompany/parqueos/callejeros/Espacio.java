package com.mycompany.parqueos.callejeros;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Espacio implements Serializable{
    
    //==================== Atributos ====================

    private int numeroEspacio;
    private boolean  ocupado;
    private Vehiculo vehiculo;
    private int tiempo;
    private LocalTime horaIngreso;
    private LocalTime horaSalida;
    private List<Vehiculo> historialVehiculos ;
    
    //==================== Metodos ====================
    
    // ------------------- Constructor -------------------
    
    public Espacio(){
        
    }
    
    public Espacio(int numeroEspacio){
        this.numeroEspacio = numeroEspacio;
        this.historialVehiculos = new ArrayList();
        ocupado = false;
        this.vehiculo = null;
        horaIngreso = null;
        horaSalida = null;
        
    }
    // ------------------- Setters -------------------
    
    public void setNumeroEspacio(int numeroEspacio) {
    this.numeroEspacio = numeroEspacio;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setHistorialVehiculos(List<Vehiculo> historialVehiculos) {
        this.historialVehiculos = historialVehiculos;
    }
    
    public void setTiempo(int tiempo){
        this.tiempo = tiempo;
    }
    
    public void setHoraIngreso(LocalTime hora){
        this.horaIngreso = hora;
    }
    
    public void setHoraSalida(LocalTime hora){
        this.horaSalida = hora;
    }

    // ------------------- Getters -------------------
    
    public int getNumeroEspacio() {
        return numeroEspacio;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
    public int gettiempo(){
        return tiempo;
    }

    public List<Vehiculo> getHistorialVehiculos() {
        return historialVehiculos;
    }
    
    public LocalTime getHoraIngreso(){
        return horaIngreso;
    }
    
    public LocalTime getHoraSalida(){
        return horaSalida;
    }
    
    
    // ------------------- Otros metodos -------------------
    
    public void agregarHistorialEspacio(Vehiculo vehiculo){
        historialVehiculos.add(vehiculo);
    }
    
    
}
