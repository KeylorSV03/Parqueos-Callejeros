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
    private LocalDateTime[] horario = new LocalDateTime[2]; 
}