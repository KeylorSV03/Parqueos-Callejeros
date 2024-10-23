package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.
import java.time.YearMonth;

//==================== Clase ==================== \\.

public class Tarjeta {
    
    //==================== Atributos ====================
    
    private long numeroTarjeta;
    private YearMonth fechaVencimiento;
    private int codigoValidacion;
    
    //==================== Metodos ====================
    
    public Tarjeta(){
        
    }
    
    // ------------------- Constructor -------------------
    
    /**
     * contructor
     * @param numeroTarjeta
     * @param fechaVencimiento
     * @param codigoValidacion 
     */
    public Tarjeta(long numeroTarjeta, YearMonth fechaVencimiento, int codigoValidacion){
        
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoValidacion = codigoValidacion;
    }
    
    // ------------------- Getters -------------------
    
    public long getNumeroTarjeta(){
        return numeroTarjeta;
    }
    
    public YearMonth getFechaVencimiento(){
        return fechaVencimiento;
    }
    
    public int getCodigoValidacion(){
        return codigoValidacion;
    }
    
     
}
