package com.mycompany.parqueos.callejeros;

import java.time.LocalDateTime;
import java.util.List;

public class Estacionamiento {
    
    //==================== Atributos ====================

    private String nombre;
    private int precioXHora;
    private LocalDateTime tiempoMinimo;
    private int costoMulta;
    private List<Espacio> listaEspacios;
    private List<Multa> historialMultas;
    private List<Espacio> historialEspacios;
    private List<Usuario> listaUsuarios;
    private LocalDateTime[] horario = new LocalDateTime[2]; 
    
    //==================== Metodos ====================
    
    // ------------------- Constructor -------------------
    
    public Estacionamiento(){
        
    }
    
    // ------------------- Setters -------------------
    
    public void setNombre(String nombre) {
    this.nombre = nombre;
}

    public void setPrecioXHora(int precioXHora) {
        this.precioXHora = precioXHora;
    }

    public void setTiempoMinimo(LocalDateTime tiempoMinimo) {
        this.tiempoMinimo = tiempoMinimo;
    }

    public void setCostoMulta(int costoMulta) {
        this.costoMulta = costoMulta;
    }

    public void setListaEspacios(List<Espacio> listaEspacios) {
        this.listaEspacios = listaEspacios;
    }

    public void setHistorialMultas(List<Multa> historialMultas) {
        this.historialMultas = historialMultas;
    }

    public void setHistorialEspacios(List<Espacio> historialEspacios) {
        this.historialEspacios = historialEspacios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public void setHorario(LocalDateTime[] horario) {
        this.horario = horario;
    }

    // ------------------- Getters -------------------
    
    public String getNombre() {
        return nombre;
    }

    public int getPrecioXHora() {
        return precioXHora;
    }

    public LocalDateTime getTiempoMinimo() {
        return tiempoMinimo;
    }

    public int getCostoMulta() {
        return costoMulta;
    }

    public List<Espacio> getListaEspacios() {
        return listaEspacios;
    }

    public List<Multa> getHistorialMultas() {
        return historialMultas;
    }

    public List<Espacio> getHistorialEspacios() {
        return historialEspacios;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public LocalDateTime[] getHorario() {
        return horario;
    }
    
}