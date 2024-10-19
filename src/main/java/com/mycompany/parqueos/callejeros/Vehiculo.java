package com.mycompany.parqueos.callejeros;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehiculo implements Serializable{

    //==================== Atributos ====================

    private String placa;
    private String marca;
    private String modelo;
    private Espacio espacio;
    private ArrayList<Multa> listaMultasActivas;
    private ArrayList<Multa> historialMultas;

    public Vehiculo (String placa, String marca, String modelo){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.listaMultasActivas = new ArrayList();
        this.historialMultas = new ArrayList();
    }
    
    public void setEspacio(Espacio espacio){
        this.espacio = espacio;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public Espacio getEspacio(){
        return espacio;
    }
    public String toString(){
        return marca + " - " + modelo + " - " + placa;
    }
    
}
