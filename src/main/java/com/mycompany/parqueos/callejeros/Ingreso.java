/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parqueos.callejeros;

import java.time.LocalDateTime;

/**
 *
 * @author keylo
 */
class Ingreso {
    private LocalDateTime fecha;
    private int monto;
    private int numeroEspacio;

    // Constructor, getters y setters
    
    public Ingreso(LocalDateTime fecha,int monto, int numeroEspacio ){
        this.fecha = fecha;
        this.monto = monto;
        this.numeroEspacio = numeroEspacio;
    }
}
