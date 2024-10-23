package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

//==================== Clase ==================== \\.
/**
 * 
 * @author ariel
 */

public class Multa implements Serializable {
    //==================== Atributos ====================

    private int costo;
    private String fecha;
    private String placa;
    private String detalle;
    private boolean pagado;
    private int numeroMulta;
    
    
    /**
     * Constructor 
     * @param costo
     * @param fecha
     * @param placa
     * @param detalle 
     */
    public Multa(int costo, String fecha, String placa, String detalle){
        this.costo = costo;
        this.fecha = fecha;
        this.placa = placa;
        this.detalle = detalle;
        this.pagado = false;
    }
    
    // ------------------- Setters -------------------
    public void setCosto(int costo) {
    this.costo = costo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setVehiculo(String placa) {
        this.placa = placa;
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

    public String getFecha() {
        return fecha;
    }

    public String getPlaca() {
        return placa;
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
