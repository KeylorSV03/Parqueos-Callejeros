
package com.mycompany.parqueos.callejeros;
import java.time.YearMonth;


public class Tarjeta {
    
    //==================== Atributos ====================
    
    private long numeroTarjeta;
    private YearMonth fechaVencimiento;
    private int codigoValidacion;
    
    //==================== Metodos ====================
    
    public Tarjeta(){
        
    }
    
    // ------------------- Constructor -------------------
    
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
