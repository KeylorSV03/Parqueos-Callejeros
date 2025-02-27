package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//==================== Clase ==================== \\.


public class Vehiculo implements Serializable{

    //==================== Atributos ====================

    private String placa;
    private String marca;
    private String modelo;
    private Espacio espacio;
    private Usuario propietario;
    private List<Multa> listaMultasActivas;
    private List<Multa> historialMultas;
    private List<Espacio> historialEspacios;

    
    /**
     * constructor
     * @param placa
     * @param marca
     * @param modelo
     * @param propietario 
     */
    public Vehiculo (String placa, String marca, String modelo, Usuario propietario){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.listaMultasActivas = new ArrayList();
        this.historialMultas = new ArrayList();
        this.historialEspacios = new ArrayList();
        this.propietario = propietario;
    }
    
    // ------------------- Setters -------------------
    
    public void setEspacio(Espacio espacio){
        this.espacio = espacio;
    }
    
    public void setMultas(){
        listaMultasActivas.clear();
    }
    
    // ------------------- Getters -------------------
    
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
    
    public Usuario getPropietario(){
        return propietario;
    }
    
    public List<Multa> getMultasActivas(){
        return listaMultasActivas;
    }
    
    public String toString(){
        return marca + " - " + modelo + " - " + placa;
    }
    
    // ------------------- Otros metodos -------------------
    
    /**
     * Agrega un espacio utilizado al historial de los mismo
     * @param espacio el espacio que se agregara al historial
     */
    public void agregarHistorialEspacio(Espacio espacio){
        historialEspacios.add(espacio);
    }
    
    /**
     * agrega multa activa 
     * @param multa 
     */
    public void agregarMulta(Multa multa){
        listaMultasActivas.add(multa);
    }
    
    /**
     * agrega multa al historial
     * @param multas 
     */
    public void agregarHMultas(List<Multa> multas){
        historialMultas.addAll(multas);
    }
    
}
