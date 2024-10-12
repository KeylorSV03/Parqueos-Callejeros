package com.mycompany.parqueos.callejeros;

import java.time.LocalDate;

public class Multa {
    //==================== Atributos ====================

    private int costo;
    private LocalDate fecha;
    private Vehiculo vehiculo;
    private String detalle;
    private boolean pagado;
    private int numeroMulta;
    
    // ------------------- Setters -------------------
    public void setCosto(int costo) {
    this.costo = costo;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public void setNumeroMulta(int numeroMulta) {
        this.numeroMulta = numeroMulta;
    }

    // ------------------- Getters -------------------
    
    public int getCosto() {
        return costo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getDetalle() {
        return detalle;
    }

    public boolean isPagado() {
        return pagado;
    }

    public int getNumeroMulta() {
        return numeroMulta;
    }
}
