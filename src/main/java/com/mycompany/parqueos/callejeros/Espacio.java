package com.mycompany.parqueos.callejeros;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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
    private double costo;
    private Estacionamiento estacionamiento;
    private LocalDateTime fechaUso;
    
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
        estacionamiento = ParqueosCallejeros.estacionamiento;
        costo = 0;  
        fechaUso = null;
        
    }
    
    public Espacio(int numeroEspacio, Vehiculo vehiculo, int tiempo, double costo, LocalDateTime fecha){
        this.numeroEspacio = numeroEspacio;
        this.vehiculo = vehiculo;
        this.tiempo = tiempo;
        this.fechaUso = fecha;
        this.costo = costo;
        this.tiempo = tiempo;
        
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

    public void setCosto(double costo){
        this.costo = costo;
    }
    
    public void setFechaUso(LocalDateTime fecha){
        fechaUso = fecha;
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
    
    public double getCosto(){
        return costo;
    }
    
    public LocalDateTime getFechaUso(){
        return fechaUso;
    }
    // ------------------- Otros metodos -------------------
    
    public void agregarHistorialEspacio(Vehiculo vehiculo){
        historialVehiculos.add(vehiculo);
    }
   
    
    
    public String toString(){
        return "Numero de espacio: " + numeroEspacio;
    }
    
    public String toStringNFC(){
        //N:numero espacio
        //F:fecha
        //C:costo
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaUso.format(formatter);
        
        return "Numero de espacio: " + numeroEspacio + "\n" +
                "Fecha de uso: " + fechaFormateada + "\n" +
                "Costo: " + costo + "\n";
    }

}
