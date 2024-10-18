package com.mycompany.parqueos.callejeros;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Espacio {
    
    //==================== Atributos ====================

    private int numeroEspacio;
    private boolean  ocupado;
    private Vehiculo vehiculo;
    private List<Vehiculo> historialVehiculos ;
    
    //==================== Metodos ====================
    
    // ------------------- Constructor -------------------
    
    public Espacio(){
        
    }
    
    public Espacio(int numeroEspacio){
        this();numeroEspacio = numeroEspacio;
        this.historialVehiculos = new ArrayList();
        ocupado = false;
        
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

    // ------------------- Getters -------------------
    
    public int getNumeroEspacio() {
        return numeroEspacio;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public List<Vehiculo> getHistorialVehiculos() {
        return historialVehiculos;
    }
    
    
    
    
}
