package com.mycompany.parqueos.callejeros;
import java.util.List;
public class Espacio {
    
    //==================== Atributos ====================

    private String numeroEspacio;
    private boolean  ocupado;
    private Vehiculo vehiculo;
    private List<Vehiculo> historialVehiculos;
    
    // ------------------- Setters -------------------
    
    public void setNumeroEspacio(String numeroEspacio) {
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

    // ------------------- Setters -------------------
    
    public String getNumeroEspacio() {
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
